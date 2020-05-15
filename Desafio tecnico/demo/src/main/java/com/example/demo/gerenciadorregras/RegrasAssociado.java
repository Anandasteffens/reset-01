package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoAssociado;
import com.example.demo.dominioclasses.Associado;

import java.util.List;

public class RegrasAssociado {
    private AcervoAssociado acervo = new AcervoAssociado();

    public Associado cadastrar (Associado usuario){
        List<Associado> usuarios = acervo.listar();
        for (Associado usuarioExiste : usuarios){
            if (usuario.getNome().equals(usuarioExiste.getNome())){
                return usuarioExiste;
            }
        }
        return acervo.cadastrar(usuario);
    }

    public List<Associado> listar () {return acervo.listar();}
}
