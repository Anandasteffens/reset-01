package com.example.demo.service;

import com.example.demo.DTO.PautaDTO;
import com.example.demo.DTO.VotoDTO;
import com.example.demo.repository.AssociadoRepository;
import com.example.demo.repository.PautaRepository;
import com.example.demo.dominio.Associado;
import com.example.demo.dominio.Pauta;
import com.example.demo.DTO.ResultadoDTO;
import com.example.demo.dominio.Voto;

import java.time.LocalDateTime;


public class PautaService {

    private PautaRepository pautaRepository = new PautaRepository();
    private AssociadoRepository associadoRepository = new AssociadoRepository();

    public PautaDTO cadastrar(PautaDTO pautaDTO) {
        if (pautaDTO != null) {
            Pauta pautaCadastrada = pautaRepository.cadastrar(PautaDTO.toEndity(pautaDTO)); //recebe pauta
            return Pauta.toDTO(pautaCadastrada);
        }
        return null;
    }

    public boolean votar(int idPauta, VotoDTO votoDTO) {
        Pauta pauta = pautaRepository.pesquisar(idPauta);
        Associado associadoCadastrado = associadoRepository.pesquisar(votoDTO.getIdAssociado());
        boolean tempoVotacao = pauta.getDataLimite().isAfter(LocalDateTime.now());
        if (pauta != null && pauta.associadoPodeVotar(votoDTO.getIdAssociado()) && associadoCadastrado != null && tempoVotacao) {
            Voto voto = VotoDTO.toEndity(votoDTO);
                pauta.votar(voto);
                return true;
            }
        return false;
        }


    public ResultadoDTO contabilizarVotacao(int idPauta) {
        Pauta pauta = pautaRepository.pesquisar(idPauta);
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




