package GerenciadoHashSets.EstudosHash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMap2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> listaTelefonica = new HashMap<>();
        boolean status = true;
        while (status){
            System.out.println("======== LISTA TELEFÔNICA =======");
            System.out.println("[1] Adicionar Contato");
            System.out.println("[2] Buscar telefone por nome");
            System.out.println("[3] Remover Contato");
            System.out.println("[4] Lista todos os contatos");
            System.out.println("[5] Sair");
            System.out.println("==================== =======");
            System.out.println();
            System.out.println("Escolha sua opção: ");
            int op = scanner.nextInt();
            //Uso do case

            if (op == 5) {
                System.out.println("Encerrando o programa....");
                scanner.close();
                System.exit(0);
            }

            if (op < 1 || op > 5) {
                System.out.println("Opção inválida. Tente novamente!");
                continue;
            }

            switch (op) {
                case 1:
                    System.out.println("Digite o nome do contato: ");
                    String nome = scanner.nextLine();
                    scanner.next();
                    System.out.println("Digite o telefone do contato: ");
                    String tel = scanner.nextLine();;
                    listaTelefonica.put(nome,tel);
                    scanner.close();
                case 2:
                    System.out.println("Qual nome deseja buscar contato: ");
                    String nom = scanner.nextLine();
                    if (listaTelefonica.containsKey(nom)){
                        System.out.println("Telefone do contato: " + listaTelefonica.get(nom));
                    } else {
                        System.out.println("ERRO! Nome não encontrado");
                    }
                case 3:
                    System.out.println("Qual contato (digite o nome) deseja remover: ");
                    String contato = scanner.nextLine();
                    if (listaTelefonica.containsKey(contato)){
                        listaTelefonica.remove(contato);
                    } else {
                        System.out.println("Contato já está excluido");
                    }

            }
        }
    }
}
