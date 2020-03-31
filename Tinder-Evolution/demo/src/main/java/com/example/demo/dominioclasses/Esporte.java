package com.example.demo.dominioclasses;

public class Esporte {
    private int id;
    private String nome;

    public Esporte(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId (){return this.id;}

    public void setId (int id) {this.id = id;}

    public String getNome() { return nome;}

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Esporte - " + "ID: " + id + ", nome: " + nome + '.';
    }
}
