package AulaDois;

public class Bicicleta extends Veiculo {
    int numeroRodas;

    Bicicleta(String nome, double velocidadeMaxima, String terreno, int numeroRodas) {
        super(nome, velocidadeMaxima, terreno);
        this.numeroRodas=numeroRodas;
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "apresenta numero de rodas=" + numeroRodas +
                ", nome='" + nome + '\'' +
                ", velocidade maxima=" + velocidadeMaxima +
                ", e utiliza terreno='" + terreno + '\'' +
                '}';
    }
}
