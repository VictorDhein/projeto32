package Domain;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.00);
        ProdutoService.salvarProduto(produto);

        Produto produtoBuscado = ProdutoService.buscarProduto(produto.getId());
        System.out.println("Produto encontrado: " + produtoBuscado);

        ProdutoService.fechar();
    }
}
