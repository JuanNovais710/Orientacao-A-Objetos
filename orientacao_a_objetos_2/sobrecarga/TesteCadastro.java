package com.company.orientacao_a_objetos_2.sobrecarga;

public class TesteCadastro {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Juan", 20);
        CadastroPessoa cadastro = new CadastroPessoa();
        cadastro.cadastrar(pessoa);
        cadastro.cadastrar("Sei la", 15);
        cadastro.cadastrar("Pombo");

    }
}
