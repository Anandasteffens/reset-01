public class Mago {

    String nome;

    double vida;

    double ataque;

    double defesa;

    int mana;

    Mago(String nome, double vida, double ataque, double defesa, int mana) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        this.mana = mana;
    }

    double calcularDano(double defesa, double poder) {
        return ataque * poder - defesa;
    }

    void registrar(String alvo, String habilidade, double dano) {
        System.out.println(this.nome + " atacou " + alvo + " com " + habilidade + " causando " + dano + " de dano");
    }

    void imprimirEstado() {
        System.out.println("Nome: " + this.nome + " | Vida: " + this.vida + " | Mana: " + this.mana);
    }

    void atacar(Guerreiro alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }

    void atacar(Barbaro alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }

    void atacar(Mago alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }

    void atacar(Feiticeiro alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }

    void atacar(Clerigo alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }

    void atacar(Druida alvo, Magia magia) {
        double dano = calcularDano(alvo.defesa, magia.poderAtaque);
        alvo.vida -= dano;
        this.mana -= magia.custoMana;
        registrar(alvo.nome, magia.nome, dano);
    }

}
