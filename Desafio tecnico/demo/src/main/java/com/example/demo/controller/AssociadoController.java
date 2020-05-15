package com.example.demo.controller;

import com.example.demo.dominioclasses.Associado;
import com.example.demo.gerenciadorregras.RegrasAssociado;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/associado")
public class AssociadoController {

    private RegrasAssociado regrasAssociado = new RegrasAssociado();

    @PostMapping
    public Associado cadastrarAssociado (@RequestBody Associado requestBody){
        return regrasAssociado.cadastrar(requestBody);
    }
}
