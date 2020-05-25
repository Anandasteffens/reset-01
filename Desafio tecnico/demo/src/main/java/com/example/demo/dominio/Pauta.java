package com.example.demo.dominio;

import com.example.demo.DTO.PautaDTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pauta {
    private int id;
    private String assunto;
    private int tempoVotacao;
    private List<Voto> listaVotos = new ArrayList<>();
    private LocalDateTime dataLimite;

    public Pauta(int id, String assunto, int tempoVotacao) {
        this.id = id;
        this.assunto = assunto;
        this.tempoVotacao = tempoVotacao;
        this.dataLimite = calcularTempoVotacao(tempoVotacao);
    }

    public Pauta() {

    }

    public int getId() {return id;}

    public void setId(int id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public List<Voto> getListaVotos() {
        return listaVotos;
    }

    public int getTempoVotacao() {
        return tempoVotacao;
    }

    public LocalDateTime getDataLimite() {
        return dataLimite;
    }

    /**
     * Adiciona um voto na lista de votos.
     * @param voto @{@Voto}
     */
    public void votar(Voto voto){
        listaVotos.add(voto);
    }

    /**
     * Verifica se o Associado pode votar, com a condição de estar na lista de associados.
     * @param idAssociado @{@link int}
     * @return boolean
     */
    public boolean associadoPodeVotar (int idAssociado) {
        for (Voto voto : listaVotos) {
            if (voto.getIdAssociado().equals(idAssociado)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Realiza a verificação de tempo disponível para votação, caso não informado o tempo, deve-se considerar um tempo default = 1 minuto.
     * @param tempo @{@link Integer}
     * @return LocalDateTime
     */
    public LocalDateTime calcularTempoVotacao (Integer tempo){
        int tempoDefault = 1;
        if (tempo != null && tempo !=0){
            return LocalDateTime.now().plusMinutes(tempo);
        }
        else {
            return LocalDateTime.now().plusMinutes(tempoDefault);
        }
    }

    /**
     * Realiza a transformação da entidade pauta em DTO.
     * @param pauta @{@link Pauta}
     * @return @{@link PautaDTO}
     */

    public static PautaDTO toDTO (Pauta pauta){
        return new PautaDTO(pauta.getId(), pauta.getAssunto(), pauta.getTempoVotacao());}
}

