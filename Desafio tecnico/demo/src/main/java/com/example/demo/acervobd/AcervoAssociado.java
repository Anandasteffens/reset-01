package com.example.demo.acervobd;

import com.example.demo.dominioclasses.Associado;
import com.example.demo.dominioclasses.Pauta;
import com.example.demo.dominioclasses.Voto;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.ArrayList;
import java.util.List;

public class AcervoAssociado {

    private static int contador = +1;
    private static List<Associado> associados = new ArrayList<>();

    public Associado cadastrar (Associado associado){
        associado.setId(contador++);
        associados.add(associado);
        return associado;
    }

    public List<Associado> listar () {return new ArrayList<Associado>(associados);}

    public Associado pesquisar (int id){
        for (Associado associado : associados){
            if ( id == associado.getId()){
                return associado;
            }
        }
        return null;
    }

}




