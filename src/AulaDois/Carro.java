package AulaDois;

public class Carro extends Veiculo {
    int lotacaoMaxima;
    String combustivel;
    int numeroRodas;

    Carro(String nome, double velocidadeMaxima, String terreno, int lotacaoMaxima, String combustivel, int numeroRodas) {
        super(nome, velocidadeMaxima, terreno);
        this.lotacaoMaxima=lotacaoMaxima;
        this.combustivel=combustivel;
        this.numeroRodas=numeroRodas;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "Apresenta lotacao maxima=" + lotacaoMaxima +
                ", combustivel='" + combustivel + '\'' +
                ", numero de rodas=" + numeroRodas +
                ", nome='" + nome + '\'' +
                ", velocidade maxima=" + velocidadeMaxima +
                ",e utiliza terreno='" + terreno + '\'' +
                '}';
    }
}
