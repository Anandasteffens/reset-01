package com.example.demo.rest;

import com.example.demo.dominioclasses.Usuario;
import com.example.demo.gerenciadorregras.RegrasUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matches")
public class MatchesController {
    RegrasUsuario regrasUsuario = new RegrasUsuario();

    @PostMapping("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/like")
    public boolean curtirUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvalido, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
      return regrasUsuario.curtirUsuario(idUsuarioAvalido, idUsuarioAvaliador);
    }

    @PostMapping("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/dislike")
    public boolean dislikeUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
        return regrasUsuario.dislikeUsuario(idUsuarioAvaliado, idUsuarioAvaliador);
    }

    @DeleteMapping ("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/like")
    public String deletarCurtidaUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
        regrasUsuario.deletarCurtidaUsuario(idUsuarioAvaliado,idUsuarioAvaliador);
        return "Like deletado";
    }

    @DeleteMapping ("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/dislike")
    public String deletarDislikeUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
        regrasUsuario.deletarDislikeUsuario(idUsuarioAvaliado, idUsuarioAvaliador);
        return "Dislike deletado";
    }

    @GetMapping ("/{idUsuarioAvaliado}")
    public List<Usuario> listarMatches (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado){
        return regrasUsuario.criarMatches(idUsuarioAvaliado);
    }

    @GetMapping ("/{idUsuario}/best")
    public Usuario listarUsuarioBest (@PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.bff(idUsuario);
    }

}
