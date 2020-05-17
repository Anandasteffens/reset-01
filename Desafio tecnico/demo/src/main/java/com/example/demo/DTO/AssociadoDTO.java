package com.example.demo.DTO;

import com.example.demo.dominio.Associado;

public class AssociadoDTO {

    private int id;
    private String nome;

    public AssociadoDTO(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public AssociadoDTO() {
    }

    public String getNome() {
        return nome;
    }


    public int getId() {
        return id;
    }


    public static Associado toEndity (AssociadoDTO dTO){
        return new Associado(dTO.getNome(), dTO.getId());}

}
