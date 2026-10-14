package GerenciadoHashSets.AgendaTelefonica;

public class Main {
    static void main(String[] args) {
        Contato cont1 = new Contato("Alice");
        Contato cont2 = new Contato("Tayna");
        Contato cont3 = new Contato("Mable");
        Contato cont4 = new Contato("Nicole");

        ListaTelefonica agenda = new ListaTelefonica();

        agenda.inserirContato("(27)998563434", cont1);
        agenda.inserirContato("(27)983472957", cont2);
        agenda.inserirContato("(21) 93750163482", cont3);

        agenda.buscarNumero("(27)983472957");
        agenda.tamanhoAgenda();

        agenda.listarAgenda();
    }
}
