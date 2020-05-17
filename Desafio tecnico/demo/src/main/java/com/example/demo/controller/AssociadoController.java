package com.example.demo.controller;

import com.example.demo.DTO.AssociadoDTO;
import com.example.demo.dominioclasses.Associado;
import com.example.demo.service.AssociadoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/associado")
public class AssociadoController {

    private AssociadoService associadoService = new AssociadoService();

    @PostMapping
    public AssociadoDTO cadastrarAssociado (@RequestBody AssociadoDTO requestBody){
        return associadoService.cadastrar(requestBody);
    }
}
