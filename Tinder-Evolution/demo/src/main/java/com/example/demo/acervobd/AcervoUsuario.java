package com.example.demo.acervobd;

import com.example.demo.dominioclasses.Usuario;
import com.example.demo.gerenciadorregras.RegrasUsuario;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AcervoUsuario {
    private static int contador = +1;
    private static List<Usuario> usuarios = new ArrayList<>();

    public AcervoUsuario(){
//        cadastrar(new Usuario("Ananda", "ananda@hotmail.com", "992228104", LocalDate.now(), "Engenharia Química", 48.0, 50.0, "Foto1"));
//        cadastrar(new Usuario("Wagner", "wagner@hotmail.com", "992736325", LocalDate.now(), "Desenvolvedor Software", 40.0, 55.0, "Foto2"));
//        cadastrar(new Usuario("Ramon", "ramon@hotmail.com", "34740190", LocalDate.now(), "Estagiário DEV", 40.0, 45.0, "Foto3"));
    }

    public Usuario cadastrar (Usuario usuario){
        usuario.setId(contador++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar(){
        return new ArrayList<Usuario>(usuarios);
    }

    public Usuario pesquisar (int id){
        for (Usuario usuario : usuarios){
            if(id == usuario.getId()){
                return usuario;
            }
        }
        return null;
    }

    public boolean deletar (int id){
        Usuario deletarUsuario = this.pesquisar(id);
        if (deletarUsuario != null) {
            return usuarios.remove(deletarUsuario);
        }
        return false;
    }

    public Usuario editar (int id, Usuario usuario){
        Usuario editarUsuario = this.pesquisar(id);
        if (editarUsuario != null){
            editarUsuario.setNome(usuario.getNome());
            editarUsuario.setEmail(usuario.getEmail());
            editarUsuario.setTelefone(usuario.getTelefone());
            editarUsuario.setBio(usuario.getBio());
            editarUsuario.setLatitude(usuario.getLatitude());
            editarUsuario.setLongitude(usuario.getLongitude());
            return editarUsuario;
        }
        return null;
    }

}


