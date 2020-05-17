package com.example.demo.repository;

import com.example.demo.dominio.Associado;

import java.util.ArrayList;
import java.util.List;

public class AssociadoRepository {

    private static int contador = +1;
    private static List<Associado> associados = new ArrayList<>();

    public Associado cadastrar (Associado associado){
        associado.setId(contador++);
        associados.add(associado);
        return associado;
    }

    public List<Associado> listar () {return associados;}

    public Associado pesquisar (int id){
        for (Associado associado : associados){
            if ( id == associado.getId()){
                return associado;
            }
        }
        return null;
    }

}




