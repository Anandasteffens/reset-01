package com.example.demo.rest;

import com.example.demo.dominioclasses.Serie;
import com.example.demo.gerenciadorregras.RegrasSerie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieRest {

    private static int contador = +1;
    private List<Serie> listaSeries = new ArrayList<>();
    RegrasSerie regrasSerie = new RegrasSerie();

    @PostMapping
    public Serie cadastrarSerie (@RequestBody Serie requestBody){
        return regrasSerie.cadastrar(requestBody);
    }

    @GetMapping
    public List<Serie> listarSerie (){
        return regrasSerie.listar();
    }

    @GetMapping ("/{id}")
    public Serie obterSerie (@PathVariable ("id") int id){
        return regrasSerie.pesquisar(id);
    }

    @DeleteMapping("/{id}")
    public String deletarSerie (@PathVariable ("id") int id){
        regrasSerie.deletar(id);
        return "Série deletada";
    }

    @PutMapping ("/{id}")
    public Serie editarSerie (@PathVariable ("id") int id, @RequestBody Serie requestBody){
        return regrasSerie.editar(id, requestBody);
    }

}
