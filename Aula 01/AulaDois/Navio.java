package AulaDois;

public class Navio extends Veiculo {
    int lotacaoMaxima;
    String combustivel;

    Navio(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima= lotacaoMaxima;
        this.combustivel=combustivel;

    }

    @Override
    public String toString() {
        return "Navio{" +
                "apresenta lotacao maxima de=" + lotacaoMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidade maxima=" + velocidadeMaxima +
                " e utiliza terreno='" + terreno + '\'' +
                '}';
    }
}
