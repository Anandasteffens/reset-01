package CombateRPG;

public class AppBatalha {
    public static void main(String[] args) {
        Arma espada = new Arma("Espada",22);

        Arma martelo = new Arma("Martelo",10);

        Magia raioDeFrio = new Magia ("Raio de Frio", 15,25);

        Magia bolaDeFogo = new Magia ("Bola de Fogo", 25,25);

        PoderDivino invocarEnxames = new PoderDivino ("Invocar Enxames",15, 15);

        PoderDivino toqueDeFadiga = new PoderDivino ("Toque de Fadiga",30, 15);

        Guerreiro guerreiro = new Guerreiro("Valeros",150, 5, 35, espada);

        Barbaro barbaro = new Barbaro("Ragnar", 150, 6, 35, martelo);

        Mago mago = new Mago("Aethas", 150, 40, 40, raioDeFrio, 80);

        Feiticeiro feiticeiro = new Feiticeiro("Ramza", 150, 6, 45, bolaDeFogo, 0);

        Druida druida = new Druida("Beatrice", 150, 4, 33, invocarEnxames, 0);

        Clerigo clerigo = new Clerigo("Mayari", 150, 5, 38, toqueDeFadiga, 0);

        //Ataque Guerreiro 1
        System.out.print(guerreiro.nome +" " + "atacou"+ " ");
        System.out.print(barbaro.nome +" "+"com");
        System.out.print(" " +guerreiro.arma.nome + " " +"causando ");
        System.out.print(guerreiro.atacar(barbaro)+ " de dano");
        System.out.println(".");
        //System.out.println("vida do barbaro " +barbaro.vida);
        System.out.println("#####################");

        //Ataque Guerreiro 2
        System.out.println("#####################");
        System.out.print(guerreiro.nome +" " + "atacou"+ " ");
        System.out.print(mago.nome +" "+"com");
        System.out.print(" " +guerreiro.arma.nome + " " +"causando ");
        System.out.print(guerreiro.atacar(mago)+ " de dano");
        System.out.println(".");
        //System.out.println("vida do mago " +mago.vida);
        System.out.println("#####################");
        
        //Ataque Barbaro 1
        System.out.println("#####################");
        System.out.print(barbaro.nome +" " + "atacou"+ " ");
        System.out.print(clerigo.nome +" "+"com");
        System.out.print(" " +barbaro.arma.nome + " " +"causando ");
        System.out.print(barbaro.atacar(clerigo)+ " de dano");
        System.out.println(".");
        System.out.println("#####################");

        //Ataque Barbaro 2
        System.out.println("#####################");
        System.out.print(barbaro.nome +" " + "atacou"+ " ");
        System.out.print(feiticeiro.nome +" "+"com");
        System.out.print(" " +barbaro.arma.nome + " " +"causando ");
        System.out.print(barbaro.atacar(feiticeiro)+ " de dano");
        System.out.println(".");
        //System.out.print();
        System.out.println("#####################");

        //Ataque Mago 1
        System.out.println("#####################");
        int danoCausado = mago.atacar(druida);
        if (danoCausado <= 0 ){
            System.out.println("Duelo finalizado por falta de mana");
        }
        System.out.print(mago.nome +" " + "atacou"+ " ");
        System.out.print(druida.nome +" "+"com");
        System.out.print(" " +mago.magia.nome + " " +"causando ");
        System.out.print(mago.atacar(druida)+ " de dano");
        System.out.println(".");
        //System.out.println("mana eh: " +mago.mana);
       // System.out.print();
        System.out.println("#####################");

        //Ataque Mago 2
        System.out.println("#####################");
        int danoCausado = mago.atacar(guerreiro);
        if (danoCausado <= 0 ){
            System.out.println("Duelo finalizado por falta de mana");
        }
        System.out.print(mago.nome +" " + "atacou"+ " ");
        System.out.print(guerreiro.nome +" "+"com");
        System.out.print(" " +mago.magia.nome + " " +"causando ");
        System.out.print(danoCausado+ " de dano");
        System.out.println(".");
       // System.out.println("mana eh: " +mago.mana);
       // System.out.print();
        System.out.println("#####################");


        //Ataque Feiticeiro 1
        System.out.println("#####################");
        int danoCausado = feiticeiro.atacar(barbaro);
        if (danoCausado <= 0 ){
            System.out.println("Duelo finalizado por falta de mana");
        }
        System.out.print(feiticeiro.nome +" " + "atacou"+ " ");
        System.out.print(barbaro.nome +" "+"com");
        System.out.print(" " +feiticeiro.magia.nome + " " +"causando ");
        System.out.print(feiticeiro.atacar(barbaro)+ " de dano");
        System.out.println(".");
      //  System.out.println("mana eh: " +feiticeiro.mana);
       // System.out.print();
        System.out.println("#####################");

        //Ataque Feiticeiro 2
        System.out.println("#####################");
        int danoCausado = feiticeiro.atacar(mago);
        if (danoCausado <= 0 ){
            System.out.println("Duelo finalizado por falta de mana");
        }
        System.out.print(feiticeiro.nome +" " + "atacou"+ " ");
        System.out.print(mago.nome +" "+"com");
        System.out.print(" " +feiticeiro.magia.nome + " " +"causando ");
        System.out.print(feiticeiro.atacar(mago)+ " de dano");
        System.out.println(".");
       // System.out.println("mana eh: " +feiticeiro.mana);
        //System.out.print();
        System.out.println("#####################");


        //Ataque Druida 1
        System.out.println("#####################");
        int danoCausado = druida.atacar(clerigo);
        if (danoCausado <= 0 ){
            System.out.println("Duelo finalizado por falta de fe");
        }
        System.out.print(druida.nome +" " + "atacou"+ " ");
        System.out.print(clerigo.nome +" "+"com");
        System.out.print(" " +druida.poderDivino.nome + " " +"causando ");
        System.out.print(druida.atacar(clerigo)+ " de dano");
        System.out.println(".");
        //System.out.println("a fe eh: " +druida.fe);
        //System.out.print();

        //Ataque Druida 2
        System.out.println("#####################");
        int danoCausado = druida.atacar(feiticeiro);
        if (danoCausado <= 0 ){
            System.out.println("Duelo finalizado por falta de fe");
        }
        System.out.print(druida.nome +" " + "atacou"+ " ");
        System.out.print(feiticeiro.nome +" "+"com");
        System.out.print(" " +druida.poderDivino.nome + " " +"causando ");
        System.out.print(druida.atacar(feiticeiro)+ " de dano");
        System.out.println(".");
       // System.out.println("a fe eh: " +druida.fe);
        //System.out.print();
        System.out.println("#####################");

        //Ataque Clerigo 1
        System.out.println("#####################");
        int danoCausado = clerigo.atacar(druida);
        if (danoCausado <= 0 ){
            System.out.println("Duelo finalizado por falta de fe");
        }
        System.out.print(clerigo.nome +" " + "atacou"+ " ");
        System.out.print(druida.nome +" "+"com");
        System.out.print(" " +clerigo.poderDivino.nome + " " +"causando ");
        System.out.print(clerigo.atacar(druida)+ " de dano");
        System.out.println(".");
       // System.out.println("fe eh: " +clerigo.fe);
        //System.out.print();
        System.out.println("#####################");

        //Ataque Clerigo 2
        System.out.println("#####################");
        int danoCausado = clerigo.atacar(guerreiro);
        if (danoCausado <= 0 ){
            System.out.println("Duelo finalizado por falta de fe");
        }
        System.out.print(clerigo.nome +" " + "atacou"+ " ");
        System.out.print(guerreiro.nome +" "+"com");
        System.out.print(" " +clerigo.poderDivino.nome + " " +"causando ");
        System.out.print(clerigo.atacar(guerreiro)+ " de dano");
        System.out.println(".");
       // System.out.println("fe eh: " +clerigo.fe);
        //System.out.print();
        System.out.println("#####################");
        System.out.println("#####################");

        //Resultados Finais
        System.out.println("Resultado da Batalha:");
        System.out.print(guerreiro.nome+ " apresentou ");
        System.out.println(guerreiro.vida+ " de vida ao final do combate.");
        System.out.print(barbaro.nome+ " apresentou ");
        System.out.println(barbaro.vida+ " de vida ao final do combate.");
        System.out.print(mago.nome+ " apresentou ");
        System.out.print(mago.vida+ " de vida e ");
        System.out.println(mago.mana+ " de mana ao final do combate.");
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
