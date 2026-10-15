package ImpostoRenda;

public class PessoaJuridica extends Contribuinte{

    public PessoaJuridica(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void pagarImposto(double renda) {
        double imposto = renda * 0.10;
        System.out.println("Valor do imposto a pagar: " + (renda - imposto));

    }


}
