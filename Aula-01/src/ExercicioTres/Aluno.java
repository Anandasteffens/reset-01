package ExercicioTres;

public class Aluno {
    String nome;
    double nota;

    Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    boolean aprovacao (){
        return this.nota >= 7;
    }

}

