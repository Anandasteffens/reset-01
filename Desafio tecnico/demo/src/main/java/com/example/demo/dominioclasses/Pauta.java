package com.example.demo.dominioclasses;

import java.util.ArrayList;
import java.util.List;

public class Pauta {
    private int id;
    private String assunto;
    private List<Boolean> listaVotos = new ArrayList<>();

    public Pauta(String assunto) {
        this.assunto = assunto;
    }

    public Pauta (){};

    public int getId() {return id;}

    public void setId(int id) {this.id = id;}

    public String getAssunto() {return assunto;}

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public void votar(Voto voto){
      listaVotos.add(voto.getVoto());
    }

}
