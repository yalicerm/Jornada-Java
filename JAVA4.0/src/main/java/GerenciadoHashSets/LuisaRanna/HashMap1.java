package GerenciadoHashSets.LuisaRanna;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
    static void main(String[] args) {

        Map<String, Double> listaCompra = new HashMap<>();

        listaCompra.put("Arroz", 2.0);
        listaCompra.put("Feijão", 3.50);
        listaCompra.put("Macarao", 2.0);

        //listaCompra.put("Arroz", 5.0);

        for (String p : listaCompra.keySet()){
            System.out.println(p + " - " + listaCompra.get(p));
        }


        if (listaCompra.containsKey("Arroz")){
            System.out.println("Sim");
        } else {
            System.out.println("Nao");
        }

        if (listaCompra.containsValue(9.0)){
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
