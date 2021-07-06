package br.com.zup.academy;

import br.com.zup.academy.desconto.CalculadoraDeDescontos;
import br.com.zup.academy.imposto.CalculadoraDeImpostos;
import br.com.zup.academy.imposto.ICMS;
import br.com.zup.academy.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteDeDescontos {

    public static void main(String[] args) {


        Orcamento primeiro = new Orcamento(new BigDecimal("100"), 4);
        Orcamento segundo = new Orcamento(new BigDecimal("600"), 6);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
    }
}
