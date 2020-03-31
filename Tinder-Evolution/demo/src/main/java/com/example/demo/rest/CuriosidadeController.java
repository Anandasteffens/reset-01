package com.example.demo.rest;

import com.example.demo.dominioclasses.Curiosidade;
import com.example.demo.gerenciadorregras.RegrasCuriosidade;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/curiosidade")
public class CuriosidadeController {

    private static int contador = +1;
    private List<Curiosidade> listaCuriosidades = new ArrayList<>();
    RegrasCuriosidade regrasCuriosidade = new RegrasCuriosidade();

    @PostMapping
    public Curiosidade cadastrarCuriosidade (@RequestBody Curiosidade requestBody){
        return regrasCuriosidade.cadastrar(requestBody);
    }

    @GetMapping
    public List<Curiosidade> listar (){
        return regrasCuriosidade.listar();
    }

    @GetMapping ("/{id}")
    public Curiosidade buscarCuriosidade (@PathVariable ("id") int id){
        return regrasCuriosidade.pesquisar(id);
    }

    @DeleteMapping ("/{id}")
    public String deletarCuriosidade (@PathVariable ("id") int id){
        regrasCuriosidade.deletar(id);
        return "Curiosidade deletada.";
    }

    @PutMapping ("/{id}")
    public Curiosidade editarCuriosidade (@PathVariable ("id") int id, @RequestBody Curiosidade requestBody){
        return regrasCuriosidade.editar(id, requestBody);
    }

}
