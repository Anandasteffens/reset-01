package com.example.demo.consoleapp;

import com.example.demo.dominioclasses.EstiloMusica;
import com.example.demo.dominioclasses.Musica;
import com.example.demo.gerenciadorregras.RegrasMusica;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuMusica {

    public RegrasMusica regrasMusica;


    public MenuMusica() {
        this.regrasMusica = new RegrasMusica();
    }

    public void opcao() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 9) {
            System.out.println(" ----------------------------- ");
            System.out.println("Selecione a opção desejada:");
            System.out.println(" [ 1 ] Criar música: ");
            System.out.println(" [ 2 ] Listar música: ");
            System.out.println(" [ 3 ] Pesquisar música: ");
            System.out.println(" [ 4 ] Deletar música: ");
            System.out.println(" [ 5 ] Editar música: ");
            System.out.println(" [ 9 ] Sair do programa.");
            System.out.println(" ----------------------------- ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criar();
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
                case 0:
                    System.out.println("....");
                default:
                    System.out.println("Opção inválida, tente novamente.");

            }

        }

    }

    public Musica criarMusica() {
        int estilo = 0;
        Scanner scannerln = new Scanner(System.in);
        Scanner scannerint = new Scanner(System.in);
        System.out.println("Vamos começar? \n Preencha as opções abaixo: ");

        System.out.print("Nome da música: ");
        String nome = scannerln.nextLine();

        System.out.print("Artista da música: ");
        String autor = scannerln.nextLine();

        System.out.print("Ano de lançamento: ");
        int ano = scannerint.nextInt();

        System.out.print("Mês de lançamento: ");
        int mes = scannerint.nextInt();

        System.out.print("Dia de lançamento: ");
        int dia = scannerint.nextInt();

        System.out.println("Escolha o estilo músical nas opções abaixo:");
        System.out.println("[ 1 ] Funk");
        System.out.println("[ 2 ] Pagode");
        System.out.println("[ 3 ] Rock");
        System.out.println("[ 4 ] Indie");
        System.out.println("[ 5 ] Sertanejo");
        System.out.println("[ 6 ] Metal");

        estilo = scannerint.nextInt();

        EstiloMusica estiloMusica;

        switch (estilo) {
            case 1:
                estiloMusica = EstiloMusica.FUNK;
                break;
            case 2:
                estiloMusica = EstiloMusica.PAGODE;
                break;
            case 3:
                estiloMusica = EstiloMusica.ROCK;
                break;
            case 4:
                estiloMusica = EstiloMusica.INDIE;
                break;
            case 5:
                estiloMusica = EstiloMusica.SERTANEJO;
                break;
            case 6:
                estiloMusica = EstiloMusica.METAL;
                break;
            default:
                estiloMusica = EstiloMusica.FUNK;
        }
        return new Musica(nome, autor, LocalDate.of(ano, mes, dia), estiloMusica);
    }

    public Musica criar() {
        Musica musica = criarMusica();
        return regrasMusica.criar(musica);
    }

    private void pesquisar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar música");
        System.out.print(" Digite o código da música: ");

        int id = scanner.nextInt();

        Musica musica = regrasMusica.pesquisar(id);

        if (musica == null) {
            System.out.println("Música não encontrada.");
        } else {
            System.out.println(musica);
        }
    }

    private List<Musica> listar() {
        System.out.println("Listar músicas: ");
        List<Musica> musicas = regrasMusica.listar();

        for (Musica musica : musicas) {
            System.out.println(musica);
        }
        return musicas;
    }

    private void deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletar música");

        List<Musica> musicas = regrasMusica.listar();
        for (Musica musica : musicas) {
            System.out.println("[(" + musica.getId() + ")] - " + musica.getNome());
        }
        System.out.print("Digite o id da música que deseja excluir: ");
        int id = scanner.nextInt();

        if (regrasMusica.deletar(id)) {
            System.out.println("Musica deletada.");
        } else {
            System.out.println("Música não encontrada.");
        }

    }

    public void editar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar músicas: ");
        List<Musica> musicas = regrasMusica.listar();
        for (Musica musica : musicas) {
            System.out.println("{" + musica.getId() + "} - " + musica.getNome());
        }
        System.out.print("Digite o id da música que deseja editar:");
        int id = scanner.nextInt();
        Musica musica = criarMusica();
        regrasMusica.editar(id, musica);
    }

    private void encerrar() {
        System.out.println("Programa encerrado.");

    }

}
