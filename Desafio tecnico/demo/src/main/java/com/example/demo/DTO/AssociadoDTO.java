package com.example.demo.DTO;

import com.example.demo.dominioclasses.Associado;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Associado toEndity (AssociadoDTO dTO){
        return new Associado(dTO.getNome(), dTO.getId());}

}
