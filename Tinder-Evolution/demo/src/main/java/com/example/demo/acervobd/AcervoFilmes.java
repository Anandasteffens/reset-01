package com.example.demo.acervobd;

import com.example.demo.dominioclasses.CategoriaFilme;
import com.example.demo.dominioclasses.Filme;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcervoFilmes {

    private static int contador = +1;
    private static List<Filme> filmes = new ArrayList<>();

    public AcervoFilmes (){
//        cadastrar(new Filme("Titanic", "James Camaron", LocalDate.now(), CategoriaFilme.DRAMA, "Barco afunda"));
//        cadastrar(new Filme("Velozes e furiosos", "Rob Coehn", LocalDate.now(), CategoriaFilme.ACAO, "Loucura"));
//        cadastrar(new Filme("Jogos Mortais", "Jamas Wan", LocalDate.now(), CategoriaFilme.TERROR, "Todo mundo morre"));
    }

    public Filme cadastrar (Filme filme){
        filme.setId(contador++);
        filmes.add(filme);
        return filme;
    }

    public List<Filme> listar (){
        return filmes;
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

    public Filme editar (int id, Filme filme){
        Filme editarFilme = this.pesquisar(id);{
            editarFilme.setNome(filme.getNome());
            editarFilme.setDiretor(filme.getDiretor());
            editarFilme.setDataLancamento(filme.getDataLancamento());
            editarFilme.setCategoria(filme.getCategoria());
            editarFilme.setSinopse(filme.getSinopse());
            return editarFilme;
            }
    }
}
