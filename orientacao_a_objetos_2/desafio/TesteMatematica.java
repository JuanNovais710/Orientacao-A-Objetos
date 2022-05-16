package com.company.orientacao_a_objetos_2.desafio;

public class TesteMatematica {
    public static void main(String[] args) {
        MatematicaUtil formula = new MatematicaUtil();
        double resultadoArea = MatematicaUtil.calcularAreaCirculo(6);
        System.out.println("Área do círculo: " + resultadoArea);
        double resultadoFibonacci = MatematicaUtil.calcularFibonacci(7);
        System.out.println("Número de fibonacci: " + resultadoFibonacci);
    }
}
