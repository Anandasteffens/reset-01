package com.example.demo.controller;


import com.example.demo.dominioclasses.Pauta;
import com.example.demo.dominioclasses.Voto;
import com.example.demo.gerenciadorregras.RegrasPauta;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/pauta")
public class PautaController {

    private RegrasPauta regrasPauta = new RegrasPauta();

    @PostMapping
    public Pauta cadastrarPauta (@RequestBody Pauta requestBody){
        return regrasPauta.cadastrar(requestBody);
    }

    @PostMapping("/{idPauta}")
    public void votar (@PathVariable("idPauta") int idPauta,@RequestBody Voto requestBody){
       regrasPauta.votar(idPauta, requestBody);
    }
}
