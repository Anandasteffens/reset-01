package acervobd;

import dominioclasses.Musica;
import java.util.ArrayList;
import java.util.List;


public class AcervoMusicas {

    private static int contador = +1;
    private static List<Musica> musicas = new ArrayList<>();


    public Musica criar(Musica musica) {
        musica.setId(contador++);
        musicas.add(musica);
        return musica;
    }

    public List<Musica> listar() {
        if (musicas == null){
            return null;
        } else {return musicas;}
    }

    public Musica pesquisar(int id) {

        for (Musica musica : musicas) {
            if (musica.getId() == id) {
                return musica;
            }
        }

        return null;
    }

    public boolean deletar(int id) {
        Musica deletarMusica = this.pesquisar(id);
        if (deletarMusica != null) {
            return musicas.remove(deletarMusica);
        }
        return false;
    }

    public boolean editar(int id, Musica musica) {
        Musica editarMusica = this.pesquisar(id);
        if (editarMusica != null) {
            int a = musicas.indexOf(editarMusica);
            musicas.set(a, musica);
        }
        return false;

    }
}

