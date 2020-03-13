package CombateRPG;

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


        //Ataque Guerreiro 1
        int danoCausadoGum = guerreiro.atacar(barbaro);
        System.out.print(guerreiro.nome + " " + "atacou" + " ");
        System.out.print(barbaro.nome + " " + "com");
        System.out.print(" " + guerreiro.arma.nome + " " + "causando ");
        System.out.println(danoCausadoGum + " de dano.");
        System.out.println("#####################");

        //Ataque Guerreiro 2
        int danoCausadoG2 = guerreiro.atacar(mago);
        System.out.print(guerreiro.nome + " " + "atacou" + " ");
        System.out.print(mago.nome + " " + "com");
        System.out.print(" " + guerreiro.arma.nome + " " + "causando ");
        System.out.println(danoCausadoG2 + " de dano.");
        System.out.println("#####################");


        //Ataque Barbaro 1
        int danoCausadoBum = barbaro.atacar(clerigo);
        System.out.print(barbaro.nome + " " + "atacou" + " ");
        System.out.print(clerigo.nome + " " + "com");
        System.out.print(" " + barbaro.arma.nome + " " + "causando ");
        System.out.println(danoCausadoBum + " de dano.");
        System.out.println("#####################");

        //Ataque Barbaro 2
        int danoCausadoB2 = barbaro.atacar(feiticeiro);
        System.out.print(barbaro.nome + " " + "atacou" + " ");
        System.out.print(feiticeiro.nome + " " + "com");
        System.out.print(" " + barbaro.arma.nome + " " + "causando ");
        System.out.println(danoCausadoB2 + " de dano.");
        System.out.println("#####################");


        //Ataque Mago 1
        int danoCausadoMum = mago.atacar(druida);
        if (danoCausadoMum <= 0 ){
            System.out.println("Duelo finalizado por falta de mana.");
        }
        else {
            System.out.print(mago.nome + " " + "atacou" + " ");
            System.out.print(druida.nome + " " + "com");
            System.out.print(" " + mago.magia.nome + " " + "causando ");
            System.out.println(danoCausadoMum + " de dano.");
        }
        System.out.println("#####################");

        //Ataque Mago 2
        int danoCausadoM2 = mago.atacar(guerreiro);
        if (danoCausadoM2 <= 0 ){
            System.out.println("Duelo finalizado por falta de mana.");
        }
        else {
            System.out.print(mago.nome + " " + "atacou" + " ");
            System.out.print(guerreiro.nome + " " + "com");
            System.out.print(" " + mago.magia.nome + " " + "causando ");
            System.out.println(danoCausadoM2 + " de dano.");
        }
        System.out.println("#####################");


        //Ataque Feiticeiro 1
        int danoCausadoFum = feiticeiro.atacar(barbaro);
        if (danoCausadoFum <= 0 ){
            System.out.println("Duelo finalizado por falta de mana.");
        }
        else {
            System.out.print(feiticeiro.nome + " " + "atacou" + " ");
            System.out.print(barbaro.nome + " " + "com");
            System.out.print(" " + feiticeiro.magia.nome + " " + "causando ");
            System.out.println(danoCausadoFum + " de dano.");
        }
        System.out.println("#####################");

        //Ataque Feiticeiro 2
        int danoCausadoF2 = feiticeiro.atacar(mago);
        if (danoCausadoF2 <= 0 ){
            System.out.println("Duelo finalizado por falta de mana.");
        }
        else {
            System.out.print(feiticeiro.nome + " " + "atacou" + " ");
            System.out.print(mago.nome + " " + "com");
            System.out.print(" " + feiticeiro.magia.nome + " " + "causando ");
            System.out.println(danoCausadoF2 + " de dano.");
        }
        System.out.println("#####################");


        //Ataque Druida 1
        int danoCausadoDum = druida.atacar(clerigo);
        if (danoCausadoDum <= 0 ){
            System.out.println("Duelo finalizado por falta de fe.");
        }
        else {
            System.out.print(druida.nome + " " + "atacou" + " ");
            System.out.print(clerigo.nome + " " + "com");
            System.out.print(" " + druida.poderDivino.nome + " " + "causando ");
            System.out.println(danoCausadoDum + " de dano.");
        }
        System.out.println("#####################");

        //Ataque Druida 2
        int danoCausadoD2 = druida.atacar(feiticeiro);
        if (danoCausadoD2 <= 0 ){
            System.out.println("Duelo finalizado por falta de fe.");
        }
        else {
            System.out.print(druida.nome + " " + "atacou" + " ");
            System.out.print(feiticeiro.nome + " " + "com");
            System.out.print(" " + druida.poderDivino.nome + " " + "causando ");
            System.out.println(danoCausadoD2 + " de dano.");
        }
        System.out.println("#####################");


        //Ataque Clerigo 1
        int danoCausadoCum = clerigo.atacar(druida);
        if (danoCausadoCum <= 0 ){
            System.out.println("Duelo finalizado por falta de fe.");
        }
        else {
            System.out.print(clerigo.nome + " " + "atacou" + " ");
            System.out.print(druida.nome + " " + "com");
            System.out.print(" " + clerigo.poderDivino.nome + " " + "causando ");
            System.out.println(danoCausadoCum + " de dano.");
        }
        System.out.println("#####################");

        //Ataque Clerigo 2
        int danoCausadoC2 = clerigo.atacar(guerreiro);
        if (danoCausadoC2 <= 0 ){
            System.out.println("Duelo finalizado por falta de fe.");
        }
        else {
            System.out.print(clerigo.nome + " " + "atacou" + " ");
            System.out.print(guerreiro.nome + " " + "com");
            System.out.print(" " + clerigo.poderDivino.nome + " " + "causando ");
            System.out.println(danoCausadoC2 + " de dano.");
        }
        System.out.println("#####################");

        //Resultados Finais
        System.out.println("Resultado da Batalha:");
        System.out.print(guerreiro.nome + " apresentou ");
        System.out.println(guerreiro.vida + " de vida ao final do combate.");
        System.out.print(barbaro.nome + " apresentou ");
        System.out.println(barbaro.vida + " de vida ao final do combate.");
        System.out.print(mago.nome + " apresentou ");
        System.out.print(mago.vida + " de vida e ");
        System.out.println(mago.mana + " de mana ao final do combate.");
        System.out.print(feiticeiro.nome+ " apresentou ");
        System.out.print(feiticeiro.vida+ " de vida e ");
        System.out.println(feiticeiro.mana+ " de mana ao final do combate.");
        System.out.print(druida.nome+ " apresentou ");
        System.out.print(druida.vida+ " de vida e ");
        System.out.println(druida.fe+ " de fe ao final do combate.");
        System.out.print(clerigo.nome+ " apresentou ");
        System.out.print(clerigo.vida+ " de vida e ");
        System.out.print(clerigo.fe+ " de fe ao final do combate.");

    }
}
