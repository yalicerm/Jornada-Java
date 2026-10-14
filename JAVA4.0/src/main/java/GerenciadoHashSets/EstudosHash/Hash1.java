package GerenciadoHashSets.EstudosHash;


import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class Hash1 {
    static void main(String[] args) {
        Set<String> nomes = new HashSet<>();

        nomes.add("Alice");
        nomes.add("Tayna");
        nomes.add("Paula");
        nomes.add("Claire");
        nomes.add("Ranna");
        nomes.add("Nicole");
        nomes.add("Luisa");

        //Criamo um iterator
        Iterator<String> interador = nomes.iterator();

        //Usando um while/loop para pecorrer os items do nosso set
        while(interador.hasNext()){  //Enquanto houver um próximo item
            String nomeAtual = interador.next();
            System.out.println("Nome atual: " + nomeAtual);

            if (nomeAtual.equals("Paula")){
                System.out.println("Removendo o nome Paula");
                interador.remove();
            }
        }

        System.out.println("Lista final: " + nomes);
    }


}
