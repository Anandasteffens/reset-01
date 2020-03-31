package com.example.demo.dominioclasses;

public class Curiosidade {

    private int id;
    private String descricao;
    private CategoriaCuriosidade categoriaCuriosidade;

    public Curiosidade(String descricao, CategoriaCuriosidade categoriaCuriosidade) {
        this.descricao = descricao;
        this.categoriaCuriosidade = categoriaCuriosidade;
    }

    public int getId (){ return this.id;}

    public void setId(int id){this.id = id;}

    public String getDescricao (){return this.descricao;}

    public void setDescricao (String descricao){this.descricao=descricao;}

    public CategoriaCuriosidade getCategoriaCuriosidade() {return categoriaCuriosidade;}

    public void setCategoriaCuriosidade (CategoriaCuriosidade categoriaCuriosidade){this.categoriaCuriosidade=categoriaCuriosidade; }

    @Override
    public String toString() {
        return "Curiosidade - " + "ID: " + id + ", descrição: " + descricao + ", categoria da curiosidade:" + categoriaCuriosidade + '.';
    }
}

