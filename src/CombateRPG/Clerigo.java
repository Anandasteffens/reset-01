package CombateRPG;

public class Clerigo {
    String nome;
    int vida;
    int ataque;
    int defesa;
    PoderDivino poderDivino;
    int fe;
    private static final int custoFe = 12;

    Clerigo(String nome, int vida, int ataque, int defesa, PoderDivino poderDivino, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.poderDivino = poderDivino;
        this.fe = fe;
    }

    public int atacar(Guerreiro guerreiro){
        if (this.fe < custoFe){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, guerreiro.defesa);
        int vidaFinal = calculos.vidaFinal(guerreiro.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        guerreiro.vida = vidaFinal;
        this.fe = feFinal;
        if (danoFinal >guerreiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+guerreiro.nome);
        }
        return danoFinal;
    }
    public int atacar(Barbaro barbaro){
        if (this.fe < custoFe){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, barbaro.defesa);
        int vidaFinal = calculos.vidaFinal(barbaro.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        barbaro.vida = vidaFinal;
        this.fe = feFinal;
        if (danoFinal >barbaro.vida){
            System.out.println("O ataque resultou na morte do alvo "+barbaro.nome);
        }
        return danoFinal;
    }
    public int atacar(Mago mago){
        if (this.fe < custoFe){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, mago.defesa);
        int vidaFinal = calculos.vidaFinal(mago.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        mago.vida = vidaFinal;
        this.fe = feFinal;
        if (danoFinal >mago.vida){
            System.out.println("O ataque resultou na morte do alvo "+mago.nome);
        }
        return danoFinal;

    }
    public int atacar(Feiticeiro feiticeiro){
        if (this.fe < custoFe){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, feiticeiro.defesa);
        int vidaFinal = calculos.vidaFinal(feiticeiro.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        feiticeiro.vida = vidaFinal;
        this.fe = feFinal;
        if (danoFinal >feiticeiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+feiticeiro.nome);
        }
        return danoFinal;
    }
    public int atacar(Druida druida){
        if (this.fe < custoFe){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, druida.defesa);
        int vidaFinal = calculos.vidaFinal(druida.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        druida.vida = vidaFinal;
        this.fe = feFinal;
        if (danoFinal >druida.vida){
            System.out.println("O ataque resultou na morte do alvo "+druida.nome);
        }
        return danoFinal;
    }
    public int atacar(Clerigo clerigo){
        if (this.fe < custoFe){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, this.ataque);
        int danoFinal = calculos.danoFinal(poderFinal, clerigo.defesa);
        int vidaFinal = calculos.vidaFinal(clerigo.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        clerigo.vida = vidaFinal;
        this.fe = feFinal;
        if (danoFinal >clerigo.vida){
            System.out.println("O ataque resultou na morte do alvo "+clerigo.nome);
        }
        return danoFinal;
    }

}
