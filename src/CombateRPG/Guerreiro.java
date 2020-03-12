package CombateRPG;

public class Guerreiro {
    String nome;
    int vida;
    int ataque;
    int defesa;
    Arma arma;

    Guerreiro(String nome, int vida, int ataque, int defesa, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.arma = arma;
    }

    public int atacar(Guerreiro guerreiro){
        if (fe < custoFe){
            return 0;
        }
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, mago.defesa);
        int vidaFinal = calculos.vidaFinal(mago.vida, danoFinal);
        int feFinal = calculos.manaFinal(this.fe, this.custoFe);
        mago.vida = vidaFinal;
        this.fe = feFinal;
        if (danoFinal >mago.vida){
            System.out.println("O ataque resultou na morte do alvo "+mago.nome);
        }
        return danoFinal;
    }
    }


    public int atacar (Barbaro barbaro)
        Calculos calculos = new Calculos();
       int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
       int danoFinal = calculos.danoFinal(poderFinal, barbaro.defesa);
       int vidaFinal = calculos.vidaFinal(barbaro.vida, danoFinal);
       barbaro.vida = vidaFinal;
        if (danoFinal >guerreiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+guerreiro.nome);
       return danoFinal;

    }
    public int atacar(Mago mago){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, mago.defesa);
        int vidaFinal = calculos.vidaFinal(barbaro.vida, danoFinal);
        barbaro.vida = vidaFinal;
        if (danoFinal >guerreiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+guerreiro.nome);
        return danoFinal;
    }
    public void atacar(Feiticeiro feiticeiro){
    }
    public void atacar(Druida druida){
    }
    public void atacar(Clerigo clerigo){
    }

        public void defender () {

        }
    }
