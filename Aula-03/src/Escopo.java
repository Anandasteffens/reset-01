import calculadorapagamentos.Pessoa;

public class Escopo {

	public static void main(String[] args) {

		int numero = 2;

		if (numero == 2) {
			String nome = "Joao";
		}

		// System.out.println(nome); //-- Erro

		algumaFuncao();
		algumaFuncaoComParametro(numero);

		Pessoa pessoa = new Pessoa("Maria", 170, 30, 'F');
		pessoa.getNome();
	}

	public static void algumaFuncao() {
		// System.out.println(numero);

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
		}

//		System.out.println(i);
	}

	public static void algumaFuncaoComParametro(int parametro) {
		System.out.println(parametro);

//		System.out.println(i);

		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			System.out.println(parametro);

			if (i == 2) {
				System.out.println(i);
			}

		}

	}

}
