package acervobd;

import dominioclasses.Jogo;
import dominioclasses.Serie;

import java.util.ArrayList;
import java.util.List;

public class AcervoSeries {

    private static int contador = +1;
    private static List<Serie> series = new ArrayList<>();

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

    public boolean editar (int id, Serie serie){
        Serie editarSerie = this.pesquisar(id);
        if (editarSerie != null){
            serie.setId(id);
            int a = series.indexOf(editarSerie);
            series.set(a, serie);
        }
        return false;
    }

    public boolean deletar (int id){
        Serie deletarSerie = this.pesquisar(id);
        if (deletarSerie != null){
          return series.remove(deletarSerie);
        }
        return false;
    }


}
