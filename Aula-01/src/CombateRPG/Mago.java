package CombateRPG;

public class Mago {
    String nome;
    int vida;
    int ataque;
    int defesa;
    Magia magia;
    int mana;

    Mago(String nome, int vida, int ataque, int defesa, Magia magia, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.magia = magia;
        this.mana = mana;
    }

    public int atacar(Guerreiro guerreiro){
        if (this.mana < this.magia.custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, guerreiro.defesa);
        int vidaFinal = calculos.vidaFinal(guerreiro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.magia.custoMana);
        this.mana = manaFinal;
        if (danoFinal >= guerreiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+guerreiro.nome);
            guerreiro.vida=0;
        }
        else {
            guerreiro.vida = vidaFinal;
        }
        return danoFinal;
    }

    public int atacar(Barbaro barbaro){
        if (this.mana < this.magia.custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, barbaro.defesa);
        int vidaFinal = calculos.vidaFinal(barbaro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.magia.custoMana);
        this.mana = manaFinal;
        if (danoFinal >= barbaro.vida){
            System.out.println("O ataque resultou na morte do alvo "+barbaro.nome);
            barbaro.vida=0;
        }
        else {
            barbaro.vida = vidaFinal;
        }
        return danoFinal;
    }
    public int atacar(Mago mago){
        if (this.mana < this.magia.custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, mago.defesa);
        int vidaFinal = calculos.vidaFinal(mago.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.magia.custoMana);
        this.mana = manaFinal;
        if (danoFinal >= mago.vida){
            System.out.println("O ataque resultou na morte do alvo "+mago.nome);
            mago.vida=0;
        }
        else {
            mago.vida = vidaFinal;
        }
        return danoFinal;
    }
    public int atacar(Feiticeiro feiticeiro){
        if (this.mana < this.magia.custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, feiticeiro.defesa);
        int vidaFinal = calculos.vidaFinal(feiticeiro.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.magia.custoMana);
        this.mana = manaFinal;
        if (danoFinal >= feiticeiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+feiticeiro.nome);
            feiticeiro.vida=0;
        }
        else {
            feiticeiro.vida = vidaFinal;
        }
        return danoFinal;
    }
    public int atacar(Druida druida){
        if (this.mana < this.magia.custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, druida.defesa);
        int vidaFinal = calculos.vidaFinal(druida.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.magia.custoMana);
        this.mana = manaFinal;
        if (danoFinal >= druida.vida){
            System.out.println("O ataque resultou na morte do alvo "+druida.nome);
            druida.vida=0;
        }
        else {
            druida.vida = vidaFinal;
        }
        return danoFinal;
    }
    public int atacar(Clerigo clerigo){
        if (this.mana < this.magia.custoMana){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.magia.poderAtaque, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, clerigo.defesa);
        int vidaFinal = calculos.vidaFinal(clerigo.vida, danoFinal);
        int manaFinal = calculos.manaFinal(this.mana, this.magia.custoMana);
        this.mana = manaFinal;
        if (danoFinal >= clerigo.vida){
            System.out.println("O ataque resultou na morte do alvo "+clerigo.nome);
            clerigo.vida=0;
        }
        else {
            clerigo.vida = vidaFinal;
        }
        return danoFinal;
    }

}
