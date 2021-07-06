package br.com.zup.academy;

import br.com.zup.academy.pedido.GeraPedido;
import br.com.zup.academy.pedido.GeraPedidoHandler;
import br.com.zup.academy.pedido.acao.EnviarEmailPedido;
import br.com.zup.academy.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TesteDePedidos {
    public static void main(String[] args) {
        GeraPedido gerador = new GeraPedido("Ana da Silva", new BigDecimal("600"), 4);
        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoNoBancoDeDados(), new EnviarEmailPedido())
        );
        handler.executa(gerador);
    }
}
