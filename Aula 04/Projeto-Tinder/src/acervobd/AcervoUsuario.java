package acervobd;

import dominioclasses.Musica;
import dominioclasses.Usuario;

import java.util.ArrayList;
import java.util.List;

public class AcervoUsuario {
    private static int contador = +1;
    private static List<Usuario> usuarios = new ArrayList<>();

    public Usuario cadastrar (Usuario usuario){
        usuario.setId(contador++);
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listar(){
        return usuarios;
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

    public boolean editar (int id, Usuario usuario){
        Usuario editarUsuario = this.pesquisar(id);
        if (editarUsuario != null){
            usuario.setId(id);
            int a = 0;
            usuarios.indexOf(editarUsuario);
            usuarios.set(a, usuario);
        }
        return false;
    }
}


