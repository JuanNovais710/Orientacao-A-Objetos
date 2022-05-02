package com.company.exercicio_aumento_salario;

public class Empregado {
    String nome;
    Double salarioBruto;
    Double imposto;
    Double aumento;
    Double salarioComAumento;

    void setNome (String nome) {
        this.nome = nome;
    }
    void setSalarioBruto (Double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }
    void setImposto (Double imposto) {
        this.imposto = imposto;
    }
    String getNome() {
        return nome;
    }
    Double salarioLiquido() {
        return salarioBruto - imposto;
    }
    String retornaNome() {
        return "Empregado: " + nome;
    }
    void setAumento (Double aumento) {
        this.aumento = aumento;
    }
    Double salarioComAumento(Double aumentoSalario) {
        aumentoSalario = (salarioLiquido() * aumento) / 100;
        return salarioLiquido() + aumentoSalario;
    }

}
