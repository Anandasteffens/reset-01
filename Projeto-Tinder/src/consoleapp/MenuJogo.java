package consoleapp;

import dominioclasses.CategoriaJogo;
import dominioclasses.Filme;
import dominioclasses.Jogo;
import dominioclasses.PlataformaJogo;
import gerenciadorregras.RegrasJogo;

import javax.swing.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuJogo {

    public RegrasJogo regrasJogo;

    public MenuJogo (){
        this.regrasJogo = new RegrasJogo();
    }

    public void opcao () {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 9) {
            System.out.println("-------------------------");
            System.out.println("[ 1 ] Cadastrar jogo.");
            System.out.println("[ 2 ] Listar jogo.");
            System.out.println("[ 3 ] Pesquisar jogo.");
            System.out.println("[ 4 ] Deletar jogo.");
            System.out.println("[ 5 ] Editar jogo.");
            System.out.println("[ 9 ] Sair do programa.");
            System.out.println("--------------------------");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    listar();
                    break;
                case 3:
                    pesquisar();
                    break;
                case 4:
                    deletar();
                    break;
                case 5:
                    editar();
                    break;
                case 9:
                    encerrar();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }

        }
    }
    public Jogo cadastrarJogo (){
        Scanner scannerint = new Scanner(System.in);
        Scanner scannerln = new Scanner(System.in);

        System.out.println("Preencha as opções abaixo:");

        System.out.print("Qual o nome do jogo: ");
        String nome = scannerln.nextLine();

        System.out.print(" Qual o publisher do jogo: ");
        String publisher = scannerln.nextLine();

        System.out.println("Qual o ano de lançamento do jogo: ");
        int ano = scannerint.nextInt();

        System.out.println("Qual o mês do lançamento do jogo: ");
        int mes = scannerint.nextInt();

        System.out.println("Qual o dia do lançamento do jogo:");
        int dia = scannerint.nextInt();

        System.out.println("Escolha a categoria abaixo:");
        System.out.println("[ 1 ] Drama");
        System.out.println("[ 2 ] Comédia");
        System.out.println("[ 3 ] Suspense");
        System.out.println("[ 4 ] Terror");
        System.out.println("[ 5 ] Ação");
        System.out.println("[ 6 ] Musical");

        int categoria = scannerint.nextInt();

        CategoriaJogo categoriaJogo;

        switch (categoria){
            case 1:
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case 2:
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case 3:
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case 4:
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case 5:
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case 6:
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.MUSICAL;
        }

        System.out.println("Escolha a plataforma abaixo:");
        System.out.println("[ 1 ] XBOX");
        System.out.println("[ 2 ] ps4");
        System.out.println("[ 3 ] PC");
        System.out.println("[ 4 ] SNES");

        int plataforma = scannerint.nextInt();

        PlataformaJogo plataformaJogo;

        switch (plataforma){
            case 1:
                plataformaJogo =PlataformaJogo.XBOX;
                break;
            case 2:
                plataformaJogo = PlataformaJogo.PS4;
                break;
            case 3:
                plataformaJogo = PlataformaJogo.PC;
                break;
            case 4:
                plataformaJogo = PlataformaJogo.SNES;
                break;
            default:
                plataformaJogo = PlataformaJogo.SNES;
        }
        return new Jogo(nome, publisher, LocalDate.of(ano, mes, dia), categoriaJogo, plataformaJogo);

    }

    public Jogo cadastrar(){
        Jogo jogo = cadastrarJogo();
        return regrasJogo.cadastrar(jogo);
    }

    private List<Jogo> listar (){
        System.out.println("Listar jogos");
            List<Jogo> jogos = regrasJogo.listar();
            for (Jogo jogo : jogos){
                System.out.println(jogo);
            }
            return jogos;
    }

    private void pesquisar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar jogos...");
        System.out.println("Digite o id do jogo");

        int id = scanner.nextInt();

        Jogo jogo = regrasJogo.pesquisar(id);

        if (jogo == null){
            System.out.println("Jogo não encontrado.");
        }
        else {
            System.out.println(jogo);
        }
    }

    private void editar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar jogos...");

        List<Jogo> jogos = regrasJogo.listar();
        for (Jogo jogo : jogos){
            System.out.println("["+jogo.getId()+"] - "+ jogo.getNome());
        }
        System.out.print("Qual id do jogo que deseja editar? ");
        int id = scanner.nextInt();
        Jogo jogo = cadastrarJogo();
        regrasJogo.editar(id, jogo);
    }

    private boolean deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletar jogo");

        List<Jogo> jogos = regrasJogo.listar();
        for (Jogo jogo : jogos) {
            System.out.println("[(" + jogo.getId() + ")] - " + jogo.getNome());
        }
        int id = scanner.nextInt();

        if (regrasJogo.deletar(id)) {
            System.out.println("Jogo deletado.");
        } else {
            System.out.println("Jogo não encontrado.");
        }
        return false;
    }


    private void encerrar() {
        System.out.println("Programa encerrado.");

    }
}
