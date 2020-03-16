public class Sacerdote extends Personagem {
    PoderDivino poderDivino;
    double fe;

    public Sacerdote(String nome, double vida, double ataque, double defesa, PoderDivino poderDivino, double fe) {
        super(nome, vida, ataque, defesa);
        this.poderDivino = poderDivino;
        this.fe = fe;
    }

    public void atacar(Personagem alvo) {
        if (this.vida > 0) {
            if (this.fe<=0){
                System.out.println("Duelo finalizado por falta de fe.");
            }
            else{
                Calculo calculo = new Calculo();
                double poderFinal = calculo.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
                double danoFinal = calculo.danoFinal(poderFinal, alvo.defesa);
                double vidaFinal = calculo.vidaFinal(alvo.vida, danoFinal);
                if (danoFinal >= alvo.vida) {
                    System.out.println("O ataque resultou na morte do alvo " + alvo.nome);
                    alvo.vida = 0;
                } else {
                    alvo.vida = vidaFinal;
                }
                this.imprimir(alvo.nome, this.poderDivino.nome, danoFinal);
            }

            //TODO: imprimir o estado do personagem
        }
    }
}