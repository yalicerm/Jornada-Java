package GerenciadoHashSets.Estoque;

import java.util.Random;

public class Produto {
    private String nomeProduto;
    private int idProduto;
    private double preco;

    public Produto(String nomeProduto, double preco) {
        this.nomeProduto = nomeProduto;
        this.preco = preco;
        this.idProduto = atribuirId();
    }

    public int atribuirId(){
        Random random = new Random();
        int gerarId = random.nextInt(00000, 99999);
        return  gerarId;
    }

    //Sobrescrever Equals para comprar objetos de mesmo ID
    @Override
    public boolean equals(Object o) {
        //Verificar se o objeto existe
        if (this == o) return true;

        //Verificar se é nulo ou pertence a outra classe
        if (o == null || getClass() != o.getClass()) return false;

        //Converter para Produto e comparar com a regra de negócio ID
        Produto p = (Produto) o;
        return idProduto == p.idProduto;
    }

    /*

    Insert code
    @Override metodo equals()
    -> Esse metodo está comparando se o id de dois produtos da mesma classe são iguais


    Insert code
    @Overirde toString
    -> Metodo vai printar o nome do produto e o preço dele


     */

    //Quando eu chamar meu metodo exibirEstoque na main e printar Produto ele vai me mostrar o return desse overide
    @Override
    public String toString() {
        return "Produto [Nome = "+ nomeProduto + " - Preço = " + preco + "]";
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }


}
