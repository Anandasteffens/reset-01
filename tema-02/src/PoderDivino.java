public class PoderDivino {
    private String nome;
    private double poderIntensidade;
    private double custoFe;
    private boolean danoArea;

    public PoderDivino(String nome, double poderIntensidade, double custoFe, boolean danoArea) {
        this.nome = nome;
        this.poderIntensidade = poderIntensidade;
        this.custoFe = custoFe;
        this.danoArea=danoArea;
    }

    protected double getIntensidade(){
        return this.poderIntensidade;
    }

    protected String getnome(){
        return this.nome;
    }

    protected double getCustoFe(){return this.custoFe;}

    protected boolean isDanoArea(){
        return this.danoArea;
    }



}
