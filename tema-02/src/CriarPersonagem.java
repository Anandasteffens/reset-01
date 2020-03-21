import java.util.Scanner;

public class CriarPersonagem {
    public static Guerreiro criarGuerreiro (Arma arma){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação personagem:");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        // System.out.print("Criando guerreiro:");
        Guerreiro guerreiro = new Guerreiro(nome, vida, ataque, defesa, arma);

        return guerreiro;
    }
    public static Barbaro criarBarbaro (Arma arma) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação personagem:");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        //  System.out.print("Criando barbaro:");
        Barbaro barbaro = new Barbaro(nome, vida, ataque, defesa, arma);

        return barbaro;
    }

    public static Mago criarMago (Magia magia, double mana) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação personagem:");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        // System.out.print("Criando mago:");
        Mago mago = new Mago(nome, vida, ataque, defesa, magia, mana);

        return mago;
    }

    public static Feiticeiro criarFeiticeiro (Magia magia, double mana) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação personagem:");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        //System.out.print("Criando feiticeiro:");
        Feiticeiro feiticeiro = new Feiticeiro(nome, vida, ataque, defesa, magia, mana);

        return feiticeiro;
    }

    public static Druida criarDruida (PoderDivino poderDivino, double fe) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação personagem:");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        //System.out.print("Criando druida:");
        Druida druida = new Druida(nome, vida, ataque, defesa, poderDivino, fe);

        return druida;
    }

    public static Clerigo criarClerigo (PoderDivino poderDivino, double fe) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Criação personagem:");
        System.out.print("Nome: ");
        String nome = scanner.next();

        System.out.print("Vida: ");
        double vida = scanner.nextDouble();

        System.out.print("Ataque: ");
        double ataque = scanner.nextDouble();

        System.out.print("Defesa: ");
        double defesa = scanner.nextDouble();

        //System.out.print("Criando clerigo:");
        Clerigo clerigo = new Clerigo(nome, vida, ataque, defesa, poderDivino, fe);

        return clerigo;
    }
}
