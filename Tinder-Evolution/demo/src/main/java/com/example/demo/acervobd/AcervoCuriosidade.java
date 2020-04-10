package com.example.demo.acervobd;

import com.example.demo.dominioclasses.CategoriaCuriosidade;
import com.example.demo.dominioclasses.Curiosidade;

import java.util.ArrayList;
import java.util.List;

public class AcervoCuriosidade {

    private static int contador = +1;
    private static List<Curiosidade> curiosidades = new ArrayList<>();

    public AcervoCuriosidade(){
//        cadastrar(new Curiosidade("Ler livros terror", CategoriaCuriosidade.COMPORTAMENTO));
//        cadastrar(new Curiosidade("Chocólotra", CategoriaCuriosidade.ALIMENTACAO));
//        cadastrar(new Curiosidade("Cabelos morenos", CategoriaCuriosidade.APARENCIA));
    }

    public Curiosidade cadastrar (Curiosidade curiosidade){
        curiosidade.setId(contador++);
        curiosidades.add(curiosidade);
        return curiosidade;
    }

    public List<Curiosidade> listar (){
        return curiosidades;
    }

    public Curiosidade pesquisar (int id){
        for (Curiosidade curiosidade : curiosidades){
            if (curiosidade.getId()==id){
                return curiosidade;
            }
        }
        return null;
    }
    public Curiosidade editar (int id, Curiosidade curiosidade){
        Curiosidade editarCuriosidade = this.pesquisar(id);
        if (editarCuriosidade != null){
         editarCuriosidade.setDescricao(curiosidade.getDescricao());
         editarCuriosidade.setCategoriaCuriosidade(curiosidade.getCategoriaCuriosidade());
         return editarCuriosidade;
        }
        return null;
    }
    public boolean deletar (int id){
        Curiosidade deltarCuriosidade = this.pesquisar(id);
        if (deltarCuriosidade != null);{
            curiosidades.remove(deltarCuriosidade);
        }
        return false;
    }
}
