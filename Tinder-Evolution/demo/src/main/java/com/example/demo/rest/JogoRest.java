package com.example.demo.rest;

import com.example.demo.dominioclasses.Jogo;
import com.example.demo.gerenciadorregras.RegrasJogo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/jogo")
public class JogoRest {

    private static int contador = +1;
    private List<Jogo> listaJogos = new ArrayList<>();
    private RegrasJogo regrasJogo = new RegrasJogo();

    @PostMapping
    public Jogo cadastrarJogo (@RequestBody Jogo requestBody){
        return regrasJogo.cadastrar(requestBody);
    }

    @GetMapping
    public List<Jogo> listarJogo (){
        return regrasJogo.listar();
    }

    @GetMapping ("/{id}")
    public Jogo buscarJogo (@PathVariable ("id") int id){
        return regrasJogo.pesquisar(id);
    }

    @DeleteMapping ("/{id}")
    public String deletarJogo (@PathVariable ("id") int id){
        regrasJogo.deletar(id);
        return "Jogo deletado";
    }

    @PutMapping ("/{id}")
    public Jogo editarJogo (@PathVariable ("id") int id, @RequestBody Jogo requestBody){
        return regrasJogo.editar(id, requestBody);
    }

}

