public class HomemDeArmas extends Personagem {
    private Arma arma;

    protected HomemDeArmas(String nome, double vida, double ataque, double defesa, Arma arma) {
        super(nome, vida, ataque, defesa);
        this.arma = arma;
    }
    protected Arma getArma(){
        return this.arma;
    }

    public void atacar (Personagem alvo){
        if (this.getVida()>0) {
            Calculo calculo = new Calculo();
            double poderFinal = calculo.poderFinalAtaque(this.arma.poderAtaque, this.getAtaque());
            double danoFinal = calculo.danoFinal(poderFinal, alvo.getDefesa());
            double vidaFinal = calculo.vidaFinal(alvo.getVida(), danoFinal);
            if (danoFinal >= alvo.getVida()) {
                System.out.println("O ataque resultou na morte do alvo " + alvo.getNome());
                alvo.setVida(0);
            } else {
                alvo.setVida(vidaFinal);
            }
            this.imprimir(alvo.getNome(), this.arma.nome, danoFinal);
        }

    }

    //TODO: imprimir o estado do personagem
}
