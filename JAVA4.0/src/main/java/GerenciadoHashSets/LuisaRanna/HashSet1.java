package GerenciadoHashSets.LuisaRanna;

import java.util.HashSet;
import java.util.Set;

public class HashSet1 {
    static void main(String[] args) {

        Set<String> nomes = new HashSet<>();

        nomes.add("Luisa");
        nomes.add("Luísa");
        nomes.add("Ranna");
        nomes.add("Alice");

        nomes.remove("Luisa");

        if (nomes.contains("Ranna")){
            System.out.println("Ola ranna");
        }

        for (String n : nomes){
            System.out.println(n);
        }


    }
}
