package com.company.orientacao_a_objetos_2.sobrecarga.exercicio_sobrecarga;

public class TesteMaquinaCafe {
    public static void main(String[] args) {
        MaquinaCafe maquinaCafe = new MaquinaCafe(20);
        maquinaCafe.fazerCafe(5);
        maquinaCafe.fazerCafe(25);
        maquinaCafe.fazerCafe();

    }
}
