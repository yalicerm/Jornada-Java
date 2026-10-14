package GerenciadoHashSets.GerenciamentoEstoque;

public class Main {
    static void main(String[] args) {
        Produto p1 = new Produto("Frango", 232343, 19.23, 10);
        Produto p2 = new Produto("Arroz", 12232323, 6.5, 2);
        Produto p3 = new Produto("Coca-Cola", 12321323, 10.20, 21);

        Estoque estoque1 = new Estoque();
        estoque1.adicionarProduto(p1);
        estoque1.adicionarProduto(p2);
        estoque1.adicionarProduto(p3);


        estoque1.adicionarQuantidade(p1, 10);
        estoque1.removerQuantidade(p3, 2);
        estoque1.adicionarQuantidade(p2, 12);
        estoque1.visualizarEstoque();
    }
}
