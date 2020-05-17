package com.example.demo.DTO;

public class ResultadoDTO {

    private int idPauta;
    private int sim = 0;
    private int nao = 0;
    private String resultado;

    /**
     * Além de informar os itens necessários para a excecução do método, também possui as condições de resultado de votação.
     * @param idPauta @{@link ResultadoDTO}
     * @param sim @{@link ResultadoDTO}
     * @param nao @{@link ResultadoDTO}
     */
    public ResultadoDTO(int idPauta, int sim, int nao) {
        this.idPauta = idPauta;
        this.sim = sim;
        this.nao = nao;
        if (sim>nao){
            resultado = "Pauta Aprovada";
        }
        if (sim<nao){
            resultado = "Pauta reprovada";
        }
        if(sim == nao){
            resultado = "Repetir votação.";
        }
    }

    public int getSim() {
        return sim;
    }

    public int getNao() {
        return nao;
    }

    public int getIdPauta() {
        return idPauta;
    }

    public String getResultado() {
        return resultado;
    }
}