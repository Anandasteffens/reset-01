package com.example.demo.dominioclasses;

import com.example.demo.DTO.AssociadoDTO;
import com.example.demo.DTO.PautaDTO;
import com.example.demo.DTO.VotoDTO;
import com.example.demo.acervobd.AcervoAssociado;

import java.security.PublicKey;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pauta {
    private int id;
    private String assunto;
    private int tempoVotacao;
    private List<Voto> listaVotos = new ArrayList<>();
    private LocalDateTime dataLimite;

    public Pauta(String assunto, int tempoVotacao) {
        this.assunto = assunto;
        this.tempoVotacao = tempoVotacao;
        this.dataLimite = calcularTempoVotacao(tempoVotacao);
    }

    public Pauta (){};

    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public List<Voto> getListaVotos() {
        return listaVotos;
    }

    public void setListaVotos(List<Voto> listaVotos) {
        this.listaVotos = listaVotos;
    }

    public int getTempoVotacao() {
        return tempoVotacao;
    }

    public void setTempoVotacao(int tempoVotacao) {
        this.tempoVotacao = tempoVotacao;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }

    public void votar(Voto voto){
        listaVotos.add(voto);
    }

    public boolean associadoPodeVotar (int idAssociado) {
        for (Voto voto : listaVotos) {
            if (voto.getIdAssociado().equals(idAssociado)) {
                return false;
            }
        }
        return true;
    }

    public LocalDateTime calcularTempoVotacao (Integer tempo){
        int tempoDefault = 1;
        if (tempo != null && tempo !=0){
            return LocalDateTime.now().plusMinutes(tempo);
        }
        else {
            return LocalDateTime.now().plusMinutes(tempoDefault);
        }
    }

    public static PautaDTO toDTO (Pauta pauta){
        return new PautaDTO(pauta.getId(), pauta.getAssunto(), pauta.getTempoVotacao());}
}

