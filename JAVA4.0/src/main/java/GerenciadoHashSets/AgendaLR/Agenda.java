package GerenciadoHashSets.AgendaLR;

import java.util.HashMap;
import java.util.Map;

public class Agenda {
    private Map<String, Contato> agenda = new HashMap<>();

    public void adicionarContato(String nome, Contato c){
        if (agenda.containsKey(nome)){
            System.out.println("Contato já existe");
        } else {
            agenda.put(nome, c);
            System.out.println("Contato da adcionado!");
        }
    }

    public void removerContato(String nome, Contato c){
        if (!agenda.containsKey(nome)){
            System.out.println("Não foi possível encontrar esse contato");
        } else {
            agenda.remove(nome, c);
            System.out.println("Contato removido!");
        }
    }

    public void atualizarContato(String nome, Contato c){
        agenda.put(nome, c);
    }

    public void buscarContato(String nome){
        if (agenda.containsKey(nome)){
            System.out.println(nome + " - " + agenda.get(nome).getTelefone());
        } else {
            System.out.println("Não foi possível encontrar esse contato");
        }
    }

    public void listarAgenda(){
        System.out.println(" ===== AGENDA TELEFÔNICA ===");
        for (String n : agenda.keySet()){
            System.out.println(agenda.get(n));
        }
        System.out.println();
        System.out.println("Quantidade total de contatos: " + agenda.size());
    }


}
