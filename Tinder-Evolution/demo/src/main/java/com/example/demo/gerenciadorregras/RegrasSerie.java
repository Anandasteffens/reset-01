package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoSeries;
import com.example.demo.dominioclasses.Serie;

import java.time.LocalDate;
import java.util.List;

public class RegrasSerie {

    AcervoSeries acervoSeries = new AcervoSeries();

    public Serie cadastrar (Serie serie){
        List<Serie> series = acervoSeries.listar();
        if (serie.getNome().isEmpty() || serie.getDiretor().isEmpty() || serie.getDataLancamento()==null || serie.getNumeroTemporadas() ==0 || serie.getNumeroEpisodios()==0 || serie.getCategoriaSerie()==null || serie.getSinopse().isEmpty()){
            System.out.println("Campos de preenchimento obrigatórios não informados.");
            return null;
        }
        for (Serie serieExiste : series){
            if (serie.getNome().equals(serieExiste)){
                return serieExiste;
            }
            if (serie.getDataLancamento().isAfter(LocalDate.now())){
                return null;
            }
            if (serie.getNumeroEpisodios()<1){
                return null;
            }
            if (serie.getNumeroTemporadas()<1){
                return null;
            }
        }
        return acervoSeries.cadastrar(serie);
    }

    public List<Serie> listar (){
        return acervoSeries.listar();
    }

    public Serie pesquisar (int id){
        if (id >0){
            return acervoSeries.pesquisar(id);
        }
        return null;
    }
    public Serie editar (int id, Serie serie){
        if (id>0){
            return acervoSeries.editar(id, serie);
        }
        return null;
    }

    public boolean deletar (int id){
        if (id>0){
            return acervoSeries.deletar(id);
        }
        return false;
    }



}
