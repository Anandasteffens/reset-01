import java.util.ArrayList;
import java.util.List;

public class Sacerdote extends Personagem {
    private PoderDivino poderDivino;
    private double fe;

    protected Sacerdote(String nome, double vida, double ataque, double defesa, PoderDivino poderDivino, double fe) {
        super(nome, vida, ataque, defesa);
        this.poderDivino = poderDivino;
        this.fe = fe;
    }

    protected PoderDivino getPoderDivino() {
        return this.poderDivino;
    }

    protected double getFe() {
        return this.fe;
    }

    protected void setFe(double fe) {
        this.fe = fe;
    }

    public List<String> atacar(Personagem alvo) {
        List<String> listaMsg = new ArrayList<>();
        if (this.getVida() > 0) {
            if (this.poderDivino.isDanoArea() == false) {
                this.atacarIndividual(alvo, listaMsg);
                listaMsg.add("["+Data.getDataHora()+ "]"+" TIPO DE ATAQUE: ATAQUE INDIVIDUAL REALIZADO");
            } else {
                List<Personagem> listaAlvos = new ArrayList<>();
                listaAlvos.add(alvo);
                listaAlvos.add(alvo);
                listaAlvos.add(alvo);
                listaAlvos.add(alvo);
                this.atacarArea(listaAlvos, listaMsg);
                listaMsg.add("["+Data.getDataHora()+ "]"+" TIPO DE ATAQUE: ATAQUE EM ÁREA REALIZADO");
            }
        }
        return listaMsg;
    }

    private void atacarIndividual(Personagem alvo, List<String> listaMsg) {
        if (this.fe <= 0) {
            listaMsg.add("["+Data.getDataHora()+ "]"+" Duelo finalizado por falta de fe.");
        } else {
            Calculo calculo = new Calculo();
            double poderFinal = calculo.poderFinalAtaque(this.poderDivino.getIntensidade(), this.getAtaque());
            double danoFinal = calculo.danoFinal(poderFinal, alvo.getDefesa());
            double vidaFinal = calculo.vidaFinal(alvo.getVida(), danoFinal);
            double feFinal = calculo.feFinal(this.fe, poderDivino.getCustoFe());
            if (this.fe >=poderDivino.getCustoFe()) {
                if (danoFinal >= alvo.getVida()) {
                    listaMsg.add("["+Data.getDataHora()+ "]"+" "+this.imprimir(alvo.getNome(), this.poderDivino.getnome(), danoFinal));
                    listaMsg.add("["+Data.getDataHora()+ "]"+" O ataque resultou na morte do alvo " + alvo.getNome());
                    alvo.setVida(0);
                } else {
                    alvo.setVida(vidaFinal);
                }
            }
            else {
                this.setFe(feFinal);
                listaMsg.add("["+Data.getDataHora()+ "]"+" "+this.imprimir(alvo.getNome(), this.poderDivino.getnome(), danoFinal));
            }
        }
    }

    private void atacarArea(List<Personagem> listaAlvos, List<String> listaMsg) {
        for (Personagem alvo : listaAlvos) {
            this.atacarIndividual(alvo, listaMsg);
        }
    }
    void imprimirStatus(){
        System.out.println("Nome: " + this.getNome() + " | Vida: " + this.getVida()+" | Fe: " + this.getFe());
    }
}

