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

    public void atacar(Personagem alvo) {
        if (this.getVida() > 0) {
            if (this.poderDivino.isDanoArea() == false) {
                this.atacarIndividual(alvo);
            } else {
                List<Personagem> listaAlvos = new ArrayList<>();
                listaAlvos.add(alvo);
                listaAlvos.add(alvo);
                listaAlvos.add(alvo);
                this.atacarArea(listaAlvos);
            }
        }
    }

    private void atacarIndividual(Personagem alvo) {
        if (this.fe <= 0) {
            System.out.println("Duelo finalizado por falta de fe.");
        } else {
            Calculo calculo = new Calculo();
            double poderFinal = calculo.poderFinalAtaque(this.poderDivino.getIntensidade(), this.getAtaque());
            double danoFinal = calculo.danoFinal(poderFinal, alvo.getDefesa());
            double vidaFinal = calculo.vidaFinal(alvo.getVida(), danoFinal);
            if (danoFinal >= alvo.getVida()) {
                System.out.println("O ataque resultou na morte do alvo " + alvo.getNome());
                alvo.setVida(0);
            } else {
                alvo.setVida(vidaFinal);

            }
            this.imprimir(alvo.getNome(), this.poderDivino.getnome(), danoFinal);
        }
    }

    private void atacarArea(List<Personagem> listaAlvos) {
        for (Personagem alvo : listaAlvos) {
            this.atacarIndividual(alvo);
        }
    }
}
            /*List<Aluno> alunos = new ArrayList<>();
            alunos.add(new Aluno("Alexandre"));*/


    /*public void atacar(Personagem alvo) {
        if (this.getVida() > 0) {
            if (this.fe<=0){
                System.out.println("Duelo finalizado por falta de fe.");
            }
            else{
                Calculo calculo = new Calculo();
                double poderFinal = calculo.poderFinalAtaque(this.poderDivino.getIntensidade(), this.getAtaque());
                double danoFinal = calculo.danoFinal(poderFinal, alvo.getDefesa());
                double vidaFinal = calculo.vidaFinal(alvo.getVida(), danoFinal);
                if (danoFinal >= alvo.getVida()) {
                    System.out.println("O ataque resultou na morte do alvo " + alvo.getNome());
                    alvo.setVida(0);
                } else {
                    alvo.setVida(vidaFinal);
                }
                this.imprimir(alvo.getNome(), this.poderDivino.getnome(), danoFinal); */

    //TODO: imprimir o estado do personagem
