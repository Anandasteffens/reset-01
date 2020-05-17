package com.example.demo.DTO;

import com.example.demo.dominioclasses.Associado;
import com.example.demo.dominioclasses.Pauta;

public class PautaDTO {

    private int idPauta;
    private String assunto;
    private int tempoVotacao;

    public PautaDTO(int idPauta, String assunto, int tempoVotacao) {
        this.idPauta = idPauta;
        this.assunto = assunto;
        this.tempoVotacao = tempoVotacao;
    }

    public int getIdPauta() {
        return idPauta;
    }

    public void setIdPauta(int idPauta) {
        this.idPauta = idPauta;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public int getTempoVotacao() {
        return tempoVotacao;
    }

    public void setTempoVotacao(int tempoVotacao) {
        this.tempoVotacao = tempoVotacao;
    }

    public static Pauta toEndity (PautaDTO dTO){
        return new Pauta(dTO.getAssunto(), dTO.getTempoVotacao());}
}


