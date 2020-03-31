package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoUsuario;
import com.example.demo.dominioclasses.Usuario;

import java.util.List;

public class RegrasUsuario {
    private AcervoUsuario acervo = new AcervoUsuario();

    public Usuario cadastrar(Usuario usuario) {
        List<Usuario> usuarios = acervo.listar();
        if (usuario.confirmarIdade(usuario.getDataNascimento())<18){
            System.out.println("Aplicativo para maiores de 18 anos.");
            return null;
        }
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() ||
                usuario.getDataNascimento() == null || usuario.getBio().isEmpty()|| usuario.getLatitude().isNaN() || usuario.getLongitude().isNaN() )
        {
            System.out.println("Campos de preenchimento obrigatórios não informados");
            return null;
        }
        for (Usuario usuarioExiste : usuarios) {
            if (usuario.getNome().equals(usuarioExiste.getNome())) {
                return usuarioExiste;
            }
            if (usuario.getEmail().equals(usuarioExiste.getEmail())) {
                return usuarioExiste;
            }
        }
        return acervo.cadastrar(usuario);
    }


    public List<Usuario> listar (){
        return acervo.listar();
    }

    public Usuario pesquisar (int id){
        if (id >0 ){
            return acervo.pesquisar(id);
        }
        return null;
    }

    public boolean deletar (int id){
        if (id >0){
            return acervo.deletar(id);
        }
        return false;
    }

    public Usuario editar (int id, Usuario usuario){
        if (id>0) {
            return acervo.editar(id, usuario);
        }
        return null;
    }

}
