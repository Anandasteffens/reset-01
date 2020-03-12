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
        if (mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, guerreiro.defesa);
        int vidaFinal = calculos.vidaFinal(guerreiro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        guerreiro.vida = vidaFinal;
        this.mana = manaFinal;
        if (danoFinal >guerreiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+guerreiro.nome);
        }
        return danoFinal;
    }

    public int atacar(Barbaro barbaro){
        if (mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, barbaro.defesa);
        int vidaFinal = calculos.vidaFinal(barbaro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        barbaro.vida = vidaFinal;
        this.mana = manaFinal;
        if (danoFinal >barbaro.vida){
            System.out.println("O ataque resultou na morte do alvo "+barbaro.nome);
        }
        return danoFinal;
    }
    public int atacar(Mago mago){
        if (mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, mago.defesa);
        int vidaFinal = calculos.vidaFinal(mago.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        mago.vida = vidaFinal;
        this.mana = manaFinal;
        if (danoFinal >mago.vida){
            System.out.println("O ataque resultou na morte do alvo "+mago.nome);
        }
        return danoFinal;
    }
    public int atacar(Feiticeiro feiticeiro){
        if (mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, feiticeiro.defesa);
        int vidaFinal = calculos.vidaFinal(feiticeiro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        feiticeiro.vida = vidaFinal;
        this.mana = manaFinal;
        return danoFinal;
    }
    public int atacar(Druida druida){
        if (mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, druida.defesa);
        int vidaFinal = calculos.vidaFinal(druida.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        druida.vida = vidaFinal;
        this.mana = manaFinal;
        return danoFinal;
    }
    public int atacar(Clerigo clerigo){
        if (mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, clerigo.defesa);
        int vidaFinal = calculos.vidaFinal(clerigo.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        clerigo.vida = vidaFinal;
        this.mana = manaFinal;
        return danoFinal;
    }

}
