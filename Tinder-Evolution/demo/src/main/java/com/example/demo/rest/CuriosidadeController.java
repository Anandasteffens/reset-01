package com.example.demo.rest;

import com.example.demo.dominioclasses.Curiosidade;
import com.example.demo.gerenciadorregras.RegrasCuriosidade;
import com.example.demo.gerenciadorregras.RegrasUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/curiosidade")
public class CuriosidadeController {

    private static int contador = +1;
    private List<Curiosidade> listaCuriosidades = new ArrayList<>();
    RegrasCuriosidade regrasCuriosidade = new RegrasCuriosidade();
    RegrasUsuario regrasUsuario = new RegrasUsuario();

    @PostMapping
    public Curiosidade cadastrarCuriosidade (@RequestBody Curiosidade requestBody){
        return regrasCuriosidade.cadastrar(requestBody);
    }

    @PostMapping ("/{idCuriosidade}/avaliador/{idUsuario}")
    public boolean curiosidade (@PathVariable ("idCuriosidade") int idCuriosidade, @PathVariable ("idUsuario") int idUsuario){
        return regrasUsuario.cadastrarCuriosidade(idCuriosidade, idUsuario);
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
