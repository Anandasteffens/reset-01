package CombateRPG;

public class Druida {
    String nome;
    int vida;
    int ataque;
    int defesa;
    PoderDivino poderDivino;
    int fe;
    private static final int custoFe = 15;

    Druida(String nome, int vida, int ataque, int defesa, PoderDivino poderDivino, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.poderDivino = poderDivino;
        this.fe = fe;
    }

    public void atacar(Guerreiro guerreiro){
    }
    public void atacar(Barbaro barbaro){
    }
    public void atacar(Mago mago){
    }
    public int atacar(Feiticeiro feiticeiro){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, feiticeiro.defesa);
        int vidaFinal = calculos.vidaFinal(feiticeiro.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        feiticeiro.vida = vidaFinal;
        this.fe = feFinal;
        return danoFinal;
    }
    public void atacar(Druida druida){
    }
    public int atacar(Clerigo clerigo){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, clerigo.defesa);
        int vidaFinal = calculos.vidaFinal(clerigo.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        clerigo.vida = vidaFinal;
        this.fe = feFinal;
        return danoFinal;
    }

    public void defender() {

    }
}
