package orientacao.objetos.produto.ExercicioNelio;

public class Produto {
    String nome;
    Double preco;
    Integer quantidadeEstoque;
    Double precoVariosProdutos;

    public Double valorTotalEstoque(Produto produto) {
        return produto.preco * produto.quantidadeEstoque;
    }
   
}
