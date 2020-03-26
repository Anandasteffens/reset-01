package dominioclasses;

import java.time.LocalDate;

public class Filme {

    private int id;
    private String nome;
    private String diretor;
    private LocalDate dataLancamento;
    private CategoriaFilme categoria;
    private String sinopse;

    public Filme(String nome, String diretor, LocalDate dataLancamento, CategoriaFilme categoria, String sinopse) {
        this.nome = nome;
        this.diretor = diretor;
        this.dataLancamento = dataLancamento;
        this.categoria = categoria;
        this.sinopse = sinopse;
    }

    public int getId (){ return this.id;}

    public void setId (int id) {this.id = id;}

    public String getNome () { return this.nome;}

    public void setNome (String nome) {this.nome = nome;}

    public String getDiretor (){return this.diretor;}

    public void setDiretor (String diretor) {this.diretor=diretor;}

    public LocalDate getDataLancamento (){ return this.dataLancamento;}

    public void setDataLancamento (LocalDate dataLancamento) {this.dataLancamento=dataLancamento;}

    public CategoriaFilme getCategoria() { return this.categoria;}

    public void setCategoria (CategoriaFilme categoria) {this.categoria=categoria;}

    public String getSinopse (){return this.sinopse;}

    public void setSinopse (String sinopse){ this.sinopse=sinopse;}

    @Override
    public String toString() {
        return "Filme{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", diretor='" + diretor + '\'' +
                ", dataLancamento=" + dataLancamento +
                ", categoria=" + categoria +
                ", sinopse='" + sinopse + '\'' +
                '}';
    }
}
