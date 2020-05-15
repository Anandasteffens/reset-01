package com.example.demo.acervobd;

import com.example.demo.dominioclasses.Associado;
import com.example.demo.dominioclasses.Pauta;

import java.util.ArrayList;
import java.util.List;

public class AcervoPauta {
    private static int contador = +1;
    private static List<Pauta> pautas = new ArrayList<>();

    public Pauta cadastrar (Pauta pauta){
        pauta.setId(contador++);
        pautas.add(pauta);
        return pauta;
    }
    public List<Pauta> listar () {return pautas;}

    public Pauta pesquisar (int idPauta){
        for (Pauta pauta : pautas){
            if ( idPauta == pauta.getId()){
                return pauta;
            }
        }
        return null;
    }
}
