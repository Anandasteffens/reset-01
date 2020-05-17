package com.example.demo.service;

import com.example.demo.DTO.AssociadoDTO;
import com.example.demo.repository.AssociadoRepository;
import com.example.demo.dominio.Associado;

public class AssociadoService {
    private AssociadoRepository acervo = new AssociadoRepository();

    public AssociadoDTO cadastrar (AssociadoDTO associadoDTO){
        if (associadoDTO != null){
            Associado associadoCadastrado = acervo.cadastrar(AssociadoDTO.toEndity(associadoDTO)); //recebe associado.
            AssociadoDTO associadoTransformadoDto = Associado.toDTO(associadoCadastrado);
            return associadoTransformadoDto;
        }
        return null;
    }


    public Associado pesquisar(int idAssociado) {
        if (idAssociado > 0) {
            return acervo.pesquisar(idAssociado);
        }
        return null;
    }

}
