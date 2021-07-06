package br.com.zup.academy.pedido.acao;

import br.com.zup.academy.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("enviado e-mail com dados do pedido");

    }
}
