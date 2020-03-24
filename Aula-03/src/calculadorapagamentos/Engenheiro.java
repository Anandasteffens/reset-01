package calculadorapagamentos;

public class Engenheiro extends Funcionario {

	public Engenheiro(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getRemuneracaoMensal() {
		return super.getRemuneracaoMensal() * 1.1;
	}
}
