package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoMusicas;
import com.example.demo.dominioclasses.Musica;

import java.time.LocalDate;
import java.util.List;

public class RegrasMusica {

    private AcervoMusicas acervo = new AcervoMusicas();

    public Musica criar(Musica musica) {
        List<Musica> musicas = acervo.listar();
        if (musica.getNome().isEmpty() || musica.getAutor().isEmpty() || musica.getEstilo() == null || musica.getDataLancamento() == null) {
            System.out.println("Campos de preenchimento obrigatórios não informados");
            return null;
        }
        for (Musica musicaExiste : musicas) {
            if (musica.getNome().equals(musicaExiste.getNome())) {
                return musicaExiste;
            }
            if (musica.getDataLancamento().isAfter(LocalDate.now())) {
                return null;
            }
        }
        return acervo.criar(musica);
    }

    public List<Musica> listar (){
        return acervo.listar();
    }

    public Musica pesquisar (int id){
        if (id > 0 ){
            return acervo.pesquisar(id);
        }
        return null;

    }
    public Musica editar (int id, Musica musica){
        if (id > 0){
            return acervo.editar(id, musica);
        }
        return null;
    }
    public boolean deletar (int id){
        if (id > 0 ){
            return acervo.deletar(id);
        }
        return false;
    }

}

