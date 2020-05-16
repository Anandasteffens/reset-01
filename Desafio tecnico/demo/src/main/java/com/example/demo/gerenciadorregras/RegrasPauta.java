package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoPauta;
import com.example.demo.dominioclasses.Pauta;
import com.example.demo.dominioclasses.Voto;


public class RegrasPauta {

    private AcervoPauta acervoPauta = new AcervoPauta();

    public void votar (int idPauta, Voto voto){
        Pauta pauta = acervoPauta.pesquisar(idPauta);
        if (pauta != null && pauta.associadoPodeVotar(voto.getIdAssociado())){
            pauta.votar(voto);
        }
    }

    public Pauta cadastrar(Pauta pauta) {
        if (pauta != null) {
            return acervoPauta.cadastrar(pauta);
        }
        return null;
    }

}
