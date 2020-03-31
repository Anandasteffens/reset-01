package com.example.demo.acervobd;

import com.example.demo.dominioclasses.CategoriaSerie;
import com.example.demo.dominioclasses.Serie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcervoSeries {

    private static int contador = +1;
    private static List<Serie> series = new ArrayList<>();

    public AcervoSeries (){
        cadastrar(new Serie ("Elite", "Carlos Montero", LocalDate.now(), 3, 24, CategoriaSerie.SUSPENSE, "Bem legal"));
        cadastrar(new Serie ("La casa de papel", "Alex pina", LocalDate.now(), 3, 24, CategoriaSerie.ACAO, "Show"));
        cadastrar(new Serie ("Gossip Girl", "Josh", LocalDate.now(), 6, 121, CategoriaSerie.DRAMA, "Amoo"));
    }

    public Serie cadastrar (Serie serie){
        serie.setId(contador++);
        series.add(serie);
        return serie;
    }

    public List<Serie> listar (){
        if (series == null){
            return null;
        }
        else {return series;}
    }

    public Serie pesquisar (int id){
        for (Serie serie : series){
            if (serie.getId()==id){
                return serie;
            }
        }
        return null;
    }

    public Serie editar (int id, Serie serie){
        Serie editarSerie = this.pesquisar(id);
        if (editarSerie != null){
            editarSerie.setNome(serie.getNome());
            editarSerie.setDiretor(serie.getDiretor());
            editarSerie.setDataLancamento(serie.getDataLancamento());
            editarSerie.setNumeroTemporadas(serie.getNumeroTemporadas());
            editarSerie.setNumeroEpisodios(serie.getNumeroEpisodios());
            editarSerie.setSinopse(serie.getSinopse());
            editarSerie.setCategoriaSerie(serie.getCategoriaSerie());
            return editarSerie;


        }
        return null;
    }

    public boolean deletar (int id){
        Serie deletarSerie = this.pesquisar(id);
        if (deletarSerie != null){
          return series.remove(deletarSerie);
        }
        return false;
    }


}
