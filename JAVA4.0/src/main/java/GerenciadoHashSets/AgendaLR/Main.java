package GerenciadoHashSets.AgendaLR;

public class Main {
    static void main(String[] args) {
        Contato c1 = new Contato("Luisa", "12345");
        Contato c2 = new Contato("Ranna", "984594");

        Agenda agenda = new Agenda();

        agenda.adicionarContato("luisa da uvv", c1);
        agenda.adicionarContato("Ranna linda", c2);

        agenda.listarAgenda();
    }

}
