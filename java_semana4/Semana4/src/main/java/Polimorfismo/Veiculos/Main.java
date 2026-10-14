package Polimorfismo.Veiculos;

public class Main {
    static void main(String[] args) {
        Veiculo [] veiculos = new Veiculo[3];

        veiculos[0] = new Carro("Audi", "Modelo 12", 2005, 400);
        veiculos[1] = new Moto("Susuki", "342-21PM", 2014, 250);
        veiculos[2] = new Caminhao("Mercedez", "A-432", 2023, 600);

        double totalImposto = 0;
        for (Veiculo veiculo : veiculos){
            veiculo.info();
            veiculo.calcularImposto();
            // totalImposto += veiculo.calcularImposto(); -> Deu errado pois calcularImposto é do tipo void, eu deveria ter feito como return.
            System.out.println();
        }

    }
}
