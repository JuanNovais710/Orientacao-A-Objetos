package com.company.orientacao_a_objetos_2.classes_abstratas;

public abstract class Produto {
    String descricao;
    public abstract void imprimirDescricao();
    public String getDescricao() {
        return descricao;
    }
}
