package com.example.demo.dominioclasses;

import java.time.LocalDate;

public class Jogo {

    private int id;
    private String nome;
    private String publisher;
    private LocalDate dataLancamento;
    private CategoriaJogo categoriaJogo;
    private PlataformaJogo plataformaJogo;

    public Jogo(String nome, String publisher, LocalDate dataLancamento, CategoriaJogo categoriaJogo, PlataformaJogo plataformaJogo) {
        this.nome = nome;
        this.publisher = publisher;
        this.dataLancamento = dataLancamento;
        this.categoriaJogo = categoriaJogo;
        this.plataformaJogo = plataformaJogo;
    }

    public int getId (){ return this.id;}

    public void setId (int id){this.id=id;}

    public String getNome (){return this.nome;}

    public void setNome (String nome){ this.nome = nome;}

    public String getPublisher (){ return this.publisher;}

    public void setPublisher (String publisher){ this.publisher=publisher;}

    public LocalDate getDataLancamento (){return this.dataLancamento;}

    public void setDataLancamento (LocalDate dataLancamento){ this.dataLancamento=dataLancamento;}

    public CategoriaJogo getCategoriaJogo (){return this.categoriaJogo;}

    public void setCategoriaJogo (CategoriaJogo categoriaJogo){this.categoriaJogo=categoriaJogo;}

    public PlataformaJogo getPlataformaJogo() { return this.plataformaJogo;}

    public void setPlataformaJogo (PlataformaJogo plataformaJogo){this.plataformaJogo=plataformaJogo;}

    @Override
    public String toString() {
        return "Jogo - " + "ID: " + id + ", nome: " + nome + ", publisher: " + publisher + ", data de lançamento: " + dataLancamento + ", categoria do jogo: " + categoriaJogo + ", plataforma do jogo: " + plataformaJogo + '.';
    }
}
