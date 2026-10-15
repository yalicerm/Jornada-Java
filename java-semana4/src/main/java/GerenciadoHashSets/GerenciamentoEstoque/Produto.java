package GerenciadoHashSets.GerenciamentoEstoque;

public class Produto {
    private String nome;
    private int idProduto;
    private double preçoProduto;
    private int quantidadeProduto;

    public Produto(String nome, int idProduto, double preçoProduto, int quantidadeProduto) {
        this.nome = nome;
        this.idProduto = idProduto;
        this.preçoProduto = preçoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getNome() {
        return nome;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public double getPreçoProduto() {
        return preçoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setPreçoProduto(double preçoProduto) {
        this.preçoProduto = preçoProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }
}
