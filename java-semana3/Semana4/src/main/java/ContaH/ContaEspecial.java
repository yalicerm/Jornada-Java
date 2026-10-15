package ContaH;

public class ContaEspecial extends Conta{
    private double limite;


    public ContaEspecial(String nome, int numero) {
        super(nome, numero);
        this.limite = 100000;
    }

    @Override
    public void sacar(double val) {
        if (val >= this.limite){
            System.out.println("Você ultrapassou o limite de saque hoje.");
        } else {
            super.sacar(val);

        }

    }

}
