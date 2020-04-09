package com.example.demo.gerenciadorregras;

import com.example.demo.acervobd.AcervoJogo;
import com.example.demo.dominioclasses.Jogo;

import java.time.LocalDate;
import java.util.List;

public class RegrasJogo {

    private AcervoJogo acervo = new AcervoJogo();

    public Jogo cadastrar(Jogo jogo) {
        List<Jogo> jogos = acervo.listar();

        if (jogo.getNome().isEmpty() || jogo.getDataLancamento() == null || jogo.getCategoriaJogo() == null || jogo.getPlataformaJogo() == null) {
            throw new RuntimeException ("Campos de preenchimento obrigatórios não informados");
        }
        for (Jogo jogoExiste : jogos) {
            if (jogo.getNome().equals(jogoExiste.getNome())) {
                return null;
            }
            if (jogo.getDataLancamento().isAfter(LocalDate.now())) {
                return null;
            }
        }
        return acervo.cadastrar(jogo);
    }

    public List<Jogo> listar() {
        return acervo.listar();
    }

    public Jogo pesquisar(int id) {
        if (id > 0) {
            return acervo.pesquisar(id);
        }
        return null;
    }

    public Jogo editar(int id, Jogo jogo) {
        if (id > 0) {
            return acervo.editar(id, jogo);
        }
        return null;
    }

        public boolean deletar ( int id){
            if (id > 0) {
                return acervo.deletar(id);
            }
            return false;
        }

    }

