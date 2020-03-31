package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoCuriosidade;
import com.example.demo.dominioclasses.Curiosidade;

import java.util.List;

public class RegrasCuriosidade {

    private AcervoCuriosidade acervoCuriosidade = new AcervoCuriosidade();

    public Curiosidade cadastrar (Curiosidade curiosidade){
        List<Curiosidade> curiosidades = acervoCuriosidade.listar();
        if (curiosidade.getDescricao().isEmpty() || curiosidade.getCategoriaCuriosidade()== null){
            System.out.println("Campos de preenchimento obrigatórios não informados");
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
    public Curiosidade editar (int id, Curiosidade curiosidade){
        if (id>0){
            return acervoCuriosidade.editar(id, curiosidade);
        }
        return null;
    }
    public boolean deletar (int id){
        if(id>0){
            return acervoCuriosidade.deletar(id);
        }
        return false;
    }
}
