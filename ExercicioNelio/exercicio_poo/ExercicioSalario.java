package com.company.exercicio_poo;

import java.util.Scanner;

public class ExercicioSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Empregado empregado = new Empregado();
        System.out.print("Nome do funcionário: ");
        empregado.setNome(scanner.nextLine());
        System.out.print("Salário bruto: ");
        empregado.setSalarioBruto(scanner.nextDouble());
        System.out.print("Imposto: ");
        empregado.setImposto(scanner.nextDouble());
        System.out.println("\n" + empregado.retornaNome() + ". Salário líquido: R$ " + empregado.salarioLiquido());
        System.out.print("\nQuantos % de aumento " + empregado.getNome() + " irá receber: ");
        empregado.setAumento(scanner.nextDouble());
        System.out.print("\nDados atualizados: " + empregado.getNome() + ", R$" + empregado.salarioComAumento(empregado.aumento));

    }
}
