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


    public void atacar(Personagem alvo) {
        if (this.getVida() > 0) {
            if (this.mana<=0){
                System.out.println("Duelo finalizado por falta de fe.");
            }
            else{
                Calculo calculo = new Calculo();
                double poderFinal = calculo.poderFinalAtaque(this.magia.getPoderAtaque(), this.getAtaque());
                double danoFinal = calculo.danoFinal(poderFinal, alvo.getDefesa());
                double vidaFinal = calculo.vidaFinal(alvo.getVida(), danoFinal);
                if (danoFinal >= alvo.getVida()) {
                    System.out.println("O ataque resultou na morte do alvo " + alvo.getNome());
                    alvo.setVida(0);
                } else {
                    alvo.setVida(vidaFinal);
                }
                this.imprimir(alvo.getNome(), this.magia.getNome(), danoFinal);
            }

            //TODO: imprimir o estado do personagem
        }
    }
}
