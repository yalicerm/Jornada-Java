package Polimorfismo.Veiculos;

public class Moto extends Veiculo{
    protected double valorM;
    public Moto(String marca, String modelo, int ano, double valorm) {
        super(marca, modelo, ano);
        this.valorM = valorm;
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void calcularImposto() {
        double imposto = this.valorM * 0.03;
        System.out.println("Imposto atual da moto:  " + (this.getValorM() + imposto));
        System.out.println("==========================================");


    }

    public double getValorM() {
        return valorM;
    }
}
