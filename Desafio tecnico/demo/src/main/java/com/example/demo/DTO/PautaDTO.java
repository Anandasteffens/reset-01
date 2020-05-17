package com.example.demo.DTO;

import com.example.demo.dominio.Pauta;

public class PautaDTO {

    private int idPauta;
    private String assunto;
    private int tempoVotacao;

    public PautaDTO(int idPauta, String assunto, int tempoVotacao) {
        this.idPauta = idPauta;
        this.assunto = assunto;
        this.tempoVotacao = tempoVotacao;
    }

    public String getAssunto() {
        return assunto;
    }

    public int getTempoVotacao() {
        return tempoVotacao;
    }

    /**
     * Transforma DTO em entidade pauta
     * @param dTO @{@link PautaDTO}
     * @return @{@link Pauta}
     */
    public static Pauta toEndity (PautaDTO dTO){
        return new Pauta(dTO.getAssunto(), dTO.getTempoVotacao());}
}


