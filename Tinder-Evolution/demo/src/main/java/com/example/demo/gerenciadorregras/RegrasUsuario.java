package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoUsuario;
import com.example.demo.dominioclasses.*;

import java.util.ArrayList;
import java.util.List;

public class RegrasUsuario {
    private AcervoUsuario acervo = new AcervoUsuario();

    public Usuario cadastrar(Usuario usuario) {
        List<Usuario> usuarios = acervo.listar();
        if (usuario.confirmarIdade(usuario.getDataNascimento())<18){
            throw new RuntimeException("Aplicativo para maiores de 18 anos.");
        }
        if (usuario.getNome().isEmpty() || usuario.getEmail().isEmpty() || usuario.getTelefone().isEmpty() ||
                usuario.getDataNascimento() == null || usuario.getBio().isEmpty()|| usuario.getLatitude().isNaN() || usuario.getLongitude().isNaN() )
        {
            throw new RuntimeException("Campos de preenchimento obrigatórios não informados");

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

    public boolean curtirUsuario (int idUsuarioAvaliado, int idUsuarioAvaliador){
        if (this.pesquisar(idUsuarioAvaliador) != null){
            Usuario usuario = this.pesquisar(idUsuarioAvaliado);
            return usuario.curtirUsuario(idUsuarioAvaliador);
        }
        return false;
    }

    public boolean dislikeUsuario (int idUsuarioAvaliado, int idUsuarioAvaliador){
        if (this.pesquisar(idUsuarioAvaliado) != null){
            Usuario usuario = this.pesquisar(idUsuarioAvaliado);
            return usuario.dislikeUsuario(idUsuarioAvaliador);
        }
        return false;
    }

    public Integer deletarCurtidaUsuario (int idUsuarioAvaliado, int idUsuarioAvaliador){
        if (this.pesquisar(idUsuarioAvaliador) != null){
            Usuario usuario = this.pesquisar(idUsuarioAvaliado);
            return usuario.deletarCurtidaUsuario(idUsuarioAvaliador);
        }
        return null;
    }

    public Integer deletarDislikeUsuario (int idUsuarioAvaliado, int idUsuarioAvaliador){
        if (this.pesquisar(idUsuarioAvaliador) !=null){
            Usuario usuario = this.pesquisar(idUsuarioAvaliado);
            return usuario.deletarDislikeUsuario(idUsuarioAvaliador);
        }
        return null;
    }

    public Usuario bff (int idUsuario){
        Usuario usuarioAvaliado = this.pesquisar(idUsuario);
        AcervoUsuario acervoUsuario = new AcervoUsuario();
        List<Usuario> listarUsuarios = acervoUsuario.listar();
        listarUsuarios.remove(usuarioAvaliado);
        Usuario usuario = new Usuario();
        int melhorPontuacao = 0;
        for (Usuario usuarioAlone : listarUsuarios){
            int pontuacao = 0;
            if (!usuarioAvaliado.curtidasUsuario.contains(usuarioAlone.getId()) && !usuarioAvaliado.dislikesUsuario.contains(usuarioAlone.getId())){
                for (Integer musicaAvaliada : usuarioAvaliado.getCurtidasMusicas()){
                    for (Integer musicaUsuarioAlone : usuarioAlone.getCurtidasMusicas()){
                        if (musicaAvaliada.equals(musicaUsuarioAlone)){
                            pontuacao++;
                        }
                    }
                }
                if (pontuacao > melhorPontuacao){
                    usuario = usuarioAlone;
                    melhorPontuacao = pontuacao;
                }
                for (Integer filmeAvaliado : usuarioAvaliado.getCurtidasFilmes()){
                    for (Integer filmeUsuarioAlone : usuarioAlone.getCurtidasFilmes()){
                        if (filmeAvaliado.equals(filmeUsuarioAlone)){
                            pontuacao++;
                        }
                    }
                }
                if (pontuacao > melhorPontuacao){
                    usuario = usuarioAlone;
                    melhorPontuacao = pontuacao;
                }
                for (Integer serieAvaliado : usuarioAvaliado.getCurtidasSeries()){
                    for (Integer serieUsuarioAlone : usuarioAlone.getCurtidasSeries()){
                        if (serieAvaliado.equals(serieUsuarioAlone)){
                            pontuacao++;
                        }
                    }
                }
                if (pontuacao > melhorPontuacao){
                    usuario = usuarioAlone;
                    melhorPontuacao = pontuacao;
                }
                for (Integer jogoAvaliado : usuarioAvaliado.getCurtidasJogos()){
                    for (Integer jogoUsuarioAlone : usuarioAlone.getCurtidasJogos()){
                        if (jogoAvaliado.equals(jogoUsuarioAlone)){
                            pontuacao++;
                        }
                    }
                }
                if (pontuacao>melhorPontuacao){
                    usuario = usuarioAlone;
                    melhorPontuacao = pontuacao;
                }
                for (Integer esporteAvalido : usuarioAvaliado.getCurtidasEsporte()){
                    for (Integer esporteUsuarioAlone : usuarioAlone.getCurtidasEsporte()){
                        if (esporteAvalido.equals(esporteUsuarioAlone)){
                            pontuacao++;
                        }
                    }
                }
                if (pontuacao>melhorPontuacao){
                    usuario = usuarioAlone;
                    melhorPontuacao = pontuacao;
                }
            }
        }
        return usuario;
    }

    public List<Usuario> criarMatches (int idUsuarioAvaliado){
        Usuario usuarioAvaliado = this.pesquisar(idUsuarioAvaliado);
        List<Usuario> listaMatches = new ArrayList<>();
        AcervoUsuario acervoUsuario = new AcervoUsuario();
        List<Usuario> listarUsuarios = acervoUsuario.listar();
        for (Usuario usuario : listarUsuarios){
            if (usuarioAvaliado.curtidasUsuario.contains(usuario.getId()) && usuario.curtidasUsuario.contains(usuarioAvaliado.getId())){
                listaMatches.add(usuario);
            }
        }
        return listaMatches;
    }

    public List<Musica> listarMusicarCurtidas (int idUsuario){
        Usuario usuario = this.pesquisar(idUsuario);
        RegrasMusica regrasMusica = new RegrasMusica();
        List<Musica> listaMusicasCurtidas = new ArrayList<>();
        for (Integer id : usuario.getCurtidasMusicas()){
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
        RegrasFilme regrasFilme = new RegrasFilme();
        List <Filme> listaFilmesCurtidos = new ArrayList<>();
        for (Integer id : usuario.getCurtidasFilmes()){
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
        RegrasSerie regrasSerie = new RegrasSerie();
        List<Serie> listaSerieCurdida = new ArrayList<>();
        for (Integer id : usuario.getCurtidasSeries()){
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
        RegrasJogo regrasJogo = new RegrasJogo();
        List<Jogo> listaJogosCurtidos = new ArrayList<>();
        for (Integer id : usuario.getCurtidasJogos()){
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
        RegrasEsporte regrasEsporte = new RegrasEsporte();
        List<Esporte> listarEsportesCurtidos = new ArrayList<>();
        for (Integer id: usuario.getCurtidasEsporte()){
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
        RegrasCuriosidade regrasCuriosidade = new RegrasCuriosidade();
        List<Curiosidade> listaCuriosidades = new ArrayList<>();
        for (Integer id :usuario.getCuriosidades()){
            Curiosidade curiosidadeListada = regrasCuriosidade.pesquisar(id);
            listaCuriosidades.add(curiosidadeListada);
        }
        return listaCuriosidades;
    }

}
