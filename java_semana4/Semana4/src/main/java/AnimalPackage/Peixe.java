package AnimalPackage;

public class Peixe extends Animal{

    public Peixe(String nome, double comprimento, int patas, String cor, String ambiente, double velocidade) {
        super(nome, comprimento, patas, cor, ambiente, velocidade);
    }

    @Override
    public String toString() {
        return "Peixe{}";
    }

    @Override
    public void fazerBarulho() {
        System.out.println("O(a) " + this.nome + " está fazendo barulho...");
    }

    @Override
    public void comer() {
        System.out.println("O(a) " + this.nome + " está comendo...");
    }
}
