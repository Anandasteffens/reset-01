package acervobd;

import dominioclasses.Jogo;

import java.util.ArrayList;
import java.util.List;

public class AcervoJogo {

    private static int contador = +1;
    private static List<Jogo> jogos = new ArrayList<>();

    public Jogo cadastrar(Jogo jogo) {
        jogo.setId(contador++);
        jogos.add(jogo);
        return jogo;
    }

    public Jogo pesquisar(int id) {
        for (Jogo jogo : jogos) {
            if (jogo.getId() == id) {
                return jogo;
            }
        }
        return null;
    }


    public List<Jogo> listar (){
        if (jogos == null){
            return null;
        }
        else {
            return jogos;
        }
    }

    public boolean editar (int id, Jogo jogo){
        Jogo editarJogo = this.pesquisar(id);
        if (editarJogo != null){
            int a = jogos.indexOf(editarJogo);
            jogos.set(a, editarJogo);
        }
        return false;
    }

    public boolean deletar (int id){
        Jogo deltarJogo = this.pesquisar(id);
        if (deltarJogo != null){
            return jogos.remove(deltarJogo);
        }
        return false;
    }
}

