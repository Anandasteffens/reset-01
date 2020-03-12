package CombateRPG;

public class Feiticeiro {
    String nome;
    int vida;
    int ataque;
    int defesa;
    Magia magia;
    int mana;
    private static final int custoMana = 20;

    Feiticeiro(String nome, int vida, int ataque, int defesa, Magia magia, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
        this.mana = mana;
    }

    public void atacar(Guerreiro guerreiro){
    }
    public int atacar(Barbaro barbaro){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, barbaro.defesa);
        int vidaFinal = calculos.vidaFinal(barbaro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        barbaro.vida = vidaFinal;
        this.mana = manaFinal;
        return danoFinal;

    }
    public int atacar(Mago mago){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, mago.defesa);
        int vidaFinal = calculos.vidaFinal(mago.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        mago.vida = vidaFinal;
        this.mana = manaFinal;
        return danoFinal;
    }
    public void atacar(Feiticeiro feiticeiro){
    }
    public void atacar(Druida druida){
    }
    public void atacar(Clerigo clerigo){
    }

    public void defender() {

    }
}
