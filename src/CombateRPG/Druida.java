package CombateRPG;

public class Druida {
    String nome;
    int vida;
    int ataque;
    int defesa;
    PoderDivino poderDivino;
    int fe;

    Druida(String nome, int vida, int ataque, int defesa, PoderDivino poderDivino, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.poderDivino = poderDivino;
        this.fe = fe;
    }

    public int atacar(Guerreiro guerreiro) {
        if (this.fe < this.poderDivino.custoFe) {
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, guerreiro.defesa);
        int vidaFinal = calculos.vidaFinal(guerreiro.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.poderDivino.custoFe);
        this.fe = feFinal;
        if (danoFinal >= guerreiro.vida) {
            System.out.println("O ataque resultou na morte do alvo " + guerreiro.nome);
            guerreiro.vida = 0;
        }
        else {
            guerreiro.vida = vidaFinal;
        }
        return danoFinal;
    }

    public int atacar(Barbaro barbaro) {
        if (this.fe < this.poderDivino.custoFe) {
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, barbaro.defesa);
        int vidaFinal = calculos.vidaFinal(barbaro.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.poderDivino.custoFe);
        this.fe = feFinal;
        if (danoFinal >= barbaro.vida) {
            System.out.println("O ataque resultou na morte do alvo " + barbaro.nome);
            barbaro.vida=0;
        }
        else {
            barbaro.vida = vidaFinal;
        }
        return danoFinal;
    }

    public int atacar(Mago mago) {
        if (this.fe < this.poderDivino.custoFe) {
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, mago.defesa);
        int vidaFinal = calculos.vidaFinal(mago.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.poderDivino.custoFe);
        this.fe = feFinal;
        if (danoFinal >= mago.vida) {
            System.out.println("O ataque resultou na morte do alvo " + mago.nome);
            mago.vida=0;
        }
        else {
            mago.vida = vidaFinal;
        }
        return danoFinal;
    }

    public int atacar(Feiticeiro feiticeiro) {
        if (this.fe < this.poderDivino.custoFe) {
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, feiticeiro.defesa);
        int vidaFinal = calculos.vidaFinal(feiticeiro.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.poderDivino.custoFe);
        this.fe = feFinal;
        if (danoFinal >= feiticeiro.vida) {
            System.out.println("O ataque resultou na morte do alvo " + feiticeiro.nome);
            feiticeiro.vida=0;
        }
        else{
            feiticeiro.vida = vidaFinal;
        }
        return danoFinal;
    }

    public int atacar(Druida druida) {
        if (this.fe < this.poderDivino.custoFe) {
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, druida.defesa);
        int vidaFinal = calculos.vidaFinal(druida.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.poderDivino.custoFe);
        this.fe = feFinal;
        if (danoFinal >= druida.vida) {
            System.out.println("O ataque resultou na morte do alvo " + druida.nome);
            druida.vida=0;
        }
        else {
            druida.vida = vidaFinal;
        }
        return danoFinal;
    }
    public int atacar(Clerigo clerigo) {
        if (this.fe < this.poderDivino.custoFe) {
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, clerigo.defesa);
        int vidaFinal = calculos.vidaFinal(clerigo.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.poderDivino.custoFe);
        this.fe = feFinal;
        if (danoFinal >= clerigo.vida) {
            System.out.println("O ataque resultou na morte do alvo " + clerigo.nome);
            clerigo.vida=0;
        }
        else {
            clerigo.vida = vidaFinal;
        }
        return danoFinal;
    }
}
