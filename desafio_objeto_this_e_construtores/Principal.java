package com.company.desafio_objeto_this_e_construtores;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Fornecedor padaria = new Fornecedor();
        padaria.setNome("Padoca do Jão!");
        ContaAPagar conta1 = new ContaAPagar();
        conta1.contaAPagar("Eletricidade", padaria, 1880.00, "12/05/2022");
        conta1.pagar();
        Fornecedor aluguel = new Fornecedor();
        aluguel.setNome("MRV Imóveis");
        ContaAPagar conta2 = new ContaAPagar();
        conta2.contaAPagar("Aluguel", aluguel, 1500.00, "20/05/2022");
        conta2.pagar();
        ContaAPagar conta3 = new ContaAPagar();
        Fornecedor internet = new Fornecedor();
        internet.setNome("NET");
        conta3.setFornecedor(internet);
        conta3.setDescricao("Internet mês de maio");
        conta3.setValor(250.00);
        conta3.setDataDeVencimento("20/05/2022");
        conta3.pagar();

    }
}
