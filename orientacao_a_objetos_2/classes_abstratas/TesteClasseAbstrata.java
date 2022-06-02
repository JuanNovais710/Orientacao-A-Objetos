package com.company.orientacao_a_objetos_2.classes_abstratas;

public class TesteClasseAbstrata {
    public static void main(String[] args) {
        Produto produto = new ProdutoPerecivel();
        produto.descricao = "Coca-cola";
        ProdutoPerecivel produtoPerecivel = (ProdutoPerecivel) produto;
        produtoPerecivel.dataValidade = "03/06/2022";
        produto.imprimirDescricao();
    }
}
