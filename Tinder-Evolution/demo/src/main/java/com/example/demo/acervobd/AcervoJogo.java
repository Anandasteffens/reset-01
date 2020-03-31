package com.example.demo.acervobd;

import com.example.demo.dominioclasses.CategoriaJogo;
import com.example.demo.dominioclasses.Jogo;
import com.example.demo.dominioclasses.PlataformaJogo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcervoJogo {

    private static int contador = +1;
    private static List<Jogo> jogos = new ArrayList<>();

    public AcervoJogo (){
        cadastrar(new Jogo ("CS", "VALVE", LocalDate.now(), CategoriaJogo.SUSPENSE, PlataformaJogo.PC ));
        cadastrar(new Jogo ("LOL", "NAO SEI", LocalDate.now(), CategoriaJogo.ACAO, PlataformaJogo.PC ));
        cadastrar(new Jogo ("MARIO KART", "Nintendo", LocalDate.now(), CategoriaJogo.ACAO, PlataformaJogo.PS4 ));
    }

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

    public Jogo editar (int id, Jogo jogo){
        Jogo editarJogo = this.pesquisar(id);
        if (editarJogo != null){
         editarJogo.setNome(jogo.getNome());
         editarJogo.setPublisher(jogo.getPublisher());
         editarJogo.setDataLancamento(jogo.getDataLancamento());
         editarJogo.setCategoriaJogo(jogo.getCategoriaJogo());
         editarJogo.setPlataformaJogo(jogo.getPlataformaJogo());
         return editarJogo;
        }
        return null;
    }

    public boolean deletar (int id){
        Jogo deltarJogo = this.pesquisar(id);
        if (deltarJogo != null){
            return jogos.remove(deltarJogo);
        }
        return false;
    }
}

