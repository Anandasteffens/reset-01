package com.example.demo.rest;

import com.example.demo.dominioclasses.Musica;
import com.example.demo.dominioclasses.Usuario;
import com.example.demo.gerenciadorregras.RegrasMusica;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/musica")
public class MusicaRest {

    private static int contador =+1;
    private List<Musica> listaMusicas = new ArrayList<>();
    private RegrasMusica regrasMusica = new RegrasMusica();

    @PostMapping
    public Musica cadastrarMusica (@RequestBody Musica requestBody){
        return regrasMusica.criar(requestBody);
    }

    @GetMapping
    public List<Musica> listarMusicas (){
        return regrasMusica.listar();
    }

    @GetMapping("/{id}")
    public Musica obterMusica (@PathVariable ("id") int id){
        return regrasMusica.pesquisar(id);
    }

    @DeleteMapping("/{id}")
    public String deletarMusica (@PathVariable ("id") int id){
        regrasMusica.deletar(id);
        return "Música deletada.";
    }

    @PutMapping ("/{id}")
    public Musica editarMusica (@PathVariable ("id") int id, @RequestBody Musica requestBody){
        return regrasMusica.editar(id, requestBody);
    }



}
