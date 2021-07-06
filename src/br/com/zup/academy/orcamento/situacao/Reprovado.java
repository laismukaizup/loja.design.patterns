package br.com.zup.academy.orcamento.situacao;

import br.com.zup.academy.orcamento.Orcamento;

public class Reprovado extends SituacaoOrcamento{

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
