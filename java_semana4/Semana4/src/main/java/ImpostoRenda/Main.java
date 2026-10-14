package ImpostoRenda;

public class Main {
    static void main(String[] args) {
        PessoaFisica pF1 = new PessoaFisica("Alice", "1234455667");
        PessoaFisica pF2 = new PessoaFisica("João", "1234355");

        PessoaJuridica pJ1 = new PessoaJuridica("Carla", "3434545445");
        PessoaJuridica pJ2 = new PessoaJuridica("Pedro", "10291212");

        pJ1.pagarImposto(3000);
    }
}
