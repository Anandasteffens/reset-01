package com.example.demo.controller;

import com.example.demo.DTO.AssociadoDTO;
import com.example.demo.service.AssociadoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "Associado")
@RequestMapping(value = "/associado")
public class AssociadoController {

    private AssociadoService associadoService = new AssociadoService();

    @ApiOperation(value = "Cadastrar associado")
    @PostMapping
    public AssociadoDTO cadastrarAssociado (@RequestBody AssociadoDTO requestBody){
        return associadoService.cadastrar(requestBody);
    }

}





