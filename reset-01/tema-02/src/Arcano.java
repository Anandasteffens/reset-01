public class Arcano extends Personagem {

    Magia magia;
    double mana;

    public Arcano(String nome, double vida, double ataque, double defesa, Magia magia, double mana) {
        super(nome, vida, ataque, defesa);
        this.magia = magia;
        this.mana = mana;
    }

    public double atacar(Personagem alvo) {
        Calculo calculo = new Calculo();
        double poderFinal = calculo.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        double danoFinal = calculo.danoFinal(poderFinal, alvo.defesa);
        double vidaFinal = calculo.vidaFinal(alvo.vida, danoFinal);
        if (danoFinal >= alvo.vida) {
            System.out.println("O ataque resultou na morte do alvo " + alvo.nome);
            alvo.vida = 0;
        } else {
            alvo.vida = vidaFinal;
        }
        return danoFinal;

        //TODO: imprimir o estado do personagem
    }
}
