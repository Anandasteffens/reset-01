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

    public boolean getVoto() {
        return voto;
    }

    /**
     * Transformar DTO em entidade voto
     * @param votoDTO @{@link VotoDTO}
     * @return @{@link Voto}
     */
    public static Voto toEndity (VotoDTO votoDTO){
        return new Voto(votoDTO.getVoto(), votoDTO.idAssociado);
    }

}
