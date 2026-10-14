package GerenciadoHashSets.GerenciamentoEstoque;

import java.util.ArrayList;
import java.util.List;

/*
Metodos -> Adicionar Produto, Remover Produto, Visualizar quantos item o estoque possui, Visualizar a quantidade de cada produto,
avisar quando item estiver chegando no limite = 5 unidades.
 */

public class Estoque {
    private List<Produto> estoque;
    private int limite;

    public Estoque(){
        this.limite = 5;
        this.estoque = new ArrayList<>();
    }

    public void adicionarProduto(Produto p){
        if (estoque.contains(p)){
            System.out.println("Produto já está cadastrado no estoque!");
        } else {
            estoque.add(p);
            System.out.println("Produto " + p.getNome() + " foi adicionado ao estoque");
        }
    }

    public void removerProduto(Produto p){
        if (estoque.contains(p)){
            estoque.remove(p);
            System.out.println("Produto " + p.getNome() + " foi removido do estoque");
        } else {
            System.out.println("Produo não encontrado!");
        }
    }

    public void adicionarQuantidade(Produto p, int q){
        if (estoque.contains(p)){
            p.setQuantidadeProduto(p.getQuantidadeProduto() + q);
        } else{
            System.out.println("Produto não encontrado");
        }
    }

    public void removerQuantidade(Produto p, int q){
        if (estoque.contains(p)){
            p.setQuantidadeProduto(p.getQuantidadeProduto() - q);
        } else{
            System.out.println("Produto não encontrado");
        }
    }

    public void visualizarEstoque(){
        System.out.println(" ======= ESTOQUE =======");
        for (Produto produtos : estoque){
            System.out.println(produtos.getNome() + " - " + produtos.getQuantidadeProduto() + " unidades");
        }
    }

    public void produtoLimite(){
        for ( Produto p : estoque){
            if (p.getQuantidadeProduto() <= limite){
                System.out.println("Produto " + p.getNome() + " está quase esgotado");
            }
        }

    }
}
