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

    public int atacar(Guerreiro guerreiro){
        if (this.mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
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
        if (this.mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
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
        if (this.mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
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
        if (this.mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, feiticeiro.defesa);
        int vidaFinal = calculos.vidaFinal(feiticeiro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        feiticeiro.vida = vidaFinal;
        this.mana = manaFinal;
        if (danoFinal >feiticeiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+feiticeiro.nome);
        }
        return danoFinal;
    }
    public int atacar(Druida druida){
        if (this.mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, druida.defesa);
        int vidaFinal = calculos.vidaFinal(druida.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        druida.vida = vidaFinal;
        this.mana = manaFinal;
        if (danoFinal >druida.vida){
            System.out.println("O ataque resultou na morte do alvo "+druida.nome);
        }
        return danoFinal;
    }
    public int atacar(Clerigo clerigo){
        if (this.mana < custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, clerigo.defesa);
        int vidaFinal = calculos.vidaFinal(clerigo.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.custoMana);
        clerigo.vida = vidaFinal;
        this.mana = manaFinal;
        if (danoFinal >clerigo.vida){
            System.out.println("O ataque resultou na morte do alvo "+clerigo.nome);
        }
        return danoFinal;
    }

}
