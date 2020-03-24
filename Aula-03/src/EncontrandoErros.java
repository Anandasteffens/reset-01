import calculadorapagamentos.Pessoa;

import java.util.ArrayList;
import java.util.List;

public class EncontrandoErros {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa("Joao", 170, 20, 'M');

		List<Pessoa> listaPessoas = new ArrayList<>();
		listaPessoas.add(pessoa);

		pessoa = null;

//		pessoa.getNome();

		for (int i = 0; i <= listaPessoas.size(); i++) {
			System.out.println(listaPessoas.get(i).getNome());
		}
	}
}
