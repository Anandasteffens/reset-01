public class Druida {

    String nome;

    double vida;

    double ataque;

    double defesa;

    int fe;

    Druida(String nome, double vida, double ataque, double defesa, int fe) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.fe = fe;
    }

    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String alvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano");
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Fé: " + this.fe);
    }

    void atacar(Guerreiro alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        registrar(alvo.nome, poderDivino.nome, dano);
    }

    void atacar(Barbaro alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        registrar(alvo.nome, poderDivino.nome, dano);
    }

    void atacar(Mago alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        registrar(alvo.nome, poderDivino.nome, dano);
    }

    void atacar(Feiticeiro alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        registrar(alvo.nome, poderDivino.nome, dano);
    }

    void atacar(Clerigo alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        registrar(alvo.nome, poderDivino.nome, dano);
    }

    void atacar(Druida alvo, PoderDivino poderDivino) {
        double dano = calcularDano(alvo.defesa, poderDivino.poderAtaque);
        alvo.vida -= dano;
        this.fe -= poderDivino.custoFe;
        registrar(alvo.nome, poderDivino.nome, dano);
    }

}
