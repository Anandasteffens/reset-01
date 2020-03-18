public class Magia {
    private String nome;
    private double poderAtaque;
    private double custoMana;
    private boolean danoArea;

    public Magia(String nome, double poderAtaque, double custoMana, boolean danoArea) {
        this.nome = nome;
        this.poderAtaque = poderAtaque;
        this.custoMana = custoMana;
        this.danoArea = danoArea;
    }

    protected String getNome(){
        return this.nome;
    }
    protected double getPoderAtaque(){
        return this.poderAtaque;
    }
    protected double getCustoMana(){
        return this.custoMana;
    }
    protected boolean isDanoArea(){
        return this.danoArea;
    }
}

