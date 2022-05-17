package com.company.orientacao_a_objetos_2.classe_enumeracoes_5_12_baralho;

public enum OperacaoAritmetica {
    ADICAO {
        public int operacao(int x, int y) {
            return x + y;
        }
    },
    SUBTRACAO {
        public int operacao(int x, int y) {
            return x - y;
        }
    };
    public abstract int operacao(int x, int y);
}
