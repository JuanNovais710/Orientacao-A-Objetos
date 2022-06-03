package com.company.orientacao_a_objetos_2.classes_abstratas.exercicio_classe_abstrata.pessoas;
/*
Continuando a série de desafios sobre o sistema financeiro, adicionaremos agora mais métodos e classes ao projeto.
Esperamos que você esteja se divertindo, trabalhando com diversas classes ao mesmo tempo e simulando um projeto real.
Neste desafio, você não precisou pedir nada ao seu analista. Você mesmo decidiu melhorar o código-fonte.
Ao analisar as classes do projeto, percebemos que a classe Pessoa serve somente como uma classe pai para Cliente e Fornecedor.
Não gostaríamos que a classe Pessoa fosse instanciada em nenhum momento.
Para chegar a essa conclusão, é só pensarmos: faz sentido, em um sistema financeiro, existir um objeto de uma pessoa? Quem seria essa pessoa? Um cliente? Um fornecedor?
Um funcionário?
Chegamos a conclusão que Pessoa é muito abstrata para ser instanciada, portanto, está mais do que claro que essa classe deve receber a palavra-chave abstract na declaração
dela.
Se pensarmos nesse mesmo sentido, a classe Conta também está eleita a ser abstrada, afinal, não existe motivo em termos uma instância apenas de Conta. Vamos analisar:
qual seria o sentido de existir um objeto da classe Conta? Que tipo de conta seria? Conta a pagar? Conta a receber? Temos que transformar a classe Conta também em abstrata!
Achou que o exercício seria apenas isso? Você se enganou! Vamos começar agora o desafio. :)


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
 */

import com.company.orientacao_a_objetos_2.classes_abstratas.exercicio_classe_abstrata.pessoas.Fornecedor;

public abstract class Conta {
    String descricao;
    String dataDeVencimento;
    double valor;
    Fornecedor fornecedor;

    public abstract void exibirDetalhes();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(String dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setCliente(Cliente cliente) {

    }

}
