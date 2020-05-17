package com.example.demo.controller;


import com.example.demo.DTO.PautaDTO;
import com.example.demo.DTO.VotoDTO;
import com.example.demo.DTO.ResultadoDTO;
import com.example.demo.service.PautaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/pauta")
public class PautaController {

    private PautaService pautaService = new PautaService();

    @PostMapping
    public PautaDTO cadastrarPauta (@RequestBody PautaDTO requestBody){
        return pautaService.cadastrar(requestBody);
    }

    @PostMapping("/votar/{idPauta}")
    public boolean votar (@PathVariable("idPauta") int idPauta,@RequestBody VotoDTO requestBody){
      return pautaService.votar(idPauta, requestBody);
    }

    @GetMapping ("/{idPauta}/resultado")
    public ResultadoDTO resultadoVotacao (@PathVariable ("idPauta") int idPauta){
        ResultadoDTO result = pautaService.contabilizarVotacao(idPauta);
        return result;
    }
}
