package exercicio2;

public class Livro {
    Categoria categoria;
    String titulo;
    String autor;
    Status status;

    public Livro (Categoria categoria, String titulo, String autor, Status status){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.status=status;
    }

}
