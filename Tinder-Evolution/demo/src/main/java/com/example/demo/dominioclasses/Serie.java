package com.example.demo.dominioclasses;

import java.time.LocalDate;

public class Serie {

    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataLancamento;
    private int numeroTemporadas;
    private int numeroEpisodios;
    private CategoriaSerie categoriaSerie;
    private String sinopse;

    public Serie(String nome, String diretor, LocalDate dataLancamento, int numeroTemporadas, int numeroEpisodios, CategoriaSerie categoriaSerie, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataLancamento = dataLancamento;
        this.numeroTemporadas = numeroTemporadas;
        this.numeroEpisodios = numeroEpisodios;
        this.categoriaSerie = categoriaSerie;
        this.sinopse = sinopse;
    }

    public int getId(){return this.id;}

    public void setId (int id){ this.id = id;}

    public String getNome (){return this.nome;}

    public void setNome (String nome){this.nome = nome;}

    public String getDiretor (){return this.diretor;}

    public void setDiretor (String diretor){this.diretor=diretor;}

    public LocalDate getDataLancamento (){return this.dataLancamento;}

    public void setDataLancamento (LocalDate dataLancamento){this.dataLancamento=dataLancamento;}

    public int getNumeroTemporadas (){return this.numeroTemporadas;}

    public void setNumeroTemporadas (int numeroTemporadas){this.numeroTemporadas=numeroTemporadas;}

    public int getNumeroEpisodios (){return this.numeroEpisodios;}

    public void setNumeroEpisodios(int numeroEpisodios){this.numeroEpisodios=numeroEpisodios;}

    public CategoriaSerie getCategoriaSerie (){ return this.categoriaSerie;}

    public void setCategoriaSerie (CategoriaSerie categoriaSerie){this.categoriaSerie=categoriaSerie;}

    public String getSinopse (){return this.sinopse;}

    public void setSinopse(String sinopse){ this.sinopse=sinopse;}

    @Override
    public String toString() {
        return "Série - " + "ID: " + id + ", nome: " + nome + ", diretor: " + diretor + ", data lançamento: " + dataLancamento + ", numero de temporadas: " + numeroTemporadas +
                ", numero de episódios: " + numeroEpisodios + ", categoria da série:" + categoriaSerie + ", sinopse: " + sinopse + '.';
    }
}
