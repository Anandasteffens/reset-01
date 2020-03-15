package ExercicioTres;

public class AplicacaoAluno {
    public static void main(String[] args) {

        Aluno aluno = new Aluno("Ananda", 6);
        System.out.println("O nome do aluno é: " +aluno.nome);
        System.out.println("A nota do aluno é: " +aluno.nota);
        boolean aprovar = aluno.aprovacao();
        System.out.println("Aluno aprovado: " +aprovar);

        aluno = new Aluno("Wagner", 7);
        System.out.println("O nome do aluno é: " +aluno.nome);
        System.out.println("A nota do aluno é: " +aluno.nota);
        System.out.println("Aluno aprovado: " +aluno.aprovacao());

        aluno = new Aluno("Pedro", 10);
        System.out.println("O nome do aluno é: " +aluno.nome);
        System.out.println("A nota do aluno é: " +aluno.nota);
        System.out.println("Aluno aprovado: " +aluno.aprovacao());

        aluno = new Aluno("João", 4);
        System.out.println("O nome do aluno é: " +aluno.nome);
        System.out.println("A nota do aluno é: " +aluno.nota);
        System.out.println("Aluno aprovado: " +aluno.aprovacao());
        }
    }