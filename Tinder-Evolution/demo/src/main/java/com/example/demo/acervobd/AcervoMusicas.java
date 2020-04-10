package com.example.demo.acervobd;

import com.example.demo.dominioclasses.EstiloMusica;
import com.example.demo.dominioclasses.Musica;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class AcervoMusicas {

    private static int contador = +1;
    private static List<Musica> musicas = new ArrayList<>();

    public AcervoMusicas(){
//        criar(new Musica("Hit Contagiante", "Kevin o Chris", LocalDate.now(), EstiloMusica.FUNK));
//        criar(new Musica("Vai menina", "Pedro Sampaio", LocalDate.now(), EstiloMusica.FUNK));
//        criar(new Musica("Tudo Ok", "Thiaguinho MT", LocalDate.now(), EstiloMusica.FUNK));
//        criar(new Musica("Choram as rosas", "Bruno e Marrone", LocalDate.now(), EstiloMusica.SERTANEJO));
//        criar(new Musica("Fugidinha", "Exaltasamba", LocalDate.now(), EstiloMusica.PAGODE));
//        criar(new Musica("Duality", "Slipknot", LocalDate.now(), EstiloMusica.ROCK));
    }

    public Musica criar(Musica musica) {
        musica.setId(contador++);
        musicas.add(musica);
        return musica;
    }

    public List<Musica> listar() {
        return musicas;
    }

    public Musica pesquisar(int id) {

        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;
            }
        }
        return null;
    }

    public boolean deletar(int id) {
        Musica deletarMusica = this.pesquisar(id);
        if (deletarMusica != null) {
            return musicas.remove(deletarMusica);
        }
        return false;
    }

    public Musica editar(int id, Musica musica) {
        Musica editarMusica = this.pesquisar(id);
        if (editarMusica != null) {
            editarMusica.setNome(musica.getNome());
            editarMusica.setAutor(musica.getAutor());
            editarMusica.setDataLancamento(musica.getDataLancamento());
            editarMusica.setEstilo(musica.getEstilo());
            return editarMusica;
        }
        return null;
    }
}

