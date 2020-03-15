package AulaDois;

public class Caminhao extends Veiculo {
    int lotacaoMaxima;
    String combustivel;
    int numeroRodas;

    Caminhao(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima=lotacaoMaxima;
        this.combustivel=combustivel;
        this.numeroRodas=numeroRodas;
    }

    @Override
    public String toString() {
        return "Caminhao{" +
                "Apresenta lotacao maxima=" + lotacaoMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", numero de rodas=" + numeroRodas +
                ", nome='" + nome + '\'' +
                ", velocidade maxima=" + velocidadeMaxima +
                ",utiliza o terreno='" + terreno + '\'' +
                '}';
    }
}
