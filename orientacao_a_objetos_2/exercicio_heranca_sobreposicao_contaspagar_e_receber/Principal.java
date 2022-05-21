package com.company.orientacao_a_objetos_2.exercicio_heranca_sobreposicao_contaspagar_e_receber;
/*
Vamos continuar o desafio anterior, que você começou a desenvolver as classes de um sistema financeiro.
O analista de sistemas responsável por estruturar as classes do software enviou para você o seguinte e-mail:
Olá chefe,
Esqueci de algumas coisas importantes no diagrama que enviei para você anteriormente, por isso seguem algumas revisões:
Crie uma enumeração chamada SituacaoConta com as seguintes constantes: PENDENTE, PAGA e CANCELADA.
Inclua um atributo chamado "situacaoConta" do tipo SituacaoConta na classe ContaPagar.
O atributo "situacaoConta" deve possuir apenas o método getter. O setter não deve existir por questões de segurança.
Ninguém pode pagar uma conta simplesmente mudando a situação dela, mas deve sempre passar pelo método pagar().
No construtor padrão (o que não recebe parâmetros) da classe ContaPagar, atribua a constante PENDENTE (da SituacaoConta) à variável "situacaoConta",
assim, todas as contas a pagar instanciadas ficarão com o status PENDENTE por padrão.
No construtor que recebe os parâmetros, lembre de invocar o construtor padrão usando a instrução this(),
pois também neste caso é importante que a "situacaoConta" seja definida com a constante PENDENTE.
O método pagar() deve verificar a situação da conta antes de efetivar o pagamento. Se a situação for CANCELADA ou PAGA,
uma mensagem de erro deve ser exibida ao usuário. Uma conta só deve ser paga se a situação atual for PENDENTE.
No caso de uma conta ser paga através do método pagar(), não esquecer de atribuir a constante PAGA à variável "situacaoConta".
Crie um método cancelar() na classe ContaPagar que muda a situação da conta para CANCELADA e exibe uma mensagem para o usuário.
A regra neste caso é a seguinte: não se pode cancelar uma conta que já foi cancelada ou paga.
Ok, seu analista lhe deu muito trabalho, mas pense como isso será útil para você aprender sobre as enumerações, pacotes e, claro, praticar Java. :)
Quando terminar todas as solicitações do analista, modifique a classe Principal do desafio anterior para o código-fonte abaixo, compile tudo e execute.
public class Principal {
	public static void main(String[] args) {
		Fornecedor imobiliaria = new Fornecedor();
		imobiliaria.setNome("Casa & Cia Negócios Imobiliários");
		Fornecedor mercado = new Fornecedor();
		mercado.setNome("Mercado do João");
		ContaPagar conta1 = new ContaPagar();
		conta1.setDescricao("Aluguel da matriz");
		conta1.setValor(1230d);
		conta1.setDataVencimento("10/05/2012");
		conta1.setFornecedor(imobiliaria);
		ContaPagar conta2 = new ContaPagar(mercado, "Compras do mês", 390d, "19/05/2012");
		ContaPagar conta3 = new ContaPagar(mercado, "Aluguel da filial", 700d, "11/05/2012");
		// pagamento de conta pendente (ok, deve funcionar)
		conta1.pagar();
		// tentativa de pagar uma conta cancelada (não deve aceitar pagamento)
		conta2.cancelar();
		conta2.pagar();
		// tentativa de pagar uma conta duas vezes (não deve aceitar na segunda vez)
		conta3.pagar();
		conta3.pagar();
	}
}
Preste bastante atenção se todas as regras estão sendo executadas corretamente. Só para lembrar:
Uma conta que já foi paga não pode ser paga novamente e nem cancelada.
Uma conta que já foi cancelada não pode ser cancelada novamente e nem paga.
Boa sorte!
 */

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
            ContaReceber contaReceber1 = new ContaReceber();
            contaReceber1.setDescricao("Desenvolvimento de projeto de logística em Java");
            contaReceber1.setValor(89500d);
            contaReceber1.setDataDeVencimento("23/05/2012");
            contaReceber1.setCliente(atacadista);

            ContaReceber contaReceber2 = new ContaReceber(telecom, "Manutenção em sistema de conta online",
                    53200d, "13/05/2012");

            // pagamento e cancelamento de contas a pagar
            contaPagar1.pagar();
            contaPagar2.cancelar();

            // recebimento e cancelamento de contas a receber
            contaReceber1.receber();
            contaReceber2.cancelar();
        }

    }
