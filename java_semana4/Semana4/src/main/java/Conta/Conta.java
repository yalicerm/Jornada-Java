package Conta;

public class Conta {
    private int numero;
    private String nomeTitular;
    private boolean status;
    private boolean statusEspecial;
    private double saldoAtual;
    private double limite;

    //Para ter ganhar o status especial deve ter mais de 50 mil reais na conta.

    public Conta(int numero, String nomeTitular) {
        this.numero = numero;
        this.nomeTitular = nomeTitular;
        this.status = false;
        this.statusEspecial = false;
        this.limite = 500;
        this.saldoAtual = 0;
    }

    public void sacar(double s){
        if (s > getSaldoAtual()){
            System.out.println("ERRO! Você não tem essa quantia na sua conta");
        } else{
            this.setSaldoAtual(getSaldoAtual() - s);
            System.out.println("Sacando " + s + " R$ reais...");
        }
    }

    public void depositar(double val){
        this.setSaldoAtual(getSaldoAtual() + val);
        System.out.println("Depositando " + val + " R$ reais...");
    }

    public boolean especial(){
        if (this.getSaldoAtual() >= this.limite){
            return this.statusEspecial = true;
        } else{
            return this.statusEspecial = false;
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + this.getSaldoAtual());
    }

    public void status(){
        System.out.println("Número da conta: " + this.getNumero());
        System.out.println("Nome do titular: " + this.getNomeTitular());
        if (especial()){
            System.out.println("Conta espcial: SIM!");
        } else{
            System.out.println("Conta especial: NÃO");
        }
        System.out.println("Saldo atual da conta: " + this.getSaldoAtual() + " R$ reais");
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatusEspecial() {
        return statusEspecial;
    }

    public void setStatusEspecial(boolean statusEspecial) {
        this.statusEspecial = statusEspecial;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }
}
