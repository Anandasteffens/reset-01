package acervobd;

import dominioclasses.Curiosidade;

import javax.crypto.Cipher;
import java.util.ArrayList;
import java.util.List;

public class AcervoCuriosidade {

    private static int contador = +1;
    private static List<Curiosidade> curiosidades = new ArrayList<>();

    public Curiosidade cadastrar (Curiosidade curiosidade){
        curiosidade.setId(contador++);
        curiosidades.add(curiosidade);
        return curiosidade;
    }

    public List<Curiosidade> listar (){
        if (curiosidades == null){
            return null;
        }
        else {return curiosidades;}
    }

    public Curiosidade pesquisar (int id){
        for (Curiosidade curiosidade : curiosidades){
            if (curiosidade.getId()==id){
                return curiosidade;
            }
        }
        return null;
    }
    public boolean editar (int id, Curiosidade curiosidade){
        Curiosidade editarCuriosidade = this.pesquisar(id);
        if (editarCuriosidade != null){
            curiosidade.setId(id);
            int a = curiosidades.indexOf(editarCuriosidade);
            curiosidades.set(a, curiosidade);
        }
        return false;
    }
    public boolean deletar (int id){
        Curiosidade deltarCuriosidade = this.pesquisar(id);
        if (deltarCuriosidade != null);{
            curiosidades.remove(deltarCuriosidade);
        }
        return false;
    }
}
