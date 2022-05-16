package com.company.orientacao_a_objetos_2.modificadores_static_e_final;

public class TesteContador {
    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.incrementar();
        System.out.println(Contador.COUNT);
        Contador.COUNT++;
        System.out.println(Contador.COUNT);
        Contador.imprimirContador();
    }
}
