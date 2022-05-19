package com.company.orientacao_a_objetos_2.heranca_e_modificador_protect;

public class Jogador extends Pessoa {
    protected boolean aindaJoga = false;
    public void dizerSeAindaJoga() {
        System.out.println("Ainda joga? " + aindaJoga);
    }
}
