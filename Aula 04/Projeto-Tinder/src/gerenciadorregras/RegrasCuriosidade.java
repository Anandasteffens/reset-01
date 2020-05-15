package gerenciadorregras;

import acervobd.AcervoCuriosidade;
import dominioclasses.Curiosidade;

import java.util.List;

public class RegrasCuriosidade {

    private AcervoCuriosidade acervoCuriosidade = new AcervoCuriosidade();

    public Curiosidade cadastrar (Curiosidade curiosidade){
        List<Curiosidade> curiosidades = acervoCuriosidade.listar();
        if (curiosidade.getDescricao().isEmpty() || curiosidade.getCategoriaCuriosidade()== null){
            System.out.println("Campos de preenchimento obrigatório estão em branco.");
            return null;
        }
        for (Curiosidade curiosidadeExiste : curiosidades){
            if (curiosidade.getDescricao().equals(curiosidadeExiste.getDescricao())){
                return curiosidadeExiste;
            }
        }
        return acervoCuriosidade.cadastrar(curiosidade);
    }

    public List<Curiosidade> listar (){
        return acervoCuriosidade.listar();
    }

    public Curiosidade pesquisar (int id){
        if (id >0){
            return acervoCuriosidade.pesquisar(id);
        }
        return null;
    }
    public boolean editar (int id, Curiosidade curiosidade){
        if (id>0){
            return acervoCuriosidade.editar(id, curiosidade);
        }
        return false;
    }
    public boolean deletar (int id){
        if(id>0){
            return acervoCuriosidade.deletar(id);
        }
        return false;
    }
}
