package AulaDois;

public class Trem extends Veiculo {
    int lotacaoMaxima;
    String combustivel;

    Trem(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima=lotacaoMaxima;
        this.combustivel=combustivel;
    }

    @Override
    public String toString() {
        return "Trem{" +
                " apresenta lotacao maxima=" + lotacaoMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", nome='" + nome + '\'' +
                ", velocidade maxima=" + velocidadeMaxima +
                "e utiliza terreno='" + terreno + '\'' +
                '}';
    }
}
