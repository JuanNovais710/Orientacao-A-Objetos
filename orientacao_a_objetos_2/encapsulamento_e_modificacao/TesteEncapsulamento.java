package com.company.orientacao_a_objetos_2.encapsulamento_e_modificacao;

import java.util.Scanner;

public class TesteEncapsulamento {
    public static void main(String[] args) {
        ArCondicionado ar = new ArCondicionado();
        ar.trocarTemperatura(21);
        System.out.println("Temperatura do ar: " + ar.obterTemperatura());
    }
}
