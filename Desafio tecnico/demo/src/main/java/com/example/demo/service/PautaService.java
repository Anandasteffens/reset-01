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

    /**
     * Modifica a Entidade Pauta cadastrada para DTO através dos métodos "toEndity" e "toDTO".
     * @param pautaDTO @{@link PautaDTO}
     * @return @{@link PautaDTO}
     */
    public PautaDTO cadastrar(PautaDTO pautaDTO) {
        if (pautaDTO != null) {
            Pauta pautaCadastrada = pautaRepository.cadastrar(PautaDTO.toEndity(pautaDTO)); //recebe pauta
            return Pauta.toDTO(pautaCadastrada);
        }
        return null;
    }

    /**
     * Realiza as verificações para ver se é possível continuar com a ação de votar;
     * Verifica se o ID da pauta e do associado informados existem nas listas;
     * Realiza a validacao se o associado ja votou na pauta informada pelo seu ID, caso não tenha pode votar;
     * Verifica o tempo disponível para votação;
     * Transforma o DTA na entidade voto e caso todas as condições sejam atendidas realiza o voto na pauta.
     * @param idPauta @{@link PautaService}
     * @param votoDTO @{@link VotoDTO}
     * @return @{@link Voto}
     */
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

    /**
     *Verifica se o id da pauta informado exista na lista;
     * Percorre a lista de votos e contabiliza os mesmos nas variáveis sim e nao;
     * Realiza a contabilização dos votos e informa o resultado da votação;
     * @param idPauta @{@link ResultadoDTO}
     * @return @{@link ResultadoDTO}
     */
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




