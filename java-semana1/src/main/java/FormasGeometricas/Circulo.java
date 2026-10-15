package FormasGeometricas;

public class Circulo implements Calculavel {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double a;
        a = Math.PI * (raio * raio);
        System.out.println("Área do circulo: " + a);

    }

    @Override
    public void calcularPerimetro() {
        double p;
        p = 2 * Math.PI * raio;
        System.out.println("Perimetro do circulo: " + p);

    }
}

