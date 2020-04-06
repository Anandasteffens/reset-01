package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoMusicas;
import com.example.demo.acervobd.AcervoUsuario;
import com.example.demo.dominioclasses.*;
import com.fasterxml.jackson.databind.ser.std.UUIDSerializer;

import java.util.ArrayList;
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

    public List<Musica> listarMusicarCurtidas (int idUsuario){
        Usuario usuario = this.pesquisar(idUsuario);
        List<Musica> listaMusicasCurtidas = new ArrayList<>();
        for (Integer id : usuario.getCurtidasMusicas()){
            RegrasMusica regrasMusica = new RegrasMusica();
            Musica musicaCurtida = regrasMusica.pesquisar(id);
            listaMusicasCurtidas.add(musicaCurtida);
        }
        return listaMusicasCurtidas;
    }

    public boolean curtirMusica (int idMusica, int idUsuario){
        RegrasMusica regrasMusica = new RegrasMusica();
        if (regrasMusica.pesquisar(idMusica) != null){
            Usuario usuario = this.pesquisar(idUsuario);
           return usuario.curtirMusica(idMusica);
        }
        return false;
    }

    public Integer descurtirMusica (int idMusica, int idUsuario) {
        RegrasMusica regrasMusica = new RegrasMusica();
        if (regrasMusica.pesquisar(idMusica) != null) {
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.descurtirMusica(idMusica);
        }
        return null;
    }

    public List<Filme> listarFilmesCurtidos (int idUsuario){
        Usuario usuario = this.pesquisar(idUsuario);
        List <Filme> listaFilmesCurtidos = new ArrayList<>();
        for (Integer id : usuario.getCurtidasFilmes()){
            RegrasFilme regrasFilme = new RegrasFilme();
            Filme filmesCurtidos = regrasFilme.pesquisar(id);
            listaFilmesCurtidos.add(filmesCurtidos);
        }
        return listaFilmesCurtidos;
    }

    public boolean curtirFilme (int idFilme, int idUsuario){
        RegrasFilme regrasFilme = new RegrasFilme();
        if (regrasFilme.pesquisar(idFilme) != null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.curtirFilme(idFilme);
        }
        return false;
    }

    public Integer descurtirFilme (int idFilme, int idUsuario){
        RegrasFilme regrasFilme = new RegrasFilme();
        if (regrasFilme.pesquisar(idFilme) != null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.descurtirFilme(idFilme);
        }
        return null;
    }

    public List<Serie> listarSerieCurtida (int idUsuario){
        Usuario usuario = this.pesquisar(idUsuario);
        List<Serie> listaSerieCurdida = new ArrayList<>();
        for (Integer id : usuario.getCurtidasSeries()){
            RegrasSerie regrasSerie = new RegrasSerie();
            Serie serieCurtida = regrasSerie.pesquisar(id);
            listaSerieCurdida.add(serieCurtida);
        }
        return listaSerieCurdida;
    }

    public boolean curtirSerie (int idSerie, int idUsuario){
        RegrasSerie regrasSerie = new RegrasSerie();
        if (regrasSerie.pesquisar(idSerie) !=null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.curtirSerie(idSerie);
        }
        return false;
    }

    public Integer descurtirSerie (int idSerie, int idUsuario){
        RegrasSerie regrasSerie = new RegrasSerie();
        if (regrasSerie.pesquisar(idSerie) !=null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.descurtirSerie(idSerie);
        }
        return null;
    }

    public List<Jogo> listaJogosCurtidos (int idUsuario){
        Usuario usuario = this.pesquisar(idUsuario);
        List<Jogo> listaJogosCurtidos = new ArrayList<>();
        for (Integer id : usuario.getCurtidasJogos()){
        RegrasJogo regrasJogo = new RegrasJogo();
        Jogo jogosCurtidos = regrasJogo.pesquisar(id);
        listaJogosCurtidos.add(jogosCurtidos);
        }
        return listaJogosCurtidos;
    }

    public boolean curtirJogo (int idJogo, int idUsuario){
        RegrasJogo regrasJogo = new RegrasJogo();
        if (regrasJogo.pesquisar(idJogo) != null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.curtirJogo(idJogo);
        }
        return false;
    }

    public Integer descurtirJogo (int idJogo, int idUsuario){
        RegrasJogo regrasJogo = new RegrasJogo();
        if (regrasJogo.pesquisar(idJogo) != null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.descurtirJogo(idJogo);
        }
        return null;
    }

    public List<Esporte> listarEsporteCurtidos (int idUsuario){
        Usuario usuario = this.pesquisar(idUsuario);
        List<Esporte> listarEsportesCurtidos = new ArrayList<>();
        for (Integer id: usuario.getCurtidasEsporte()){
            RegrasEsporte regrasEsporte = new RegrasEsporte();
            Esporte esporteCurtido = regrasEsporte.pesquisar(id);
            listarEsportesCurtidos.add(esporteCurtido);
        }
        return listarEsportesCurtidos;
    }

    public boolean curtirEsporte (int idEsporte, int idUsuario){
        RegrasEsporte regrasEsporte = new RegrasEsporte();
        if (regrasEsporte.pesquisar(idEsporte)!= null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.curtirEsporte(idEsporte);
        }
        return false;
    }

    public Integer descurtirEsporte (int idEsporte, int idUsuario){
        RegrasEsporte regrasEsporte = new RegrasEsporte();
        if (regrasEsporte.pesquisar(idEsporte) != null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.descurtirEsporte(idEsporte);
        }
        return null;
    }

    public boolean cadastrarCuriosidade (int idCuriosidade, int idUsuario){
        RegrasCuriosidade regrasCuriosidade = new RegrasCuriosidade();
        if (regrasCuriosidade.pesquisar(idCuriosidade) !=null){
            Usuario usuario = this.pesquisar(idUsuario);
            return usuario.cadastrarCuriosidade(idCuriosidade);
        }
        return false;
    }

    public List<Curiosidade> listarCuriosidade (int idUsuario){
        Usuario usuario = this.pesquisar(idUsuario);
        List<Curiosidade> listaCuriosidades = new ArrayList<>();
        for (Integer id :usuario.getCuriosidades()){
            RegrasCuriosidade regrasCuriosidade = new RegrasCuriosidade();
            Curiosidade curiosidadeListada = regrasCuriosidade.pesquisar(id);
            listaCuriosidades.add(curiosidadeListada);
        }
        return listaCuriosidades;
    }

}
