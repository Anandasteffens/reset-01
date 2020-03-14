package exercicio2;

public class Livro {
    Categoria categoria; //do tipo do enun que for criado;
    String titulo;
    String autor;
    Status status; //do tipo do enum que for criado;

    public Livro (Categoria categoria, String titulo, String autor, Status status){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.status=status;
    }

    // criar metodo para imprimir e não precisar colocar repetido.

    public void imprimir (){
        System.out.println(categoria.getDescricao()+ " - "+titulo+ " ("+autor+") "+status.getDescricao());
    }

}
