package calculadorapagamentos;

public class Funcionario {

	private static int totalFuncionarios = 0;

	private String nome;
	private String cpf;
	private double salario;

	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		totalFuncionarios++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getRemuneracaoMensal() {
		return this.salario;
	}

	public void imprimirFolha(Funcionario ) {
		getRemuneracaoMensal();
	}
}
