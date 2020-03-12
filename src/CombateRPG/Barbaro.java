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

    public void atacar(Guerreiro guerreiro){
    }
    public void atacar(Barbaro barbaro){
    }
    public void atacar(Mago mago){
    }
    public int atacar(Feiticeiro feiticeiro){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, feiticeiro.defesa);
        int vidaFinal = calculos.vidaFinal(feiticeiro.vida, danoFinal);
        feiticeiro.vida = vidaFinal;
        if (vidaFinal <=0) {return 0;}
        return danoFinal;
    }
    public void atacar(Druida druida){
    }
    public int atacar(Clerigo clerigo){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.arma.poderAtaque, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, clerigo.defesa);
        int vidaFinal = calculos.vidaFinal(clerigo.vida, danoFinal);
        clerigo.vida = vidaFinal;
        if (vidaFinal <=0) {return 0;}
        return danoFinal;
    }

    public void defender() {
    }
}
