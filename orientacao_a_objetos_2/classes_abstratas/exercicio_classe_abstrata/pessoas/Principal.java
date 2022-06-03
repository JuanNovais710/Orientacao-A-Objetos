package com.company.orientacao_a_objetos_2.classes_abstratas.exercicio_classe_abstrata.pessoas;

public class Principal {
    public static void main(String[] args) {
        // instanciando fornecedores
        Fornecedor imobiliaria = new Fornecedor();
        imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
        Fornecedor mercado = new Fornecedor();
        mercado.setNome("Mercado do João");

        // instanciando clientes
        Cliente atacadista = new Cliente();
        atacadista.setNome("Triângulo Quadrado Atacadista");
        Cliente telecom = new Cliente();
        telecom.setNome("FoneNet Telecomunicações");

        // instanciando contas a pagar
        ContaAPagar contaPagar1 = new ContaAPagar();
        contaPagar1.setDescricao("Aluguel da matriz");
        contaPagar1.setValor(1230d);
        contaPagar1.setDataDeVencimento("10/05/2012");
        contaPagar1.setFornecedor(imobiliaria);
        ContaAPagar contaPagar2 = new ContaAPagar(mercado, "Compras do mês", 390d, "19/05/2012");

        // instanciando contas a receber
        ContaAReceber contaReceber1 = new ContaAReceber();
        contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
        contaReceber1.setValor(89500d);
        contaReceber1.setDataDeVencimento("23/05/2012");
        contaReceber1.setCliente(atacadista);
        ContaAReceber contaReceber2 = new ContaAReceber(telecom, "Manutenção em sistema de conta online",
                53200d, "13/05/2012");
        // exibe listagem de todas as contas com detalhamento
        RelatorioContas relatorio = new RelatorioContas();
        Conta[] contas = new Conta[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
        relatorio.exibirAListagem(contas);
    }
}
