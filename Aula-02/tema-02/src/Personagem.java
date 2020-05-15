public class Personagem {
    private String nome;
    private double vida;
    private double ataque;
    private double defesa;

    public Personagem(String nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    protected String getNome(){
        return this.nome;
    }
    protected double getVida(){
        return this.vida;
    }
    protected void setVida (double vida){
        this.vida=vida;
    }

    protected double getAtaque(){
        return this.ataque;
    }
    protected double getDefesa(){
        return this.defesa;
    }

    public String imprimir(String nomeAlvo, String habilidade, double danoFinal) {
        return (this.nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + danoFinal + " de dano.");
    }

}


