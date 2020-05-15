package com.example.demo.dominioclasses;

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

}
