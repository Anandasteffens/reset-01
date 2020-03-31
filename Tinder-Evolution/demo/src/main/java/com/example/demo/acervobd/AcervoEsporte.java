package com.example.demo.acervobd;

import com.example.demo.dominioclasses.Esporte;

import java.util.ArrayList;
import java.util.List;

public class AcervoEsporte {

    private static int contador = +1;
    private static List<Esporte> esportes = new ArrayList<>();

    public AcervoEsporte(){
        cadastrar(new Esporte(1 ,"Volei"));
        cadastrar(new Esporte(2, "Futebol"));
        cadastrar(new Esporte(3, "Basquete"));
    }

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

    public Esporte editar (int id, Esporte esporte){
        Esporte editarEsporte = this.pesquisar(id);
        if (editarEsporte != null){
            editarEsporte.setNome(esporte.getNome());
            return editarEsporte;
        }
        return null;
    }
}
