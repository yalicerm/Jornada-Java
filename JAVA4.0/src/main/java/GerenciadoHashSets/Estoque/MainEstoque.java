package GerenciadoHashSets.Estoque;

public class MainEstoque {
    static void main(String[] args) {
        Produto p1 = new Produto("Arroz branco", 7.23);
        Produto p2 = new Produto("Feijão Vermelho", 5.43);

        Estoques estoque = new Estoques();

        estoque.adicionarProduto(p1);
        estoque.adicionarProduto(p2);

        estoque.exibirLista();


    }
}
