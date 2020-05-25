package com.example.demo.dominio;

import com.example.demo.DTO.VotoDTO;

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

    public Integer getIdAssociado() {
        return idAssociado;
    }

    /**
     * Realiza a transformação da entidade voto em DTO.
     * @param voto - @{@link Voto}
     * @return - @{@link VotoDTO}
     */
    public static VotoDTO toDTO (Voto voto){
        return new VotoDTO(voto.getIdAssociado(), voto.getVoto());}
}


