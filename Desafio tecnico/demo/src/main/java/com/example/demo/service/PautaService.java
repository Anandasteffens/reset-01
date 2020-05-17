package com.example.demo.service;

import com.example.demo.DTO.PautaDTO;
import com.example.demo.DTO.VotoDTO;
import com.example.demo.acervobd.AcervoAssociado;
import com.example.demo.acervobd.AcervoPauta;
import com.example.demo.dominioclasses.Associado;
import com.example.demo.dominioclasses.Pauta;
import com.example.demo.DTO.ResultadoDTO;
import com.example.demo.dominioclasses.Voto;

import java.time.LocalDateTime;


public class PautaService {

    private AcervoPauta acervoPauta = new AcervoPauta();
    private AcervoAssociado acervoAssociado = new AcervoAssociado();

    public PautaDTO cadastrar(PautaDTO pautaDTO) {
        if (pautaDTO != null) {
            Pauta pautaCadastrada = acervoPauta.cadastrar(PautaDTO.toEndity(pautaDTO)); //recebe pauta
            return Pauta.toDTO(pautaCadastrada);
        }
        return null;
    }

    public boolean votar(int idPauta, VotoDTO votoDTO) {
        Pauta pauta = acervoPauta.pesquisar(idPauta);
        Associado associadoCadastrado = acervoAssociado.pesquisar(votoDTO.getIdAssociado());
        boolean tempoVotacao = pauta.getDataLimite().isAfter(LocalDateTime.now());
        if (pauta != null && pauta.associadoPodeVotar(votoDTO.getIdAssociado()) && associadoCadastrado != null && tempoVotacao) {
            Voto voto = VotoDTO.toEndity(votoDTO);
                pauta.votar(voto);
                return true;
            }
        return false;
        }


    public ResultadoDTO contabilizarVotacao(int idPauta) {
        Pauta pauta = acervoPauta.pesquisar(idPauta);
        if (pauta != null) {
            int sim = 0;
            int nao = 0;
            for (Voto voto : pauta.getListaVotos()) {
                if (voto.getVoto()) {
                    sim++;
                } else {
                    nao++;
                }
            }
            ResultadoDTO resultadoDTOVotacao = new ResultadoDTO(idPauta, sim, nao);
            return resultadoDTOVotacao;
        }
        return null;
    }

}




