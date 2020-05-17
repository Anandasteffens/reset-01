package com.example.demo.dominioclasses;

import com.example.demo.DTO.AssociadoDTO;

public class Associado {

    private int id;
    private String nome;

    public Associado(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static AssociadoDTO toDTO (Associado associado){
        return new AssociadoDTO(associado.getNome(), associado.getId());}
}
