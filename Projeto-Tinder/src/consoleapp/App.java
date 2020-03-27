package consoleapp;

import dominioclasses.Musica;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        MenuMusica menuMusica = new MenuMusica();
        MenuUsuario menuUsuario = new MenuUsuario();
        MenuFilme menuFilme = new MenuFilme();
        MenuJogo menuJogo = new MenuJogo();
        MenuSerie menuSerie = new MenuSerie();
        MenuCuriosidade menuCuriosidade = new MenuCuriosidade();

        Scanner scanner = new Scanner(System.in);
        char escolher = ' ';

        while (escolher != 'X'){
            System.out.println("Selecione uma opção:");
            System.out.println("[ M ] - Músicas");
            System.out.println("[ U ] - Usuário");
            System.out.println("[ F ] - Filme");
            System.out.println("[ J ] - Jogo");
            System.out.println("[ S ] - Série");
            System.out.println("[ C ] - Curiosidade");
            System.out.println("[ X ] - Encerrar programa");
            escolher = scanner.next().charAt(0);

            switch (escolher){
                case 'M':
                    menuMusica.opcao();
                    break;
                case 'U':
                    menuUsuario.opcao();
                    break;
                case 'F':
                    menuFilme.opcao();
                    break;
                case 'J':
                    menuJogo.opcao();
                case 'S':
                    menuSerie.opcao();
                    break;
                case 'C':
                    menuCuriosidade.opcao();
                    break;
                case 'X':
                        System.out.println("Encerreando programa. :) ");
                        break;
                default:
                    System.out.println("Opção inválida.");

            }
        }

    }
}
