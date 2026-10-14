package GerenciadoHashSets.Estoque;

import java.util.HashSet;
import java.util.Set;

public class Estoques {
    private Set<Produto> estoque;

    public Estoques() {
        this.estoque = new HashSet<>();
    }

    public void adicionarProduto(Produto m){
        if (estoque.contains(m)){
            System.out.println("Item já cadastrado no sistema");
        } else {
            estoque.add(m);
            System.out.println("Item " + m.getNomeProduto() + " adicionado com sucesso!");
        }
    }

    public void removerProduto(Produto m){
        if (estoque.contains(m)){
            estoque.remove(m);
            System.out.println("Item " + m.getNomeProduto() + " removido do sistema");
        } else {
            System.out.println("Item " + m.getNomeProduto() + " não encontrado");
        }
    }


    public void exibirLista(){
        for (Produto produtos : estoque){
            System.out.println(produtos);
        }
    }
}
