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
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, guerreiro.defesa);
        int vidaFinal = calculos.vidaFinal(guerreiro.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        guerreiro.vida = vidaFinal;
        this.fe = feFinal;
        return danoFinal;
    }
    public void atacar(Barbaro barbaro){
    }
    public void atacar(Mago mago){
    }
    public void atacar(Feiticeiro feiticeiro){
    }
    public int atacar(Druida druida){
        Calculos calculos = new Calculos();
        int poderFinal = calculos.poderFinalAtaque(this.poderDivino.poderIntensidade, ataque);
        int danoFinal = calculos.danoFinal(poderFinal, druida.defesa);
        int vidaFinal = calculos.vidaFinal(druida.vida, danoFinal);
        int feFinal = calculos.feFinal(this.fe, this.custoFe);
        druida.vida = vidaFinal;
        this.fe = feFinal;
        return danoFinal;
    }
    public void atacar(Clerigo clerigo){
    }

    public void defender() {

    }
}
