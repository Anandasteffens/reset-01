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
    public Integer descurtirMusica (@PathVariable ("idMusica") int idMusica, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.descurtirMusica(idMusica, idUsuario);
    }

    @DeleteMapping ("filme/{idFilme}/avaliador/{idUsuario}")
    public Integer descurtirFilme (@PathVariable ("idFilme") int idFilme, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.descurtirFilme(idFilme, idUsuario);
    }

    @DeleteMapping ("/serie/{idSerie}/avaliador/{idUsuario}")
    public Integer descurtirSerie (@PathVariable ("idSerie") int idSerie, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.descurtirSerie(idSerie, idUsuario);
    }

    @DeleteMapping ("/jogo/{idJogo}/avaliador/{idUsuario}")
    public Integer descurtirJogo (@PathVariable ("idJogo") int idJogo, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.descurtirJogo(idJogo, idUsuario);
    }
    @DeleteMapping("/esporte/{idEsporte}/avaliador/{idUsuario}")
    public Integer descurtirEsporte (@PathVariable ("idEsporte") int idEsporte, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.descurtirEsporte(idEsporte, idUsuario);
    }


}
