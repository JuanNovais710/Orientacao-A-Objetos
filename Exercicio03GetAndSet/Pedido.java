package com.company.Exercicio03GetAndSet;

public class Pedido {
    String codigo;
    Double subtotal;
    Double desconto;

    void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    void setSubtotal(Double subTotal) {
        this.subtotal = subTotal;
    }
    void setDesconto(Double desconto) {
        this.desconto = subtotal * desconto;
    }
    String getCodigo() {
        return codigo;
    }
    Double getSubtotal() {
        return subtotal;
    }
    Double getDesconto() {
        return desconto;
    }
    Double getTotal() {
        return getSubtotal() - getDesconto();
    }
}
