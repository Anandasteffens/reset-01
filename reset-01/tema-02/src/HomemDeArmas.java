public class HomemDeArmas extends Personagem {
    Arma arma;

    public HomemDeArmas(String nome, double vida, double ataque, double defesa, Arma arma) {
        super(nome, vida, ataque, defesa);
        this.arma = arma;
    }

    public void atacar (Personagem alvo){
        if (this.vida>0) {
            Calculo calculo = new Calculo();
            double poderFinal = calculo.poderFinalAtaque(this.arma.poderAtaque, this.ataque);
            double danoFinal = calculo.danoFinal(poderFinal, alvo.defesa);
            double vidaFinal = calculo.vidaFinal(alvo.vida, danoFinal);
            if (danoFinal >= alvo.vida) {
                System.out.println("O ataque resultou na morte do alvo " + alvo.nome);
                alvo.vida = 0;
            } else {
                alvo.vida = vidaFinal;
            }
            this.imprimir(alvo.nome, this.arma.nome, danoFinal);
        }

    }

    //TODO: imprimir o estado do personagem
}
