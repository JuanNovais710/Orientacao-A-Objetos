package com.company.orientacao_a_objetos_2.classes_abstratas.exercicio_classe_abstrata.pessoas;
/*
Você precisa exibir relatórios de contas a pagar e receber, pois ajudará no controle do que tem para pagar e receber na empresa. Para isso,
precisará de uma nova classe chamada RelatorioContas.
Essa nova classe deve possuir um método que recebe um array de contas e exibe o detalhamento de todas elas.
A classe RelatorioContas não deve conhecer os detalhes das subclasses de Conta (ou seja, ContaPagar e ContaReceber).
Não seria uma boa prática essa classe obter os detalhes das contas para mostrá-los na tela, por isso, temos uma excelente ideia de uso da orientação a objetos.
Na classe Conta, adicione um método abstrato (não implementado).
Ao fazer isso, você será obrigado a implementar esse novo método nas subclasses ContaPagar e ContaReceber. Então, faça isso!
Esse método deve exibir todos os detalhes do objeto em um formato legal para aparecer em um relatório.
Agora você pode voltar à classe RelatorioContas e invocar o método exibirDetalhes() durante a listagem. Veja que a classe RelatorioContas só deve conhecer o nome do método
exibirDetalhes(), mais nada!
Para testar, compile e execute a classe Principal abaixo:
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
		ContaPagar contaPagar1 = new ContaPagar();
		contaPagar1.setDescricao("Aluguel da matriz");
		contaPagar1.setValor(1230d);
		contaPagar1.setDataVencimento("10/05/2012");
		contaPagar1.setFornecedor(imobiliaria);
		ContaPagar contaPagar2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");

		// instanciando contas a receber
		ContaReceber contaReceber1 = new ContaReceber();
		contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
		contaReceber1.setValor(89500d);
		contaReceber1.setDataVencimento("23/05/2012");
		contaReceber1.setCliente(atacadista);
		ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online",
			53200d, "13/05/2012");
		// exibe listagem de todas as contas com detalhamento
		RelatorioContas relatorio = new RelatorioContas();
		Conta[] contas = new Conta[]{contaPagar1, contaPagar2, contaReceber1, contaReceber2};
		relatorio.exibirListagem(contas);
	}
*/

public class ContaAPagar extends Conta{

    public ContaAPagar() {
    }
    public ContaAPagar(Fornecedor fornecedor, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }
    @Override
    public void exibirDetalhes() {
        System.out.println("Conta a pagar: " + this.getDescricao() + "\nNo valor de: R$ " + this.getValor() +  "\nVencimento em: " + this.dataDeVencimento + "\nPara: " + this.getFornecedor().getNome() + "\n ------------");
    }
}
