package GerenciadoHashSets.EstudosHash;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hash5 {
    static void main(String[] args) {
        Integer [ ] num = {5, 2, 8, 2, 9, 5, 3, 8, 1, 5};

        Set<Integer> numeros = new HashSet<>(List.of(num));
        System.out.println(numeros);
    }


}
