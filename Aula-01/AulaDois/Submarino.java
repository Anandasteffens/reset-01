package AulaDois;

public class Submarino extends Veiculo {
    double profundidadeMaxima;
    int lotacaoMaxima;
    String combustivel;

    Submarino(String nome, double velocidadeMaxima, String terreno, double profundidadeMaxima, int lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, terreno);
        this.profundidadeMaxima=profundidadeMaxima;
        this.lotacaoMaxima=lotacaoMaxima;
        this.combustivel=combustivel;
    }

    @Override
    public String toString() {
        return "Submarino{" +
                "apresente profundidade maxima=" + profundidadeMaxima +
                ", lotacao maxima=" + lotacaoMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidade maxima=" + velocidadeMaxima +
                "e utiliza terreno='" + terreno + '\'' +
                '}';
    }
}
