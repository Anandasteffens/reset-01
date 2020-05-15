package com.example.demo.acervobd;

import com.example.demo.dominioclasses.Associado;

import java.util.ArrayList;
import java.util.List;

public class AcervoAssociado {

    private static int contador = +1;
    private static List<Associado> usuarios = new ArrayList<>();

    public Associado cadastrar (Associado usuario){
        usuario.setId(contador++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Associado> listar () {return new ArrayList<Associado>(usuarios);}
}
