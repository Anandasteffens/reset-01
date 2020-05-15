package consoleapp;

import dominioclasses.Esporte;
import dominioclasses.Jogo;
import dominioclasses.Musica;
import gerenciadorregras.RegrasEsporte;

import java.util.List;
import java.util.Scanner;

public class MenuEsporte {

    public RegrasEsporte regrasEsporte = new RegrasEsporte();

    public MenuEsporte (){
        this.regrasEsporte = new RegrasEsporte();
    }

    public void opcao (){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao !=9){
            System.out.println("----------------------------");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[ 1 ] Cadastrar esporte.");
            System.out.println("[ 2 ] Listar esporte.");
            System.out.println("[ 3 ] Pesquisar esporte.");
            System.out.println("[ 4 ] Deletar esporte.");
            System.out.println("[ 5 ] Editar esporte.");
            System.out.println("[ 9 ] Sair do programa.");
            System.out.println("--------------------------");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    cadastrar ();
                    break;
                case 2:
                    listar ();
                    break;
                case 3:
                    pesquisar ();
                    break;
                case 4:
                    deletar ();
                    break;
                case 5:
                    editar ();
                    break;
                case 9:
                    encerrar ();
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public Esporte cadastrarEsporte (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha as opções abaixo:");
        System.out.print("Qual o nome do esporte: ");
        String nome = scanner.nextLine();
        return new Esporte(nome);
    }

    public Esporte cadastrar() {
        Esporte esporte = cadastrarEsporte();
        return regrasEsporte.cadastrar(esporte);
    }

    public void pesquisar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar esporte.");
        System.out.print("Digite o id do esporte:");
        int id = scanner.nextInt();

        Esporte esporte = regrasEsporte.pesquisar(id);
        if (esporte ==null){
            System.out.println("Esporte não encontrado.");
        }
        else {
            System.out.println(esporte);
        }
    }

    private List<Esporte> listar (){
        System.out.println("Listar esportes: ");
        List<Esporte> esportes = regrasEsporte.listar();

        for (Esporte esporte : esportes) {
            System.out.println(esporte);
        }
        return esportes;
    }

    public void editar (){
        Scanner scannerInt = new Scanner(System.in);
        System.out.println("Editar esporte.");
        List<Esporte> esportes = regrasEsporte.listar();
        for (Esporte esporte : esportes) {
            System.out.println("{" + esporte.getId() + "} - " + esporte.getNome());
        }
        System.out.print("Digite o id da música que deseja editar: ");
        int id = scannerInt.nextInt();
        Esporte esporte = cadastrarEsporte();
        regrasEsporte.editar(id, esporte);
        }

        public void deletar (){
        Scanner scanner = new Scanner(System.in);
            System.out.println("Deletar música");

            List<Esporte> esportes = regrasEsporte.listar();
            for (Esporte esporte : esportes) {
                System.out.println("{" + esporte.getId() + "} - " + esporte.getNome());
            }
            System.out.print("Digite o id da música que deseja deletar: ");
            int id = scanner.nextInt();

            if (regrasEsporte.deletar(id)) {
                System.out.println("Esporte deletado.");
            } else {
                System.out.println("Esporte não encontrado.");
            }

        }

    private void encerrar() {
        System.out.println("Programa encerrado.");

    }

    }

