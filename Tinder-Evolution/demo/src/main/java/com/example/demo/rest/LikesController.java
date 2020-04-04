package com.example.demo.rest;

import com.example.demo.dominioclasses.Usuario;
import com.example.demo.gerenciadorregras.RegrasUsuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/likes")
public class LikesController {

    RegrasUsuario regrasUsuario = new RegrasUsuario();

    @PostMapping ("/musica/{idMusica}/avaliador/{idUsuario}")
    public boolean curtirMusica (@PathVariable ("idMusica") int idMusica, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.curtirMusica(idMusica, idUsuario);
    }

    @PostMapping ("/filme/{idFilme}/avaliador/{idUsuario}")
    public boolean curtirFilme (@PathVariable ("idFilme") int idFilme, @PathVariable("idUsuario") int idUsuario){
        return regrasUsuario.curtirFilme(idFilme, idUsuario);
    }

    @PostMapping ("serie/{idSerie}/avaliador/{idUsuario}")
    public boolean curtirSerie (@PathVariable ("idSerie") int idSerie, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.curtirSerie(idSerie, idUsuario);
    }


}
