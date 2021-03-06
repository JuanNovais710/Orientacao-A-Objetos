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
        */

import java.util.ArrayList;
import java.util.Arrays;

public class RelatorioContas{
    public void exibirAListagem(Conta[] contas) {
        for (int i = 0; i < contas.length; i++) {
            contas[i].exibirDetalhes();
        }
    }
}
