package com.example.demo.rest;

import com.example.demo.dominioclasses.Usuario;
import com.example.demo.gerenciadorregras.RegrasUsuario;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping ("/jogo/{idJogo}/avaliador/{idUsuario}")
    public boolean curtirJogo (@PathVariable ("idJogo") int idJogo, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.curtirJogo(idJogo, idUsuario);
    }

    @PostMapping ("/esporte/{idEsporte}/avaliador/{idUsuario}")
    public boolean curtirEsporte (@PathVariable ("idEsporte") int idEsporte, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.curtirEsporte(idEsporte, idUsuario);
    }

    @DeleteMapping ("/musica/{idMusica}/avaliador/{idUsuario}")
    public String descurtirMusica (@PathVariable ("idMusica") int idMusica, @PathVariable ("idUsuario") int idUsuario){
        regrasUsuario.descurtirMusica(idMusica, idUsuario);
        return "Música descurtida";
    }

    @DeleteMapping ("filme/{idFilme}/avaliador/{idUsuario}")
    public String descurtirFilme (@PathVariable ("idFilme") int idFilme, @PathVariable ("idUsuario") int idUsuario){
        regrasUsuario.descurtirFilme(idFilme, idUsuario);
        return "Filme descurtido";
    }

    @DeleteMapping ("/serie/{idSerie}/avaliador/{idUsuario}")
    public String descurtirSerie (@PathVariable ("idSerie") int idSerie, @PathVariable ("idUsuario") int idUsuario){
        regrasUsuario.descurtirSerie(idSerie, idUsuario);
        return "Série descurtida";
    }

    @DeleteMapping ("/jogo/{idJogo}/avaliador/{idUsuario}")
    public String descurtirJogo (@PathVariable ("idJogo") int idJogo, @PathVariable ("idUsuario") int idUsuario){
        regrasUsuario.descurtirJogo(idJogo, idUsuario);
        return "Jogo descurtido";
    }
    @DeleteMapping("/esporte/{idEsporte}/avaliador/{idUsuario}")
    public String descurtirEsporte (@PathVariable ("idEsporte") int idEsporte, @PathVariable ("idUsuario") int idUsuario){
        regrasUsuario.descurtirEsporte(idEsporte, idUsuario);
        return "Esporte descurtido";
    }


}
