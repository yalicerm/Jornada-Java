package ImpostoRenda;

public class PessoaFisica extends Contribuinte{


    public PessoaFisica(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public void pagarImposto(double renda) {
        double imposto;
        if (renda >= 0 && renda <= 1400){
            System.out.println("Nenhuma parcela a pagar");
        } else if( renda >= 1400.01 && renda <= 2800){
            imposto = (renda * 0.1) - 100;
            System.out.println("Imposto a pagar: " + imposto);
        } else if ( renda >= 2100.01 && renda <= 3600){
            imposto = (renda * 0.15) - 270;
            System.out.println("Imposto a pagar" + imposto);
        } else if (renda >= 2800.01 && renda <= 3600) {
            imposto = (renda * 0.25) - 500;
            System.out.println("Imposto a pagar: " + imposto);
        } else {
            imposto = (renda * 0.30) - 700;
            System.out.println("Imposto a pagar: " + imposto);
        }
    }
}
