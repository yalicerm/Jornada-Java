package ContaH;

public class Conta {
    private String nomeCliente;
    private int numConta;
    private double saldo;
    private boolean status;


    public Conta(String nome, int numero) {
        this.nomeCliente = nome;
        this.numConta = numero;
        this.saldo = 0;
    }

    public void abrirConta(){
        this.status = true;
    }

    public void fecharConta(){
        this.status = false;
    }

    public void sacar(double val){
        if (this.status){
            if (val > getSaldo()){
                System.out.println("Você não tem essa quantia disponível");
            } else{
                this.setSaldo(getSaldo() - val);
                System.out.println("Sacando " + val + " R$ reais...");
            }

        } else {
            System.out.println("ERRO! Conta está fechada!");
        }
    }

    public void depositar(double v){
        if (this.status){
           this.setSaldo(getSaldo() + v);
        } else {
            System.out.println("ERRO! Conta está fechada!");
        }
    }

    public void status(){
        System.out.println("========== INFO DA CONTA ===============");
        System.out.println("Nome do cliente: " + this.getNomeCliente());
        System.out.println("Número da conta: " + this.getNumConta());
        System.out.println("Saldo atual: " + this.getSaldo() + " R$ reais");
        System.out.println("======================================");
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
