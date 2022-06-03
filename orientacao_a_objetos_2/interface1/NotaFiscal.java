package com.company.orientacao_a_objetos_2.interface1;

public class NotaFiscal implements Imprimivel, EnviavelPorEmail {
    private int numero;

    public NotaFiscal(int numero) {
        this.numero = numero;
    }

    @Override
    public void enviar(String email) {
        System.out.println("Enviando a nota de número " + numero + " para o e-mail: " + email);
    }

    @Override
    public void imprimir() {
        
    }

    public void adicionarPedido(String produto) {
    }
}
