package com.example.demo.controller;


import com.example.demo.DTO.PautaDTO;
import com.example.demo.DTO.VotoDTO;
import com.example.demo.DTO.ResultadoDTO;
import com.example.demo.service.PautaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/pauta")
@Api(value = "Pauta")
public class PautaController {

    private PautaService pautaService = new PautaService();

    @ApiOperation(value = "Criar uma nova pauta")
    @PostMapping
    public PautaDTO cadastrarPauta (@RequestBody PautaDTO requestBody){
        return pautaService.cadastrar(requestBody);
    }

    @ApiOperation(value = "Digite o ID da pauta para votar")
    @PostMapping(value = "/votar/{idPauta}")
    public boolean votar (@PathVariable("idPauta") int idPauta,@RequestBody VotoDTO requestBody){
      return pautaService.votar(idPauta, requestBody);
    }


    @ApiOperation(value = "Mostrar resultado da votação, digite o ID da pauta")
    @GetMapping(value = "/pauta/{idPauta}")
    public ResultadoDTO resultadoVotacao (@PathVariable ("idPauta") int idPauta){
        ResultadoDTO result = pautaService.contabilizarVotacao(idPauta);
        return result;
    }
}


