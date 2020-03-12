package CombateRPG;

public class Barbaro {
    String nome;
    int vida;
    int ataque;
    int defesa;
    Arma arma;

    Barbaro(String nome, int vida, int ataque, int defesa, Arma arma) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.arma = arma;
    }

    public int atacar(Guerreiro guerreiro){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, guerreiro.defesa);
        int vidaFinal = calculos.vidaFinal(guerreiro.vida, danoFinal);
        guerreiro.vida = vidaFinal;
        if (danoFinal >guerreiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+guerreiro.nome);
        }
        return danoFinal;
    }

    public int atacar(Barbaro barbaro){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, barbaro.defesa);
        int vidaFinal = calculos.vidaFinal(barbaro.vida, danoFinal);
        barbaro.vida = vidaFinal;
        if (danoFinal >barbaro.vida){
            System.out.println("O ataque resultou na morte do alvo "+barbaro.nome);
        }
        return danoFinal;
    }
    public int atacar(Mago mago){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, mago.defesa);
        int vidaFinal = calculos.vidaFinal(mago.vida, danoFinal);
        mago.vida = vidaFinal;
        if (danoFinal >mago.vida){
            System.out.println("O ataque resultou na morte do alvo "+mago.nome);
        }
        return danoFinal;
    }
    public int atacar(Feiticeiro feiticeiro){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, feiticeiro.defesa);
        int vidaFinal = calculos.vidaFinal(feiticeiro.vida, danoFinal);
        feiticeiro.vida = vidaFinal;
        if (danoFinal >feiticeiro.vida){
            System.out.println("O ataque resultou na morte do alvo "+feiticeiro.nome);
        }
        return danoFinal;
    }
    public int atacar(Druida druida){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, druida.defesa);
        int vidaFinal = calculos.vidaFinal(druida.vida, danoFinal);
        druida.vida = vidaFinal;
        if (danoFinal >druida.vida){
            System.out.println("O ataque resultou na morte do alvo "+druida.nome);
        }
        return danoFinal;

    }
    public int atacar(Clerigo clerigo){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, clerigo.defesa);
        int vidaFinal = calculos.vidaFinal(clerigo.vida, danoFinal);
        clerigo.vida = vidaFinal;
        if (danoFinal >clerigo.vida){
            System.out.println("O ataque resultou na morte do alvo "+clerigo.nome);
        }
        return danoFinal;
    }

}
