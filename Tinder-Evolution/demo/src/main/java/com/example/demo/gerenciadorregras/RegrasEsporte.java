package com.example.demo.gerenciadorregras;


import com.example.demo.acervobd.AcervoEsporte;
import com.example.demo.dominioclasses.Esporte;

import java.util.List;

public class RegrasEsporte {

    AcervoEsporte acervoEsporte = new AcervoEsporte();

    public Esporte cadastrar (Esporte esporte){
        List<Esporte> esportes = acervoEsporte.listar();
        if (esporte.getNome().isEmpty()){
            System.out.println("Campos de preenchimento obrigatórios não informados");
            return null;
        }
        for (Esporte esporteExiste : esportes){
            if (esporte.getNome().equals(esporteExiste.getNome())){
                return esporteExiste;
            }
        }
        return acervoEsporte.cadastrar(esporte);
    }

    public List<Esporte> listar (){
        return acervoEsporte.listar();
    }

    public Esporte pesquisar (int id){
        if (id>0){
            return acervoEsporte.pesquisar(id);
        }
        return null;
    }

    public Esporte editar (int id, Esporte esporte){
        if (id >0){
            return acervoEsporte.editar(id, esporte);
        }
        return null;
    }

    public boolean deletar (int id){
        if (id > 0){
            return acervoEsporte.deletar(id);
        }
        return false;
    }
}
