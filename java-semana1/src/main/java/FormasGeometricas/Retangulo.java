package FormasGeometricas;

public class Retangulo implements Calculavel {
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        double p;
        p = 2 * (this.getAltura() + this.getLargura());
        System.out.println("Perímetro do retangulo: " + p);
    }

    @Override
    public void calcularArea() {
        double a;
        a = this.getAltura() * this.getLargura();
        System.out.println("Área do retangulo: " + a);

    }

}
