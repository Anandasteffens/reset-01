package com.example.demo.rest;

import com.example.demo.dominioclasses.Esporte;
import com.example.demo.gerenciadorregras.RegrasEsporte;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/esporte")
public class EsporteController {

    private static int contador = +1;
    private List<Esporte> listaEsportes = new ArrayList<>();
    RegrasEsporte regrasEsporte = new RegrasEsporte();


    @PostMapping
    public Esporte cadastrarEsporte (@RequestBody Esporte requestBody){
        return regrasEsporte.cadastrar(requestBody);
    }

    @GetMapping
    public List<Esporte> listarEsporte(){
        return regrasEsporte.listar();
    }

    @GetMapping("/{id}")
    public Esporte buscarEsporte (@PathVariable ("id") int id){
        return regrasEsporte.pesquisar(id);
    }

    @DeleteMapping ("/{id}")
    public String deletarEsporte (@PathVariable ("id") int id){
         regrasEsporte.deletar(id);
        return "Esporte deletado";
    }

    @PutMapping ("/{id}")
    public Esporte editarEsporte (@PathVariable ("id") int id, @RequestBody Esporte requestBody){
        return regrasEsporte.editar(id, requestBody);
    }
}
