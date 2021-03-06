import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class HomemDeArmas extends Personagem {
    private Arma arma;

    protected HomemDeArmas(String nome, double vida, double ataque, double defesa, Arma arma) {
        super(nome, vida, ataque, defesa);
        this.arma = arma;
    }

    public void equiparArma (Arma arma) {
        this.arma = arma;
    }

    public List<String> atacar (Personagem alvo) {
        List<String> listaMsg = new ArrayList<>();
        if (this.getVida() > 0) {
            Calculo calculo = new Calculo();
            double poderFinal = calculo.poderFinalAtaque(this.arma.poderAtaque, this.getAtaque());
            double danoFinal = calculo.danoFinal(poderFinal, alvo.getDefesa());
            double vidaFinal = calculo.vidaFinal(alvo.getVida(), danoFinal);
            if (danoFinal >= alvo.getVida()) {
                listaMsg.add("[" + Data.getDataHora() + "]" + " " + this.imprimir(alvo.getNome(), this.arma.nome, danoFinal));
                listaMsg.add("[" + Data.getDataHora() + "]" + " O ataque resultou na morte do alvo " + alvo.getNome());
                alvo.setVida(0);
            } else {
                alvo.setVida(vidaFinal);
                listaMsg.add("[" + Data.getDataHora() + "]"+this.imprimir(alvo.getNome(), this.arma.nome, danoFinal));
            }

        }
        return listaMsg;
    }
    void imprimirStatus(){
        System.out.println("Nome: " + this.getNome() + " | Vida: " + this.getVida());
    }
}


