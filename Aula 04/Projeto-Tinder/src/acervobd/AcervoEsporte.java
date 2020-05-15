package acervobd;

import dominioclasses.Esporte;

import java.util.ArrayList;
import java.util.List;

public class AcervoEsporte {

    private static int contador = +1;
    private static List<Esporte> esportes = new ArrayList<>();

    public Esporte cadastrar (Esporte esporte){
        esporte.setId(contador++);
        esportes.add(esporte);
        return esporte;
    }

    public List<Esporte> listar (){
        if (esportes == null){
            return null;
        }
        else {return esportes;}

    }

    public Esporte pesquisar (int id){
        for (Esporte esporte : esportes){
            if (esporte.getId()==id){
                return esporte;
            }
        }
        return null;
    }

    public boolean deletar (int id){
        Esporte deletarEsporte = this.pesquisar(id);
        if ( deletarEsporte != null){
            return esportes.remove(deletarEsporte);
        }
        return false;
    }

    public boolean editar (int id, Esporte esporte){
        Esporte editarEsporte = this.pesquisar(id);
        if (editarEsporte != null){
            esporte.setId(id);
            int a = esportes.indexOf(editarEsporte);
            esportes.set(a, esporte);
        }
        return false;
    }
}
