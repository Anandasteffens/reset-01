package com.example.demo.rest;

import com.example.demo.dominioclasses.Usuario;
import com.example.demo.gerenciadorregras.RegrasUsuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/usuario")
public class UsuarioRest {

    private RegrasUsuario regrasUsuario = new RegrasUsuario();

    @PostMapping
    public Usuario cadastrarUsuario (@RequestBody Usuario requestBody){
        return regrasUsuario.cadastrar(requestBody);
    }

    @GetMapping
    public List<Usuario> listarUsuario (){
        return regrasUsuario.listar();
    }

    @GetMapping ("/{id}")
    public Usuario buscarUsuario (@PathVariable("id") int id){
        return regrasUsuario.pesquisar(id);
    }

    @PutMapping("/{id}")
    public Usuario editarUsuario (@PathVariable ("id") int id, @RequestBody Usuario requestBody){
        return regrasUsuario.editar(id, requestBody);
    }

    @DeleteMapping ("/{id}")
    public String deletarUsuario (@PathVariable ("id") int id){
        regrasUsuario.deletar(id);
        return "Usuário deletado";
    }
}
