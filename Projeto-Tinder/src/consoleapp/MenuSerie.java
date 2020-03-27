package consoleapp;
import dominioclasses.CategoriaSerie;
import dominioclasses.Serie;
import gerenciadorregras.RegrasSerie;

import javax.swing.text.DefaultEditorKit;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuSerie {

    public RegrasSerie regrasSerie;

    public MenuSerie (){
        this.regrasSerie = new RegrasSerie();

    }

    public void opcao (){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 9){
            System.out.println("-------------------------");
            System.out.println("Selecione a opção desejada: ");
            System.out.println("[ 1 ] Cadastrar série.");
            System.out.println("[ 2 ] Listar série.");
            System.out.println("[ 3 ] Pesquisar série.");
            System.out.println("[ 4 ] Deletar série.");
            System.out.println("[ 5 ] Editar série ");
            System.out.println("[ 9 ] Sair do programa.");
            System.out.println("----------------------------");

            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    cadastrar();
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
                    editar();
                    break;
                case 9:
                    encerrar ();
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");

            }

        }
    }

    public Serie cadastrarSerie (){
        Scanner scanerint = new Scanner(System.in);
        Scanner scannerln = new Scanner(System.in);

        System.out.println("Preencha as opções abaixo: ");

        System.out.print("Qual o nome da série: ");
        String nome = scannerln.nextLine();

        System.out.print("Qual o nome do diretor da série: ");
        String diretor = scannerln.nextLine();

        System.out.print("Qual o ano de lançamento da série: ");
        int ano = scanerint.nextInt();

        System.out.print("Qual o mês de lançamento da série: ");
        int mes = scanerint.nextInt();

        System.out.print("Qual o dia de lançamento da série: ");
        int dia = scanerint.nextInt();

        System.out.print("Qual o número de temporadas da série: ");
        int numeroTemporada = scanerint.nextInt();

        System.out.print("Qual o número de episódios da série: ");
        int numeroEpisodios = scanerint.nextInt();

        System.out.print("Qual a sinopse da série: ");
        String sinopse = scannerln.nextLine();

        System.out.println("Escolha a categoria da série abaixo: ");
        System.out.println("[ 1 ] - Drama.");
        System.out.println("[ 2 ] - Comédia.");
        System.out.println("[ 3 ] - Suspense.");
        System.out.println("[ 4 ] - Terror.");
        System.out.println("[ 5 ] - Ação.");
        System.out.println("[ 6 ] - Sitcom.");

        int categoria = scanerint.nextInt();

        CategoriaSerie categoriaSerie;

        switch (categoria){
            case 1:
                categoriaSerie=CategoriaSerie.DRAMA;
                break;
            case 2:
                categoriaSerie=CategoriaSerie.COMEDIA;
                break;
            case 3:
                categoriaSerie=CategoriaSerie.SUSPENSE;
                break;
            case 4:
                categoriaSerie=CategoriaSerie.TERROR;
                break;
            case 5:
                categoriaSerie=CategoriaSerie.ACAO;
                break;
            case 6:
                categoriaSerie=CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie=CategoriaSerie.SITCOM;
        }
        return new Serie(nome, diretor, LocalDate.of(ano, mes, dia), numeroTemporada, numeroEpisodios, categoriaSerie, sinopse);
    }

    public Serie cadastrar (){
        Serie serie = cadastrarSerie();
        return regrasSerie.cadastrar(serie);
    }

    private List<Serie> listar (){
        List<Serie> series = regrasSerie.listar();
        System.out.println("Listar séries");
        for (Serie serie : series){
            System.out.println(serie);
        }
        return series;
    }

    private void pesquisar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar série.");
        System.out.print("Digite o id da série: ");

        int id = scanner.nextInt();

        Serie serie = regrasSerie.pesquisar(id);

        if (serie == null){
            System.out.println("Série não encontrada.");
        }
        else {
            System.out.println(serie);
        }
    }

    private void editar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar séries");

        List<Serie> series = regrasSerie.listar();
        for (Serie serie : series){
            System.out.println("[("+serie.getId()+")] -"+ serie.getNome());
        }
        System.out.print("Digite o id da série que deseja editar: ");
        int id = scanner.nextInt();
        Serie serie = cadastrarSerie();
        regrasSerie.editar(id, serie);
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletar série");

        List<Serie> series = regrasSerie.listar();
        for (Serie serie : series){
            System.out.println("[("+serie.getId()+")] -"+ serie.getNome());
        }
        System.out.print("Digite o id da série que deseja deletar.");
        int id = scanner.nextInt();

        if (regrasSerie.deletar(id)){
            System.out.println("Série deletada.");
        }
        else {
            System.out.println("Série não encontrada;");
        }
    }

    private void encerrar(){
        System.out.println("Programa encerrado.");
    }

}
