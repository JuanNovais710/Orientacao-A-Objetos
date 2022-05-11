package com.company.desafio_objeto_this_e_construtores;

/*
Você é um empresário da área de tecnologia da informação que tem um bom faturamento mensal,
porém suas contas a pagar estão totalmente desorganizadas. A planilha Excel que você usa já não suporta mais
 o movimento que a empresa possui, e chegou a hora de investir no desenvolvimento de um sistema financeiro para a empresa.

Você faz questão de ser o programador desse sistema, no entanto, você pediu que seu analista de sistemas criasse um diagrama de classes simples
 para criar as primeiras classes do projeto.
Uma conta a pagar possui uma descrição, valor, data de vencimento e fornecedor.
Um fornecedor é uma entidade que possui apenas o nome.
Agora você deve criar o código-fonte das classes ContaPagar e Fornecedor. Note que existem dois construtores na classe ContaPagar,
 sendo um construtor padrão (sem parâmetros), que não deve fazer nada, e outro construtor que recebe alguns parâmetros e deve atribuir os
 valores recebidos às variáveis de instância.
As duas classes são JavaBeans. Quando desenhamos diagramas de classes, não há necessidade de mostrar os métodos getters e setters de JavaBeans.
O método pagar() deve apenas exibir na tela as informações do pagamento (descrição da conta, valor, data de vencimento e nome do fornecedor).
*/

public class ContaAPagar {
    String descricao;
    Double valor;
    String dataDeVencimento;
    Fornecedor fornecedor;

    public void contaAPagar(String descricao, Fornecedor fornecedor, Double valor, String dataDeVencimento) {
        this.descricao = descricao;
        this.fornecedor = fornecedor;
        this.valor = valor;
        this.dataDeVencimento = dataDeVencimento;
    }
    public void pagar() {
        System.out.println(fornecedor.getNome() + ": " + getDescricao() + "\n" + getDataDeVencimento() + "\nR$ " + getValor() + "\n");
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }
    public Double getValor() {
        return valor;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public String getDataDeVencimento() {
        return dataDeVencimento;
    }
    public String getDescricao() {
        return descricao;
    }
}
