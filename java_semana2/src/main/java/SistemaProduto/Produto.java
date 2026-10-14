package SistemaProduto;

public class Produto {
    private String nome;
    private double preco;
    private int quantEstoque;

    public Produto(String nome, double preco, int quantEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantEstoque = quantEstoque;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantEstoque() {
        return quantEstoque;
    }

    public void setQuantEstoque(int quantEstoque) {
        this.quantEstoque = quantEstoque;
    }

    public void vender(int p){
        if (this.getQuantEstoque() == 0){
            System.out.println("Não foi possível vender. Estoque vazio!");
        } else if (this.getQuantEstoque() < p){
            System.out.println("Não foi possível vender essa quantidade");
        } else{
            this.setQuantEstoque(getQuantEstoque() - p);
        }
    }

    public void repor(int r){
        this.setQuantEstoque(getQuantEstoque() + r);
    }

    public void informacoes(){
        System.out.println(" ==== SISTEMA DE VENDAS ====");
        System.out.println("Nome do produto: " + this.getNome());
        System.out.println("Preço do produto " + this.getPreco() + " R$");
        System.out.println("Quantidade atual no estoque: " + this.getQuantEstoque());
    }
}
