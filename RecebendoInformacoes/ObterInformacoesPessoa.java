package orientacao.objetos.produto.RecebendoInformacoes;
import java.util.Scanner;

public class ObterInformacoesPessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        imprimirTexto("Informe seu primeiro nome: ");
        pessoa.setNome(scanner.nextLine());
        imprimirTexto("Olá, " + pessoa.nome + "! E o seu sobrenome? ");
        pessoa.setSobrenome(scanner.nextLine());
        imprimirTexto(pessoa.formarNomeCompleto() + ", favor informar sua idade: ");
        pessoa.setIdade(scanner.nextByte());
        imprimirTexto("Seu telefone com DDD de 2 dígitos: ");
        pessoa.setNumeroTelefone(scanner.next());
        imprimirTexto("Por gentileza, seu gênero:\n(0): Masculino\t    (1): Feminino\n(2): Transgênero\t(3): Prefiro não informar.\n");
        Byte generoInformado = scanner.nextByte();
        pessoa.setGenero(generoInformado);
        imprimirTexto("E para finalizar o cadastro, seu estado civil:\n(1): Solteiro\t(2): Casado\n(3): Divorciado\t(4): Viúvo\n");
        Byte civilidade = scanner.nextByte();
        pessoa.setEstadoCivil(civilidade);
        limpaTela();
        System.out.println("Cadastro finalizado!\n" + "Nome: " + pessoa.getNome() + " " + pessoa.getSobrenome() + "\nIdade: " + pessoa.getIdade() + " anos\n" + "Contato: " + "DDD (" + pessoa.obterDDD() + ") " + pessoa.telefoneSemDDD() + "\nGênero: " + pessoa.generoToString(String.valueOf(generoInformado)) + "\nEstado civil: " + pessoa.formatarEstadoCivil(String.valueOf(civilidade)));

    }
    static void imprimirTexto(String texto) {
        System.out.print(texto);
    }
    static void limpaTela() {
        for(int i = 0; i < 50; i++) {
            imprimirTexto("\n");
        }
    }
}
