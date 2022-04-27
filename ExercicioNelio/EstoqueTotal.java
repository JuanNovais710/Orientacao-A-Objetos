package orientacao.objetos.produto.ExercicioNelio;

import java.util.Scanner;

public class EstoqueTotal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "TV Smart Samsung";
        produto.preco = 1200.0;

        Scanner scanner = new Scanner(System.in);
        produto.quantidadeEstoque = lerQuantidadeEmEstoque(scanner, produto);
        Double precoDoEstoque = valorTotalEstoque(produto);
        imprimirTexto("Controle de estoque\n(1): Realizaram vendas\t(2): Chegaram novos produtos\n");
        byte controleEstoque = scanner.nextByte();
        boolean realizaramVendas = controleEstoque == 1;
        if(!realizaramVendas) {
            imprimirTexto("Existem " + produto.quantidadeEstoque + " " + produto.nome + " em estoque atualmente, mais quantas chegarão? ");
            int novosProdutosNoEstoque = scanner.nextInt();
            int totalProdutos = novosProdutosNoEstoque + produto.quantidadeEstoque;
            produto.precoVariosProdutos = totalProdutos * produto.preco;
            imprimirTexto("Foram adicionadas " + novosProdutosNoEstoque + " " + produto.nome + " ao antigo estoque de " + produto.quantidadeEstoque + " totalizando: " + totalProdutos + ". E um valor de R$: " + produto.precoVariosProdutos);
        }else if(realizaramVendas){
            imprimirTexto("Existiam " + produto.quantidadeEstoque + " " + produto.nome + " em estoque atualmente, quantas foram vendidas? ");
            int produtosVendidos = scanner.nextInt();
            int totalProdutos = produto.quantidadeEstoque - produtosVendidos;
            produto.precoVariosProdutos = totalProdutos * produto.preco;
            imprimirTexto("Foram vendidas " + produtosVendidos + " " + produto.nome + " do antigo estoque de " + produto.quantidadeEstoque + ". Agora temos em estoque: " + totalProdutos + ". Totalizando R$: " + produto.precoVariosProdutos);
        }


    }
    static Integer lerQuantidadeEmEstoque(Scanner scanner, Produto produto) {
        imprimirTexto("Quantas " + produto.nome + " existem em estoque agora? ");
        return scanner.nextInt();
    }
    static Double valorTotalEstoque(Produto produto) {
        return produto.preco * produto.quantidadeEstoque;
    }
    static void imprimirTexto(String texto) {
        System.out.print(texto);
    }
    static void posicaoInvalida(){
        System.err.println("Então não chegarão novos produtos ao estoque.");
        System.exit(1);
    }


}
