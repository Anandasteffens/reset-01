public class AppBatalha {

    public static void main(String[] args) {

        Arma espada = new Arma("Espada",22);

        Arma martelo = new Arma("Martelo",10);

        Magia raioDeFrio = new Magia ("Raio de Frio", 15,25);

        Magia bolaDeFogo = new Magia ("Bola de Fogo", 25,20);

        PoderDivino invocarEnxames = new PoderDivino ("Invocar Enxames",15, 30);

        PoderDivino toqueDeFadiga = new PoderDivino ("Toque de Fadiga",30, 25);

        Guerreiro guerreiro = new Guerreiro("Valeros",150, 5, 35, espada);

        Barbaro barbaro = new Barbaro("Ragnar", 150, 6, 35, martelo);

        Mago mago = new Mago("Aethas", 150, 4, 40, raioDeFrio, 80);

        Feiticeiro feiticeiro = new Feiticeiro("Ramza", 150, 6, 45, bolaDeFogo, 80);

        Druida druida = new Druida("Beatrice", 150, 4, 33, invocarEnxames, 50);

        Clerigo clerigo = new Clerigo("Mayari", 150, 5, 38, toqueDeFadiga, 50);

        //Ataques
            guerreiro.atacar(barbaro);
            System.out.println("#####################");
            guerreiro.atacar(mago);
            System.out.println("#####################");
            barbaro.atacar(clerigo);
            System.out.println("#####################");
            barbaro.atacar(feiticeiro);
            System.out.println("#####################");
            mago.atacar(druida);
            System.out.println("#####################");
            mago.atacar(guerreiro);
            System.out.println("#####################");
            feiticeiro.atacar(barbaro);
            System.out.println("#####################");
            feiticeiro.atacar(mago);
            druida.atacar(clerigo);
            druida.atacar(feiticeiro);
            clerigo.atacar(druida);
            clerigo.atacar(guerreiro);

    }
}
