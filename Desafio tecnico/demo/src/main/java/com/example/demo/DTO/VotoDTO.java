package com.example.demo.DTO;

import com.example.demo.dominio.Voto;

public class VotoDTO {

    private Integer idAssociado;
    private boolean voto;

    public VotoDTO(Integer idAssociado, boolean voto) {
        this.idAssociado = idAssociado;
        this.voto = voto;
    }

    public Integer getIdAssociado() {
        return idAssociado;
    }

    public void setIdAssociado(Integer idAssociado) {
        this.idAssociado = idAssociado;
    }

    public boolean getVoto() {
        return voto;
    }

    public void setVoto(boolean voto) {
        this.voto = voto;
    }

    public static Voto toEndity (VotoDTO votoDTO){
        return new Voto(votoDTO.getVoto(), votoDTO.idAssociado);
    }

}
