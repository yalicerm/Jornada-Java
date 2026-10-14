package Polimorfismo.Veiculos;

public class Carro extends Veiculo{
    protected double valorC;

    public Carro(String marca, String modelo, int ano, double valor) {
        super(marca, modelo, ano);
        this.valorC = valor;
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void calcularImposto() {
        double imposto = this.valorC * 0.05;
        System.out.println("Imposto atual do carro: " + (this.getValorC() + imposto));
        System.out.println("==========================================");
    }

    public double getValorC() {
        return valorC;
    }
}
