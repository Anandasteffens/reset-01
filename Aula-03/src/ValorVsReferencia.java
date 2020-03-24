import calculadorapagamentos.Pessoa;

public class ValorVsReferencia {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Leonardo", 170, 22, 'M');
		int inteiro = 1;
		Integer intClass = 1;
		String nome = "nome";

		metodoAlteraPessoa(pessoa);
		metodoMudaInteiro(inteiro);
		metodoMudaString(nome);
	}

	public static void metodoAlteraPessoa(Pessoa pessoa) {
		pessoa.setNome("Mudei de nome");
	}

	public static void metodoMudaInteiro(int numero) {
		numero = 2;
	}

	public static void metodoMudaString(String algumaString) {
		algumaString.concat("teste");
		algumaString = "novo valor";
	}


}
