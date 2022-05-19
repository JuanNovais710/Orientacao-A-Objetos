package com.company.orientacao_a_objetos_2.heranca_e_modificador_protect;

public class TesteHeranca {
    public static void main(String[] args) {
        Jogador j = new Jogador();
        j.nome = "Ronaldo";
        j.idade = 33;
        j.apresentacao();
        j.dizerSeAindaJoga();
    }
}
