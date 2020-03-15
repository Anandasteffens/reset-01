package AulaDois;

public class Aviao extends Veiculo {
    int lotacaoMaxima;
    String combustivel;
    double altitudeMaxima;

    Aviao(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, double altitudeMaxima) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima=lotacaoMaxima;
        this.combustivel=combustivel;
        this.altitudeMaxima=altitudeMaxima;
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "Apresenta lotacao maxima=" + lotacaoMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", altitude maxima=" + altitudeMaxima +
                ", nome='" + nome + '\'' +
                ", velocidade maxima=" + velocidadeMaxima +
                "e utiliza terreno='" + terreno + '\'' +
                '}';
    }
}
