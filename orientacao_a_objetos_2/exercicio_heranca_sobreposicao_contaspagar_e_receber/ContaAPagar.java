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

Preste bastante atenção se todas as regras estão sendo executadas corretamente. Só para lembrar:
Uma conta que já foi paga não pode ser paga novamente e nem cancelada.
Uma conta que já foi cancelada não pode ser cancelada novamente e nem paga.
Boa sorte!
 */

public class ContaAPagar extends Conta {

    public ContaAPagar() {
    }
    public ContaAPagar(Fornecedor fornecedor, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.fornecedor = fornecedor;
        this.descricao = descricao;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }
    public void pagar() {
        if(SituacaoConta.PAGA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que já está paga. " + this.getDescricao() + ".");
        }else if (SituacaoConta.CANCELADA.equals(this.getSituacaoConta())) {
            System.out.println("Não pode pagar uma conta que foi cancelada. " + this.getDescricao() + ".");
        }else {
            System.out.println(fornecedor.getNome() + ": " + getDescricao() + "\n" + getDataDeVencimento() + "\nR$ " + getValor() + "\n");
            this.situacaoConta = SituacaoConta.PAGA;
        }
    }


}
