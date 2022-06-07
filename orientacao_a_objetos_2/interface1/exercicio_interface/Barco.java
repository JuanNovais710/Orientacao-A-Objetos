package com.company.orientacao_a_objetos_2.interface1.exercicio_interface;

public class Barco implements Seguravel{
    String descricao;

    @Override
    public String obterDescricao() {
        this.descricao = descricao;
        return descricao;
    }

    @Override
    public double calcularValorApolice() {

        return 0;
    }
    public Barco (String descricao) {
        this.descricao = descricao;
    }
}
