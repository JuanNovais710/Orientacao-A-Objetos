package com.company.orientacao_a_objetos_2.classe_enumeracoes_5_12_baralho;

public enum Naipe {
    OURO("Vermelho"),
    PAUS("PRETO"),
    ESPADA("PRETO"),
    COPAS("VERMELHO");
    private String cor;
    Naipe(String cor) {
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }
}
