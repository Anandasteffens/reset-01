package consoleapp;

import dominioclasses.CategoriaFilme;
import dominioclasses.EstiloMusica;
import dominioclasses.Filme;
import gerenciadorregras.RegrasFilme;

import java.beans.beancontext.BeanContextServiceRevokedEvent;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuFilme {

    public RegrasFilme regrasFilme;

    public MenuFilme() {
        this.regrasFilme = new RegrasFilme();
    }

    public void opcao() {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 9) {
            System.out.println("----------------------------");
            System.out.println("Escolha sua opção: ");
            System.out.println("[ 1 ] Cadastrar filme.");
            System.out.println("[ 2 ] Listar filme.");
            System.out.println("[ 3 ] Pesquisar filme.");
            System.out.println("[ 4 ] Deletar filme.");
            System.out.println("[ 5 ] Editar filme.");
            System.out.println("[ 9 ] Sair do programa.");
            System.out.println("-----------------------------");

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
                default:
                    System.out.println("Opção inválida, tente novamente.");

            }
        }
    }

    public Filme cadastrarFilme() {
     // int categoria = 0;

        Scanner scannerint = new Scanner(System.in);
        Scanner scannerln = new Scanner(System.in);
        System.out.println("Preencha as opções abaixo:");

        System.out.print("Nome do filme: ");
        String nome = scannerln.nextLine();

        System.out.print("Diretor do filme: ");
        String diretor = scannerln.nextLine();

        System.out.print("Ano de lançamento: ");
        int ano = scannerint.nextInt();

        System.out.print("Mês de lançamento: ");
        int mes = scannerint.nextInt();

        System.out.print("Dia de lançamento: ");
        int dia = scannerint.nextInt();

        System.out.print("Sinopse do filme: ");
        String sinopse = scannerln.nextLine();

        System.out.println("Escolha a categoria abaixo: ");
        System.out.println("[ 1 ] Drama");
        System.out.println("[ 2 ] Comédia");
        System.out.println("[ 3 ] Suspense");
        System.out.println("[ 4 ] Terror");
        System.out.println("[ 5 ] Ação");
        System.out.println("[ 6 ] Musical");

        int categoria = scannerint.nextInt();

        CategoriaFilme categoriaFilme;

        switch (categoria) {
            case 1:
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case 2:
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case 3:
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case 4:
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case 5:
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case 6:
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.ACAO;
        }

        return new Filme(nome, diretor, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse);
    }

    public Filme cadastrar() {
        Filme filme = cadastrarFilme();
        return regrasFilme.cadastrar(filme);
    }

    private List<Filme> listar() {
        System.out.println("Listar filmes");
        List<Filme> filmes = regrasFilme.listar();
        for (Filme filme : filmes) {
            System.out.println(filme);
        }
        return filmes;
    }

    private void pesquisar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar filmes");
        System.out.println("Digite o código (id) do filme");

        int id = scanner.nextInt();

        Filme filme = regrasFilme.pesquisar(id);

        if (filme == null) {
            System.out.println("Filme não encontrado.");
        } else {
            System.out.println(filme);
        }

    }

    private boolean deletar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletar filme");
        System.out.println("Digite o id do filme que deseja excluir.");

        List<Filme> filmes = regrasFilme.listar();
        for (Filme filme : filmes) {
            System.out.println("[(" + filme.getId() + ")] - " + filme.getNome());
        }
        int id = scanner.nextInt();

        if (regrasFilme.deletar(id)) {
            System.out.println("Filme deletado.");
        } else {
            System.out.println("Filme não encontrado.");
        }
        return false;
    }


        public void editar (){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Editar filme");
            System.out.println("Digite o id do filme que deseja editar.");

            List<Filme> filmes = regrasFilme.listar();

            for (Filme filme : filmes){
                System.out.println("["+filme.getId()+"] - "+ filme.getNome());
            }
            System.out.print("Qual id do filme que deseja editar? ");
            int id = scanner.nextInt();
            Filme filme = cadastrarFilme();
            regrasFilme.editar(id, filme);
        }

    private void encerrar() {
        System.out.println("Programa encerrado.");

    }
}
