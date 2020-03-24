package calculadorapagamentos;

public class Gerente extends Funcionario {

	private double lucroUltimoAno;

	public Gerente(String nome, String cpf, double salario, double lucroUltimoAno) {
		super(nome, cpf, salario);
		this.lucroUltimoAno = lucroUltimoAno;
	}

	@Override
	public double getRemuneracaoMensal() {
		return super.getRemuneracaoMensal() + ((lucroUltimoAno/12) * 0.05);
	}
}
