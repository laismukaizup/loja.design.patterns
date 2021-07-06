package br.com.zup.academy;

import br.com.zup.academy.imposto.CalculadoraDeImpostos;
import br.com.zup.academy.imposto.ICMS;
import br.com.zup.academy.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDeImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, new ICMS()));
    }
}
