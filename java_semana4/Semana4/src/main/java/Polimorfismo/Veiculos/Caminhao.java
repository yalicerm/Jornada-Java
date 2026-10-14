package Polimorfismo.Veiculos;

public class Caminhao extends Veiculo{
    protected double valorCA;
    public Caminhao(String marca, String modelo, int ano, double valorca) {
        super(marca, modelo, ano);
        this.valorCA = valorca;
    }

    @Override
    public void info() {
        super.info();
    }

    @Override
    public void calcularImposto() {
        double imposto = this.valorCA * 0.08;
        System.out.println("Imposto atual do Caminhão: " + (this.getValorCA() + imposto));
        System.out.println("==========================================");

    }

    public double getValorCA() {
        return valorCA;
    }
}
