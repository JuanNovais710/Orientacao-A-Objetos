package com.company.orientacao_a_objetos_2.interface1;

public class TesteInterface {
    public static void main(String[] args) {
        Imprimivel i = new NotaFiscal(1234);
        EnviavelPorEmail e = (EnviavelPorEmail) i;
        e.enviar("Juannovais63@gmail.com");
        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("Caixa de leite");
    }
}
