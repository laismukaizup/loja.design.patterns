package br.com.zup.academy.desconto;

import br.com.zup.academy.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        return new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueCinquentos(
                        new SemDesconto())).calcular(orcamento);
    }
}
