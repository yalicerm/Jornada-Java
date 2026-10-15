package Polimorfismo.Veiculos;

public class Veiculo {
    protected String marca, modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    //Deveria ter usando do tipo return
    public void calcularImposto(){

    }

    public void info(){
        System.out.println("==========================================");
        System.out.println("Nome do veículo: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano do veículo: " + this.ano);
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }
}
