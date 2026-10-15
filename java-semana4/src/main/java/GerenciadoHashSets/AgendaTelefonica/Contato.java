package GerenciadoHashSets.AgendaTelefonica;

public class Contato {
    private String nome;

    public Contato(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Nome Contato: " + this.nome;
    }

}
