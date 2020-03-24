package calculadorapagamentos;

public class Programador extends Funcionario {

	private int numeroCertificacaoes;

	public Programador(String nome, String cpf, double salario, int numeroCertificacaoes) {
		super(nome, cpf, salario);
		this.numeroCertificacaoes = numeroCertificacaoes;
	}

	@Override
	public double getRemuneracaoMensal() {
		return super.getRemuneracaoMensal() + (numeroCertificacaoes * 100);
	}
}
