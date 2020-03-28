package dominioclasses;

import java.time.LocalDate;

public class Musica {
    private int id;

    private String nome;

    private String autor;

    private LocalDate dataLancamento;

    private EstiloMusica estilo;

    public Musica(String nome, String autor, LocalDate dataLancamento, EstiloMusica estilo) {
        this.nome = nome;
        this.autor = autor;
        this.dataLancamento = dataLancamento;
        this.estilo = estilo;
    }

    public int getId(){
        return id;
    }

    public void setId (final int id){
        this.id = id;
    }

    public String getNome (){
        return nome;
    }

    public void setNome (String nome){
        this.nome = nome;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public LocalDate getDataLancamento(){
        return dataLancamento;
    }

    public void setDataLancamento(){
        this.dataLancamento = dataLancamento;
    }

    public EstiloMusica getEstilo() {
        return estilo;
    }

    public void setEstilo(){
        this.estilo=estilo;
    }

    @Override
    public String toString() {
        return "Musica -" + "ID:" + id + ", nome:'" + nome + ", autor: " + autor + ", data de laçamento:" + dataLancamento + ", estilo musical:" + estilo + '.';
    }
}
