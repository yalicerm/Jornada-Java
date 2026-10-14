package GerenciadoHashSets.AgendaTelefonica;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ListaTelefonica {
    Map<String, Contato> agenda = new HashMap<>();

    public void inserirContato(String numero, Contato c){
        if (agenda.containsKey(numero)){
            System.out.println("O contato já existe");
        } else{
            agenda.put(numero, c);
            System.out.println("O contato " + c.getNome() + " foi adicionado com sucesso!");
        }

    }

    public void removerContato(String telefone){
        if (agenda.containsKey(telefone)){
            agenda.remove(telefone);
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado");
        }
    }

    public void buscarNumero(String numero){
        if (agenda.containsKey(numero)){
            System.out.println("O numero " + numero + " pertence ao contato " + agenda.get(numero));
        } else {
            System.out.println("Número não encontrado");
        }
    }

    public void tamanhoAgenda(){
        System.out.println("A agenda atualmente conta com " + agenda.size() + " contatos");
    }

    public void listarAgenda(){
        System.out.println(" ===== LISTA TELEFONICA ====");
        for (String tel : agenda.keySet()){
            System.out.println("Telefone: " + tel + " | " + agenda.get(tel));
        }
    }
}
