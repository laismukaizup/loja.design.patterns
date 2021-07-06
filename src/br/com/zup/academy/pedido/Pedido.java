package br.com.zup.academy.pedido;

import br.com.zup.academy.orcamento.Orcamento;

import java.time.LocalDateTime;

public class Pedido {
    private String nome;
    private LocalDateTime data;
    private Orcamento orcamento;

    public Pedido(String nome, LocalDateTime data, Orcamento orcamento) {
        this.nome = nome;
        this.data = data;
        this.orcamento = orcamento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Orcamento getOrcamento() {
        return orcamento;
    }
}
