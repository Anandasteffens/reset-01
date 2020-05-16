//package com.example.demo.dominioclasses;
//
//import com.example.demo.acervobd.AcervoAssociado;
//
//import java.time.LocalDateTime;
//import java.util.List;
//import java.util.Scanner;
//
//public class SessaoVotacao {
//
//    private AcervoAssociado acervo = new AcervoAssociado();
//    private Integer tempoDefaul = 1;
//
//    public SessaoVotacao () {};
//
//
//            private LocalDateTime calcularTempo(Integer tempo) {
//        if (tempo != null && tempo != 0) {
//            return LocalDateTime.now().plusMinutes(tempo);
//        } else {
//            return LocalDateTime.now().plusMinutes(tempoDefaul);
//        }
//    }
//
//    SessaoVotacaoDTO dto = new SessaoVotacaoDTO(null, LocalDateTime.now(), calcularTempo(sessaoVotacaoAbrirDTO.getTempo()), Boolean.TRUE);
//
//}
