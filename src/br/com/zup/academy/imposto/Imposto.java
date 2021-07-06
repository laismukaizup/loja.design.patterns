package br.com.zup.academy.imposto;

import br.com.zup.academy.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    public BigDecimal calcular(Orcamento orcamento);
}
