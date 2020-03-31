package com.example.demo.rest;

import com.example.demo.dominioclasses.Filme;
import com.example.demo.gerenciadorregras.RegrasFilme;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeController {

    private static int contador = +1;
    private List<Filme> listaFilmes = new ArrayList<>();
    RegrasFilme regrasFilme = new RegrasFilme();

    @PostMapping
    public Filme cadastrarFilme (@RequestBody Filme requestBody){
        return regrasFilme.cadastrar(requestBody);
    }

    @GetMapping
    public List<Filme> listarFilme (){
        return regrasFilme.listar();
    }

    @GetMapping ("/{id}")
    public Filme buscarFilme (@PathVariable ("id") int id){
        return regrasFilme.pesquisar(id);
    }

    @DeleteMapping ("/{id}")
    public String deletarFilme (@PathVariable ("id") int id){
        regrasFilme.deletar(id);
        return "Filme deletado";
    }

    @PutMapping ("/{id}")
    public Filme editarFilme (@PathVariable("id") int id, @RequestBody Filme requestBody){
        return regrasFilme.editar(id, requestBody);
    }

}
