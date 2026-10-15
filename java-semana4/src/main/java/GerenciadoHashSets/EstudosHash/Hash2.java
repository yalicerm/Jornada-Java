package GerenciadoHashSets.EstudosHash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Hash2 {
    static void main(String[] args) {

        List<String> nomesBaguncado = new ArrayList<>();
        nomesBaguncado.add("Alice");
        nomesBaguncado.add("Alice");
        nomesBaguncado.add("Claire");
        nomesBaguncado.add("Pedro");
        nomesBaguncado.add("Tayna");
        nomesBaguncado.add("Claire");

        Set<String> listaNome = new HashSet<>(nomesBaguncado); //O Set filtrou a lista que possuia duplicatas
        for (String nomes : listaNome){
            System.out.println(nomes);
        }



        Set<String> meusHobbies = new HashSet<>();
        Set<String> seusHobbies = new HashSet<>();


        meusHobbies.add("ler");
        meusHobbies.add("jogar");
        meusHobbies.add("ver filmes");
        seusHobbies.add("Correr");
        seusHobbies.add("jogar");

        System.out.println(meusHobbies);
        System.out.println(seusHobbies);

        meusHobbies.retainAll(seusHobbies); //Filtrei apenas itens que possuia nos dois em comum. Quando eu der print novamente nos meus hobbies, vai aprecer apenas os items em comum
        System.out.println(meusHobbies);

    }
}
