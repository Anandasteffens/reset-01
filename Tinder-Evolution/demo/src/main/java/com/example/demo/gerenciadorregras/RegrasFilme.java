package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoFilmes;
import com.example.demo.dominioclasses.Filme;

import java.time.LocalDate;
import java.util.List;

public class RegrasFilme {
    private AcervoFilmes acervo = new AcervoFilmes();

    public Filme cadastrar(Filme filme) {
        List<Filme> filmes = acervo.listar();
        if (filme.getNome().isEmpty() || filme.getDiretor().isEmpty() || filme.getCategoria() == null || filme.getSinopse().isEmpty() || filme.getDataLancamento() == null) {
            System.out.println("Campos de preenchimento obrigatórios não informados");
            return null;
        }
        for (Filme filmeExiste : filmes) {
            if (filme.getNome().equals(filmeExiste.getNome())) {
                return filmeExiste;
            }
            if (filme.getDataLancamento().isAfter(LocalDate.now())) {
                return null;
            }
        }
        return acervo.cadastrar(filme);
    }

    public List<Filme> listar (){
            return acervo.listar();
    }

    public Filme pesquisar (int id){
        if (id >0){
            return acervo.pesquisar(id);
        }
        return null;
    }

    public Filme editar (int id, Filme filme) {
        if (id > 0) {
            return acervo.editar(id, filme);
        }
        return null;
    }

    public boolean deletar (int id){
        if (id >0){
            return acervo.deletar(id);
        }
        return false;
    }

}

