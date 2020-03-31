package com.example.demo.consoleapp;

import com.example.demo.dominioclasses.Usuario;
import com.example.demo.gerenciadorregras.RegrasUsuario;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class MenuUsuario {

    public RegrasUsuario regrasUsuario;

    public MenuUsuario(){
        this.regrasUsuario= new RegrasUsuario();
    }
    public void opcao(){
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 9){
            System.out.println("------------------------------");
            System.out.println("Selecione a opção desejada. ");
            System.out.println("[ 1 ] Cadastrar usuário.");
            System.out.println("[ 2 ] Listar usuário.");
            System.out.println("[ 3 ] Pesquisar usuário.");
            System.out.println("[ 4 ] Deletar usuário.");
            System.out.println("[ 5 ] Editar usuário.");
            System.out.println("[ 9 ] Sair do programa.");
            System.out.println("------------------------------");

            opcao=scanner.nextInt();

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
                case 0:
                    System.out.println("....");
                default:
                    System.out.println("Opção inválida, tente novamente.");

            }

        }

    }

    public Usuario cadastrarUsuario () {

        Double latitude = 0.0;
        Double longitude = 0.0;

        Scanner scannerint = new Scanner(System.in);
        Scanner scannerln = new Scanner(System.in);
        System.out.println("Preencha as opções abaixo: ");

        System.out.print("Nome do usuário: ");
        String nome = scannerln.nextLine();

        System.out.print("Email do usuário: ");
        String email = scannerln.nextLine();

        System.out.print("Telefone do usuário: ");
        String telefone = scannerln.nextLine();

        System.out.print("Ano de nascimento: ");
        int ano = scannerint.nextInt();

        System.out.print("Mês de nascimento: ");
        int mes = scannerint.nextInt();

        System.out.print("Dia de nascimento: ");
        int dia = scannerint.nextInt();

        System.out.print("Insira a biografia do usuário: ");
        String bio = scannerln.nextLine();

        System.out.print("Insira sua localização geográfica- Latitude: ");
        latitude = scannerint.nextDouble();

        System.out.print("Longitude: ");
        longitude = scannerint.nextDouble();

        return new Usuario(nome, email, telefone, LocalDate.of(ano, mes, dia), bio, latitude, longitude);

    }

    public Usuario cadastrar(){
        Usuario usuario = cadastrarUsuario();
        return regrasUsuario.cadastrar(usuario);
    }

    private void pesquisar (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pesquisar usuário");
        System.out.println("Digite o codigo do usuário:");

        int id = scanner.nextInt();
        Usuario usuario = regrasUsuario.pesquisar(id);

        if ( usuario == null){
            System.out.println("Usuário não encontrado.");
        }
        else {
            System.out.println(usuario);
        }
    }

    private List<Usuario> listar (){
        System.out.println("Listar usuários");
        List<Usuario> usuarios = regrasUsuario.listar();

        for (Usuario usuario : usuarios){
            System.out.println(usuario);
        }
        return usuarios;
    }

    private void deletar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deletar usuário.");
        System.out.println(" Informe o código do usuário que deseja deletar: ");
        List<Usuario> usuarios = regrasUsuario.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("[(" + usuario.getId() + ")] - " + usuario.getNome());
        }
        int id = scanner.nextInt();

        if (regrasUsuario.deletar(id)){
            System.out.println("Usuário deletado.");
        }
        else {
            System.out.println("Usuário não encontrado.");
        }

    }

    private void editar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Editar usuário.");
        List<Usuario> usuarios = regrasUsuario.listar();
        for (Usuario usuario : usuarios) {
            System.out.println("{" + usuario.getId() + "} - " + usuario.getNome());
        }
        System.out.println("Qual usuário (id) deseja editar: ");
        int id = scanner.nextInt();
        Usuario usuario = cadastrarUsuario();
        regrasUsuario.editar(id, usuario);
    }

    public void encerrar() {
        System.out.println("Programa encerrado.");

    }
}
