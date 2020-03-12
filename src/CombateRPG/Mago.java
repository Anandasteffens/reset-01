package CombateRPG;

public class Mago {
    String nome;
    int vida;
    int ataque;
    int defesa;
    Magia magia;
    int mana;
    private static final int custoMana = 25;

    Mago(String nome, int vida, int ataque, int defesa, Magia magia, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
        this.mana = mana;
    }

    public int atacar(Guerreiro guerreiro){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, guerreiro.defesa);
        int vidaFinal = calculos.vidaFinal(guerreiro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        guerreiro.vida = vidaFinal;
        this.mana = manaFinal;
        return danoFinal;

    }
    public void atacar(Barbaro barbaro){
    }
    public void atacar(Mago mago){
    }
    public void atacar(Feiticeiro feiticeiro){
    }
    public int atacar(Druida druida){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, druida.defesa);
        int vidaFinal = calculos.vidaFinal(druida.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        druida.vida = vidaFinal;
        this.mana = manaFinal;
        return danoFinal;
    }
    public void atacar(Clerigo clerigo){
    }

    public void defender() {

    }
}
