package com.company.orientacao_a_objetos_2.classe_enumeracoes_5_12_baralho;

public class TesteOperacaoEnum {
    public static void main(String[] args) {
        OperacaoAritmetica operacao1 = OperacaoAritmetica.ADICAO;
        int resultado1 = operacao1.operacao(5,5);
        System.out.println(resultado1);
        OperacaoAritmetica operacao2 = OperacaoAritmetica.SUBTRACAO;
        int resultado2 = operacao2.operacao(5,5);
        System.out.println(resultado2);

    }
}
