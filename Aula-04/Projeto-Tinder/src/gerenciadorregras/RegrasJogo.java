package gerenciadorregras;

import acervobd.AcervoFilmes;
import acervobd.AcervoJogo;
import dominioclasses.Jogo;

import java.time.LocalDate;
import java.util.List;

public class RegrasJogo {

    private AcervoJogo acervo = new AcervoJogo();

    public Jogo cadastrar (Jogo jogo){
        List<Jogo> jogos = acervo.listar();

        if (jogo.getNome().isEmpty() || jogo.getDataLancamento() ==null || jogo.getCategoriaJogo() ==null || jogo.getPlataformaJogo() ==null){
            System.out.println("Campos de preenchimento obrigatórios não informados");
            return null;
        }
        for (Jogo jogoExiste : jogos){
            if (jogo.getNome().equals(jogoExiste.getNome())){
                return null;
            }
            if (jogo.getDataLancamento().isAfter(LocalDate.now())){
                return null;
            }
        }
        return acervo.cadastrar(jogo);
    }

    public List<Jogo> listar (){
        return acervo.listar();
    }

    public Jogo pesquisar (int id){
        if (id>0){
            return acervo.pesquisar(id);
        }
        return null;
    }

    public boolean editar (int id, Jogo jogo){
        if (id > 0){
            return acervo.editar(id, jogo);
        }
        return false;
    }

    public boolean deletar (int id){
        if (id >0){
            return acervo.deletar(id);
        }
        return false;
    }

}
