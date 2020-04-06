package com.example.demo.rest;

import com.example.demo.dominioclasses.*;
import com.example.demo.gerenciadorregras.RegrasUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/usuario")
public class UsuarioController {

    private RegrasUsuario regrasUsuario = new RegrasUsuario();

    @PostMapping
    public Usuario cadastrarUsuario (@RequestBody Usuario requestBody){
        return regrasUsuario.cadastrar(requestBody);
    }

    @GetMapping
    public List<Usuario> listarUsuario (){
        return regrasUsuario.listar();
    }

    @GetMapping ("/{id}")
    public Usuario buscarUsuario (@PathVariable("id") int id){
        return regrasUsuario.pesquisar(id);
    }

    @PutMapping("/{id}")
    public Usuario editarUsuario (@PathVariable ("id") int id, @RequestBody Usuario requestBody){
        return regrasUsuario.editar(id, requestBody);
    }

    @DeleteMapping ("/{id}")
    public String deletarUsuario (@PathVariable ("id") int id){
        regrasUsuario.deletar(id);
        return "Usuário deletado";
    }

    @GetMapping ("/{idUsuario}/musica")
    public List<Musica> listarMusicas (@PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.listarMusicarCurtidas(idUsuario);
    }

    @GetMapping ("/{idUsuario}/filme")
    public List<Filme> listarFilmes (@PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.listarFilmesCurtidos(idUsuario);
    }

    @GetMapping ("/{idUsuario}/serie")
    public List<Serie> listarSerie (@PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.listarSerieCurtida(idUsuario);
    }

    @GetMapping ("/{idUsuario}/jogo")
    public List<Jogo> listarJogo (@PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.listaJogosCurtidos(idUsuario);
    }

    @GetMapping ("/{idUsuario}/esporte")
    public List<Esporte> listarEsporte (@PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.listarEsporteCurtidos(idUsuario);
    }


    @GetMapping ("/{idUsuario}/curiosidade")
    public List<Curiosidade> listarCuriosidade (@PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.listarCuriosidade(idUsuario);
    }
}
