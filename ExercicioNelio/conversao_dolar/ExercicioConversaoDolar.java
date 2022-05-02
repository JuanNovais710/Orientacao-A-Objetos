package com.company.conversao_dolar;

import java.util.Scanner;

public class ExercicioConversaoDolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversorDeMoeda conversorDeMoeda = new ConversorDeMoeda();
        System.out.print("Qual o valor do dólar? ");
        conversorDeMoeda.setValorDolar(scanner.nextDouble());
        System.out.print("Quantos dólares deseja comprar? ");
        conversorDeMoeda.setDolaresComprados(scanner.nextDouble());
        double valorEmReais = ConversorDeMoeda.conversao(conversorDeMoeda.valorDolar, conversorDeMoeda.dolaresComprados);
        System.out.print("O valor a ser pago em reais: R$ " + valorEmReais);

    }
}
