package GerenciadoHashSets.LuisaRanna;

import java.util.ArrayList;
import java.util.List;

public class Lis1 {
    static void main(String[] args) {

        List<String> nomes = new ArrayList<>();

        nomes.add("Luisa");
        nomes.add("Alice");
        nomes.add("Ranna");
        nomes.add("Alice");

        nomes.remove("Alice");

        if (nomes.contains("Luisa")){
            System.out.println("Ola Luisa");
        } else {
            System.out.println("Não tem nenhum Luisa aqui");
        }

        for (String n : nomes){
            System.out.println(n);
        }

    }
}
