package com.company.exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "MacBook";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos " + produto.nome + " estão no estoque? ");
        produto.quantidade = scanner.nextInt();
        System.out.print("Temos " + produto.quantidade + " de " + produto.nome + " é necessário repor o estoque? " + produto.necessarioReporEstoque());
    }

}
