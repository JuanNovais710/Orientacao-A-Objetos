package com.company.orientacao_a_objetos_2;

public class Pessoa {
    String nome;
    int idade;
    Double altura;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this(nome);
        this.idade = idade;
    }
    public Pessoa(String nome, int idade, Double altura) {
        this(nome);
        this.idade = idade;
        this.altura = altura;
    }
}
