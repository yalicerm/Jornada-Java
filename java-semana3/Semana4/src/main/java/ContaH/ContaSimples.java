package ContaH;

public class ContaSimples extends Conta{
    private boolean diaRendimento = false;


    public ContaSimples(String nome, int numero) {
        super(nome, numero);
    }

    public void diaRend(){
        this.diaRendimento = true;
    }

    public void calcularNovoSaldo(double taxa){
        if (this.diaRendimento){
            this.setSaldo(getSaldo() + taxa);
            System.out.println("Saldo atualizado para: " + this.getSaldo() + " R$ reais.");
        } else {
            System.out.println("Ainda não é dia de rendimento");
        }
    }

    public boolean isDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(boolean diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
