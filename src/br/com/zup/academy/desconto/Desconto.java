package br.com.zup.academy.desconto;

import br.com.zup.academy.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {
    protected Desconto proximo;


    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (deveCalcular(orcamento))
            return efetuarCalculo(orcamento);
        return proximo.calcular(orcamento);
    }

    public abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    public abstract boolean deveCalcular(Orcamento orcamento);
}
