package com.company.orientacao_a_objetos_2.heranca_e_modificador_protect;

public class Pessoa {
    String nome;
    protected int idade;
    public void apresentacao() {
        System.out.println("Olá! Sou " + nome + ", e tenho " +
                idade + " anos.");

    }
}
