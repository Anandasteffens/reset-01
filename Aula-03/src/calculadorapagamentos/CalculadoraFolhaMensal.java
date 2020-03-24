package calculadorapagamentos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraFolhaMensal {

	public static void main(String[] args) {
		System.out.println("----------- Aplicação calculo folha mensal       -----------\n\n");
		int opcao= 0;
		List<Funcionario> funcionarioList = new ArrayList<>();
		while (opcao != 9) {
			imprimeMenu();
			opcao = lerInteiro();
			Scanner scanner = new Scanner(System.in);
			if (opcao == 1) {
				System.out.println("Cadastrar engenheiro: ");
				System.out.print("Nome: ");
				String nome = scanner.next();
				System.out.print("CPF: ");
				String cpf = scanner.next();
				System.out.print("Salário: ");
				Double salario = scanner.nextDouble();
				Engenheiro eng = new Engenheiro (nome, cpf, salario);
				funcionarioList.add(eng);

			} else if (opcao == 2) {
				System.out.println("Cadastrar Programador: ");
				System.out.print("Nome: ");
				String nome = scanner.next();
				System.out.print("CPF: ");
				String cpf = scanner.next();
				System.out.print("Salário: ");
				Double salario = scanner.nextDouble();
				System.out.print("Número de certificações: ");
				int certificacao = scanner.nextInt();
				Programador prog = new Programador (nome, cpf, salario, certificacao);
				funcionarioList.add(prog);
			} else if (opcao == 3) {
				System.out.println("Cadastrar Gerente: ");
				System.out.print("Nome: ");
				String nome = scanner.next();
				System.out.print("CPF: ");
				String cpf = scanner.next();
				System.out.print("Salário: ");
				Double salario = scanner.nextDouble();
				System.out.print("Lucro último ano: ");
				double lucroUlimoAno = scanner.nextDouble();
				Gerente ger = new Gerente (nome, cpf, salario, lucroUlimoAno);
				funcionarioList.add(ger);
			} else {
				System.out.println("----------- Opção Inválida              -----------");

			}
			//Calculo da folha mensal
			double totalDespesas = 0;
			for (Funcionario f : funcionarioList){
				totalDespesas += f.getRemuneracaoMensal();
			}
			System.out.println("Total de custo: "+totalDespesas);
		}


	}

	private static int lerInteiro() {
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}

	private static void imprimeMenu() {
		System.out.println("----------- 1 - Cadastro Engenheiro              -----------");
		System.out.println("----------- 2 - Cadastro Programador             -----------");
		System.out.println("----------- 3 - Cadastro Gerente                 -----------");
		System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
	}
}
