
package Agenda;

import java.util.ArrayList;
import java.util.Arrays;


public class Agenda {
   private ArrayList<Contato> contatos;

   //Constructor que faz com que o contatos vire um array elástico
    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(Contato c){
        contatos.add(c);
        System.out.println("Contato" + c.getNome() + " adiconado com sucesso!");
   }

   public void removerContato(String nome){
        boolean encontrou = false;
        for ( int i = 0 ; i < contatos.size() ; i++){
            if (contatos.get(i).getNome().equalsIgnoreCase(nome)){ //Comenta no notion
                contatos.remove(i);
                System.out.println("Contato " + nome + "removido com sucesso!");
                encontrou = true;
                break;
            }

            if (!encontrou){
                System.out.println("Contato " + nome + " não encontrado!");
            }
        }
   }

   //Sem void, essa vai retornar valor

   public Contato buscarContato(String nome){
        for (Contato contato : contatos){
            if (contato.getNome().equalsIgnoreCase(nome)){
                return contato;
            }
        }
        return null;
   }

   public void listar(){

   }

   public void listarCategoria(String categoria){

   }

   public String quantidadeContato(){
       int quant = contatos.size();
       return "Total de contatos que você possui: " + quant + " contatos.";

   }

    public ArrayList<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(ArrayList<Contato> contatos) {
        this.contatos = contatos;
    }
}
