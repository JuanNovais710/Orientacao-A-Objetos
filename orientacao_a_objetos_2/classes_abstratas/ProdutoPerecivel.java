package com.company.orientacao_a_objetos_2.classes_abstratas;

public class ProdutoPerecivel extends Produto {
    String dataValidade;
    @Override
    public void imprimirDescricao() {
        System.out.println("Descrição: " + super.getDescricao() + ". Válido até: " + dataValidade);
    }
}
