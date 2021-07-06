package br.com.zup.academy.desconto;

import br.com.zup.academy.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{


    public SemDesconto() {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveCalcular(Orcamento orcamento) {
        return true;
    }
}
