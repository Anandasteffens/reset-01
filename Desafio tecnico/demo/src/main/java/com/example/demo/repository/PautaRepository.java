package com.example.demo.repository;

import com.example.demo.dominio.Pauta;

import java.util.ArrayList;
import java.util.List;

public class PautaRepository {
    private static int contador = +1;
    private static List<Pauta> pautas = new ArrayList<>();

    /**
     * Método cria a pauta e adiciona ela na lista de pautas
     * @param pauta @{@link Pauta}
     * @return @{@link Pauta}
     */
    public Pauta cadastrar (Pauta pauta){
        pauta.setId(contador++);
        pautas.add(pauta);
        return pauta;
    }

    public List<Pauta> listar () {return pautas;}

    /**
     * Através do id informado realiza a pesquisa dessa pauta na lista de pautas.
     * @param idPauta @{@link Pauta}
     * @return @{@link Pauta}
     */
    public Pauta pesquisar (int idPauta){
        for (Pauta pauta : pautas){
            if ( idPauta == pauta.getId()){
                return pauta;
            }
        }
        return null;
    }
}
