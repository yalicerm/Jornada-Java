package GerenciadoHashSets.EstudosHash;

import java.util.HashMap;

public class HashMap1 {
    static void main(String[] args) {

        HashMap<String, Integer > listaCompras = new HashMap<>();

        listaCompras.put("Laranja", 10);
        listaCompras.put("Maça", 10);
        listaCompras.put("Banana", 14);
        listaCompras.put("Morango", 8);


        for (String produtos : listaCompras.keySet()){  //Maneira de pecorrer o map pegando pelas chaves
            System.out.println(produtos + " - " + listaCompras.get(produtos) + " quantidades"); //Usando o get(key) para devolver os valores inteiros
        }

       /* for (Integer valores : listaCompras.values()){
            System.out.println(valores);
        }

        Pecorrer o Map e printar apenas os valores ( não muito recomendado )

        */
        System.out.println();

        HashMap<String, Double> lista = new HashMap<>();
        lista.put("Frango", 17.89);
        lista.put("Salmão", 78.67);
        lista.put("Camarão", 54.20);

        for (String p : lista.keySet()){
            System.out.println(p + " : R$ " + lista.get(p));
        }



    }
}

