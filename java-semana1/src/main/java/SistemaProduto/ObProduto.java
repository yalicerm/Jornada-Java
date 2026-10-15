package SistemaProduto;

public class ObProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto("Peito de Frango", 24.58, 20);
        produto1.vender(10);
        produto1.repor(30);
        produto1.informacoes();

        Produto produto2 = new Produto("Batata frita", 14.30, 15);
        produto2.vender(5);
        produto2.repor(32);
        produto2.informacoes();

    }
}
