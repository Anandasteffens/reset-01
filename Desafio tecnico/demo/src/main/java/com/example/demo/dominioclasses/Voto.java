package com.example.demo.dominioclasses;

import com.example.demo.DTO.AssociadoDTO;
import com.example.demo.DTO.VotoDTO;

import java.util.ArrayList;
import java.util.List;

public class Voto {

    private Integer idAssociado;
    private boolean voto;

    public Voto(boolean voto, Integer idAssociado) {
        this.voto = voto;
        this.idAssociado = idAssociado;
    }

    public boolean getVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    public Integer getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(Integer idAssociado) {
        this.idAssociado = idAssociado;
    }

    public static VotoDTO toDTO (Voto voto){
        return new VotoDTO(voto.getIdAssociado(), voto.getVoto());}
}

