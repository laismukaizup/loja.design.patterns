package br.com.zup.academy.pedido.acao;

import br.com.zup.academy.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("salvado pedido no banco de dados");
    }
}
