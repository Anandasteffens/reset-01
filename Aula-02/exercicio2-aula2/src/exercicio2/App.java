package exercicio2;

public class App {
    public static void main(String[] args) {

        Livro livro1 = new Livro (Categoria.SUSPENSE, "A garota do lago", "Charlie Donlea", Status.DISPONIVEL);
        Livro livro2 = new Livro(Categoria.ROMANCE, "Diario de uma paixao", "Nicolas Sparks", Status.EMPRESTADO);
        Livro livro3 = new Livro(Categoria.FANTASIA, "Harry Pottter", "J K Rowling", Status.DISPONIVEL);
        Livro livro4 = new Livro(Categoria.TERROR, "IT", "Stephen King", Status.EM_USO);

        System.out.println(livro1.categoria+ " - " +livro1.titulo+ " ("+ livro1.autor+"): "+livro1.status);
        System.out.println(livro2.categoria+ " - " +livro2.titulo+ " ("+ livro2.autor+"): "+livro2.status);
        System.out.println(livro3.categoria+ " - " +livro3.titulo+ " ("+ livro3.autor+"): "+livro3.status);
        System.out.println(livro4.categoria+ " - " +livro4.titulo+ " ("+ livro4.autor+"): "+livro4.status);
    }
}
