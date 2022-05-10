package com.company.orientacao_a_objetos_2;

public class TesteConstrutor {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa ("João");
        System.out.println(pessoa1.nome + " tem " + pessoa1.idade + " anos.");
        exibirTraco();
        Pessoa pessoa2 = new Pessoa("Maria", 17);
        System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos.");
        exibirTraco();
        Pessoa pessoa3 = new Pessoa("Vitor", 19, 1.68);
        System.out.println(pessoa3.nome + " tem " + pessoa3.idade + " e mede " + pessoa3.altura + " M.");
    }
    static void exibirTraco() {
        System.out.println("----------------");
    }
}
