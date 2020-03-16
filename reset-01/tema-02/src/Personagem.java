public class Personagem {
    String nome;
    double vida;
    double ataque;
    double defesa;

    public Personagem(String nome, double vida, double ataque, double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public void imprimir(String nomeAlvo, String habilidade, double danoFinal) {
        System.out.println(this.nome + " atacou " + nomeAlvo + " com " + habilidade + " causando " + danoFinal + " de dano.");
    }
}


               /* System.out.print(guerreiro.nome + " " + "atacou" + " ");
                        System.out.print(barbaro.nome + " " + "com");
                        System.out.print(" " + guerreiro.arma.nome + " " + "causando ");
                        // System.out.println(danoCausadoGum + " de dano.");
                        System.out.println("#####################");*/
