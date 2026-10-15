package GerenciadoHashSets.EstudosHash;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Hash6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean status = true;
        while (status){
            System.out.println("Digite uma palavra [Digite -999 para sair]: ");
            String frase = scanner.nextLine().toLowerCase();
            if (frase.equals("-999")){
                System.out.println("Saindo do programa...");
                break;
            } else {
                String[] quantPalavras = frase.split(" ");
                Set<String> palavrasUnicas = new HashSet<>(List.of(quantPalavras));
                System.out.println("Quantidade de palavras: " + quantPalavras.length);
                System.out.println("Palavras únicas: " + palavrasUnicas.size());
                System.out.println(palavrasUnicas);
                System.out.println("================================================");
            }
        }
    }
}
