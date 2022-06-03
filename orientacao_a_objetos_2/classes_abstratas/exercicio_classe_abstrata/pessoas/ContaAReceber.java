package com.company.orientacao_a_objetos_2.classes_abstratas.exercicio_classe_abstrata.pessoas;

public class ContaAReceber extends Conta{

    public ContaAReceber() {
    }
    public ContaAReceber(Cliente cliente, String descricao, Double valor, String dataDeVencimento) {
        this();
        this.descricao = getDescricao();
        this.valor = getValor();
        this.dataDeVencimento = getDataDeVencimento();
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Recebendo conta: " + getDescricao() + "\nNo valor de: R$ " + getValor() +  "\nVencimento em: " + dataDeVencimento + "\n ------------------");
    }

}
