package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoAssociado;
import com.example.demo.acervobd.AcervoPauta;
import com.example.demo.dominioclasses.Associado;
import com.example.demo.dominioclasses.Pauta;
import com.example.demo.dominioclasses.Resultado;
import com.example.demo.dominioclasses.Voto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class RegrasPauta {

    private AcervoPauta acervoPauta = new AcervoPauta();
    private AcervoAssociado acervoAssociado = new AcervoAssociado();

    public Pauta cadastrar(Pauta pautaRequest) {
        if (pautaRequest != null) {
            Pauta novaPauta = new Pauta(pautaRequest.getAssunto(), pautaRequest.getTempoVotacao());
            return acervoPauta.cadastrar(novaPauta);
        }
        return null;
    }

    public boolean votar(int idPauta, Voto voto) {
        Pauta pauta = acervoPauta.pesquisar(idPauta);
        Associado associadoCadastrado = acervoAssociado.pesquisar(voto.getIdAssociado());
        boolean tempoVotacao = pauta.getDataLimite().isAfter(LocalDateTime.now());
        if (pauta != null && pauta.associadoPodeVotar(voto.getIdAssociado()) && associadoCadastrado != null && tempoVotacao) {
                pauta.votar(voto);
                return true;
            }
        return false;
        }


    public Resultado contabilizarVotacao(int idPauta) {
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
            Resultado resultadoVotacao = new Resultado(idPauta, sim, nao);
            return resultadoVotacao;
        }
        return null;
    }

}




