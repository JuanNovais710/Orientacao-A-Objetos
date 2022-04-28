package orientacao.objetos.produto.RecebendoInformacoes;

import javax.swing.*;
import java.util.Scanner;

public class ObterInformacoesPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        imprimirTexto("Informe seu primeiro nome: ");
        pessoa.nome = scanner.nextLine();
        imprimirTexto("Olá, " + pessoa.nome + "! E o seu sobrenome? ");
        pessoa.sobrenome = scanner.nextLine();
        imprimirTexto(pessoa.formarNomeCompleto() + ", favor informar sua idade: ");
        pessoa.idade = scanner.nextByte();
        imprimirTexto("Seu telefone com DDD: ");
        pessoa.numeroTelefone = scanner.nextLong();
        imprimirTexto("Por gentileza, seu gênero:\n(M): Masculino\t    (F): Feminino\n(T): Transgênero\t(Z): Prefiro não informar.\n");
        pessoa.genero = scanner.nextLine();
        pessoa.validarGenero();
        imprimirTexto("E para finalizar o cadastro, seu estado civil:\n(1): Solteiro\t(2): Casado\n(3): Divorciado\t(4): Viúvo\n");
        pessoa.estadoCivil = scanner.nextByte();
        limpaTela();
        imprimirTexto("Cadastro finalizado!");

    }
    static void imprimirTexto(String texto) {
        System.out.print(texto);
    }
    static void limpaTela() {
        for(int i = 0; i < 50; i++) {
            System.out.println("\n");
        }
    }
}
