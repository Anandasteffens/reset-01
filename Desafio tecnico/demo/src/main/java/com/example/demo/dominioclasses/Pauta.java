package com.example.demo.dominioclasses;

import com.example.demo.acervobd.AcervoAssociado;

import java.util.ArrayList;
import java.util.List;

public class Pauta {
    private int id;
    private String assunto;
    private List<Voto> listaVotos = new ArrayList<>();
    private AcervoAssociado acervoAssociado = new AcervoAssociado();

    public Pauta(String assunto) {
        this.assunto = assunto;
    }

    public Pauta (){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public List<Voto> getListaVotos() {
        return listaVotos;
    }

    public void setListaVotos(List<Voto> listaVotos) {
        this.listaVotos = listaVotos;
    }

    public void votar(Voto voto){
        listaVotos.add(voto);
    }

    public boolean associadoPodeVotar (int idAssociado){
        for (Voto voto : listaVotos){
                if (voto.getIdAssociado().equals(idAssociado)){
                    return false;
                }
            }
        return true;
    }

}

