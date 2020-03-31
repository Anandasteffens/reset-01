package com.example.demo.consoleapp;

import com.example.demo.dominioclasses.CategoriaCuriosidade;
import com.example.demo.dominioclasses.Curiosidade;
import com.example.demo.gerenciadorregras.RegrasCuriosidade;

import java.util.List;
import java.util.Scanner;

public class MenuCuriosidade {

    public RegrasCuriosidade regrasCuriosidade;

    public MenuCuriosidade (){
        this.regrasCuriosidade = new RegrasCuriosidade();
    }

    public void opcao (){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        while (opcao!= 9){
            System.out.println("-----------------------");
            System.out.println("Selecione a opção desejada:");
            System.out.println("[ 1 ] Cadastrar curiosidade.");
            System.out.println("[ 2 ] Listar curiosidade.");
            System.out.println("[ 3 ] Pesquisar curiosidade.");
            System.out.println("[ 4 ] Deletar curiosidade.");
            System.out.println("[ 5 ] Editar curiosidade.");
            System.out.println("[ 9 ] Sair do programa.");
            System.out.println("------------------------");

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
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
    }

    public Curiosidade cadastrarCuriosidade (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Preencha as opções abaixo: ");
        System.out.print("Descreva sua curiosidade: ");
        String descricao = scanner.nextLine();

        System.out.println(" Escolha a categoria da curiosidade descrita acima:");
        System.out.println("[ 1 ] Comportamento");
        System.out.println("[ 2 ] Evento");
        System.out.println("[ 3 ] Aparência");
        System.out.println("[ 4 ] Alimentação");

        int categoria = 0;
        categoria = scanner.nextInt();

        CategoriaCuriosidade categoriaCuriosidade;

        switch (categoria){
            case 1:
                categoriaCuriosidade=CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case 2:
                categoriaCuriosidade=CategoriaCuriosidade.EVENTO;
                break;
            case 3:
                categoriaCuriosidade=CategoriaCuriosidade.APARENCIA;
                break;
            case 4:
                categoriaCuriosidade=CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade=CategoriaCuriosidade.ALIMENTACAO;
        }
        return new Curiosidade(descricao, categoriaCuriosidade);
    }

    public Curiosidade cadastrar (){
        Curiosidade curiosidade = cadastrarCuriosidade();
        return regrasCuriosidade.cadastrar(curiosidade);
    }

    public void pesquisar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar curiosidade");
        System.out.print("Digite o id da curiosidade que deseja pesquisar: ");
        int id = scanner.nextInt();

        Curiosidade curiosidade = regrasCuriosidade.pesquisar(id);

        if (curiosidade == null){
            System.out.println("Música não encontrada.");
        }
        else{
            System.out.println(curiosidade);
        }
    }

    private List<Curiosidade> listar (){
        System.out.println("Listar Curiosidade");
        List<Curiosidade> curiosidades = regrasCuriosidade.listar();

        for (Curiosidade curiosidade : curiosidades){
            System.out.println(curiosidade);
        }
        return curiosidades;
    }

    private void deletar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletar Curiosidade.");

        List<Curiosidade> curiosidades = regrasCuriosidade.listar();

        for (Curiosidade curiosidade : curiosidades){
            System.out.println("[("+curiosidade.getId()+")] - "+ curiosidade.getDescricao());
        }
        System.out.print("Digite o id da curiosidade que deseja deletar: ");
        int id = scanner.nextInt();

        if (regrasCuriosidade.deletar(id)){
            System.out.println("Curiodiade deletada.");
        }
        else {
            System.out.println("Musica não encontrada.");
        }
    }
    public void editar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar música");

        List<Curiosidade> curiosidades = regrasCuriosidade.listar();
        for (Curiosidade curiosidade : curiosidades){
            System.out.println("[("+curiosidade.getId()+")] -"+curiosidade.getDescricao());
        }
        System.out.print("Digite o id da música que deseja editar: ");
        int id = scanner.nextInt();
        Curiosidade curiosidade = cadastrarCuriosidade();
        regrasCuriosidade.editar(id, curiosidade);
    }
    private void encerrar() {
        System.out.println("Programa encerrado.");
    }
}

