import java.util.ArrayList;
import java.util.List;

public class Arcano extends Personagem {

    private Magia magia;
    private double mana;

    protected Arcano(String nome, double vida, double ataque, double defesa, Magia magia, double mana) {
        super(nome, vida, ataque, defesa);
        this.magia = magia;
        this.mana = mana;
    }

    protected Magia getMagia(){
        return this.magia;
    }
    protected double getMana(){
        return this.mana;
    }
    protected void setMana (double mana){this.mana = mana;};

    public List<String> atacar(Personagem alvo){
        List<String> listaMsg = new ArrayList<>();
        if (this.getVida() > 0) {
            if (this.magia.isDanoArea() == false) {
                this.atacarIndividual(alvo, listaMsg);
                listaMsg.add("["+Data.getDataHora()+ "]"+" TIPO DE ATAQUE: ATAQUE INDIVIDUAL REALIZADO");
            } else {
                List<Personagem> listaAlvos = new ArrayList<>();
                listaAlvos.add(alvo);
                listaAlvos.add(alvo);
                listaAlvos.add(alvo);
                this.atacarArea(listaAlvos, listaMsg);
                listaMsg.add("["+Data.getDataHora()+ "]"+" TIPO DE ATAQUE: ATAQUE EM ÁREA REALIZADO");
            }
        }
        return listaMsg;
    }

    public void atacarIndividual(Personagem alvo, List<String> listaMsg) {
        if (this.mana <= 0) {
            listaMsg.add("["+Data.getDataHora()+ "]"+" Duelo finalizado por falta de mana.");
        } else {
            Calculo calculo = new Calculo();
            double poderFinal = calculo.poderFinalAtaque(this.magia.getPoderAtaque(), this.getAtaque());
            double danoFinal = calculo.danoFinal(poderFinal, alvo.getDefesa());
            double vidaFinal = calculo.vidaFinal(alvo.getVida(), danoFinal);
            double manaFinal = calculo.manaFinal(this.mana, magia.getCustoMana());
            if (this.mana >= magia.getCustoMana()) {
                if (danoFinal >= alvo.getVida()) {
                    listaMsg.add("["+Data.getDataHora()+ "]"+this.imprimir(alvo.getNome(), this.magia.getNome(), danoFinal));
                    listaMsg.add("["+Data.getDataHora()+ "]"+" O ataque resultou na morte do alvo " + alvo.getNome());
                    alvo.setVida(0);
                    this.setMana(manaFinal);
                } else {
                    alvo.setVida(vidaFinal);
                    listaMsg.add("["+Data.getDataHora()+ "]"+" "+this.imprimir(alvo.getNome(), this.magia.getNome(), danoFinal));
                    this.setMana(manaFinal);
                }
            } else {
                this.setMana(manaFinal);
            }
        }
    }

    private void atacarArea(List<Personagem> listaAlvos, List<String> listaMsg) {
        for (Personagem alvo : listaAlvos) {
            this.atacarIndividual(alvo, listaMsg);
        }
    }
    void imprimirStatus(){
        System.out.println("Nome: " + this.getNome() + " | Vida: " + this.getVida()+" | Mana: " + this.getMana());
    }
}
