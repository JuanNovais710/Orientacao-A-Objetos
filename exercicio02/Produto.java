package com.company.exercicio02;

public class Produto {
    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;
    String nome;
    Integer quantidade;

    Boolean necessarioReporEstoque() {
        if(quantidade < QUANTIDADE_MINIMA_ESTOQUE) {
            return true;
        }
        return  false;
    }
}
