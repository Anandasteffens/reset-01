package acervobd;

import dominioclasses.Filme;

import java.util.ArrayList;
import java.util.List;

public class AcervoFilmes {

    private static int contador = +1;
    private static List<Filme> filmes = new ArrayList<>();

    public Filme cadastrar (Filme filme){
        filme.setId(contador++);
        filmes.add(filme);
        return filme;
    }

    public List<Filme> listar (){
        if (filmes == null){
            return null;
        }
        else {return filmes;}
    }

    public Filme pesquisar (int id){
        for (Filme filme : filmes){
            if (filme.getId() == id){
                return filme;
            }
        }
        return null;
    }

    public boolean deletar (int id){
        Filme deletarFilme = this.pesquisar(id);
        if (deletarFilme != null){
            return filmes.remove(deletarFilme);
        }
        return false;
    }

    public boolean editar (int id, Filme filme){
        Filme editarFilme = this.pesquisar(id);{
            if (editarFilme != null){
                filme.setId(id);
                int a = filmes.indexOf(editarFilme);
                filmes.set(a, filme);
            }
        }
        return false;
    }
}
