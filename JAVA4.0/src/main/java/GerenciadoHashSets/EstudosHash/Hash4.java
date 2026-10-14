package GerenciadoHashSets.EstudosHash;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hash4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> emailsCadastrados = new HashSet<>();


        for (int i = 0 ; i < 5; i++){
            System.out.println("Digite o email " + (i + 1)  + " :");
            String email = scanner.nextLine();
            if (emailsCadastrados.contains(email)){
                System.out.println("Email já cadastrado!");
            } else {
                emailsCadastrados.add(email);
                System.out.println("Email cadastrado com sucesso!");
            }
        }

        System.out.println(" === EMAIL CADASTRADOS ===");
        for (String e : emailsCadastrados){
            System.out.println(e);
        }

        System.out.println("Total de email únicos: " + emailsCadastrados.size());

    }
}
