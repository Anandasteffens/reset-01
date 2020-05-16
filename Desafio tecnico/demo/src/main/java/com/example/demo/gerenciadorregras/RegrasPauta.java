package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoAssociado;
import com.example.demo.acervobd.AcervoPauta;
import com.example.demo.dominioclasses.Associado;
import com.example.demo.dominioclasses.Pauta;
import com.example.demo.dominioclasses.Voto;

import java.util.ArrayList;
import java.util.List;


public class RegrasPauta {

    private AcervoPauta acervoPauta = new AcervoPauta();
    private AcervoAssociado acervoAssociado = new AcervoAssociado();

    public boolean votar (int idPauta, Voto voto){
        Pauta pauta = acervoPauta.pesquisar(idPauta);
        Associado associadoCadastrado = acervoAssociado.pesquisar(voto.getIdAssociado());
        if (pauta != null && pauta.associadoPodeVotar(voto.getIdAssociado()) && associadoCadastrado != null){
           pauta.votar(voto);
            return true;
        }
        return false;
    }

    public Pauta cadastrar(Pauta pauta) {
        if (pauta != null) {
            return acervoPauta.cadastrar(pauta);
        }
        return null;
    }

}
