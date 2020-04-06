package com.example.demo.rest;

import com.example.demo.gerenciadorregras.RegrasUsuario;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matches")
public class MatchesController {
    RegrasUsuario regrasUsuario = new RegrasUsuario();

    @PostMapping("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/like")
    public boolean curtirUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvalido, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
      return regrasUsuario.curtirUsuario(idUsuarioAvalido, idUsuarioAvaliador);
    }

    @PostMapping("/{idUsuarioAvaliado}/avaliador/{idUsuarioAvaliador}/dislike")
    public Integer descurtirUsuario (@PathVariable ("idUsuarioAvaliado") int idUsuarioAvaliado, @PathVariable ("idUsuarioAvaliador") int idUsuarioAvaliador){
        return regrasUsuario.descurtirUsuario(idUsuarioAvaliado, idUsuarioAvaliador);
    }
}
