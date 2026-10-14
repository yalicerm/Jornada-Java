package FormasGeometricas;

public class Main {
    static void main(String[] args) {
        Calculavel retangulo = new Retangulo(5,3);
        Calculavel circulo = new Circulo(4.3);

        retangulo.calcularArea();
        retangulo.calcularPerimetro();

        circulo.calcularArea();
        circulo.calcularPerimetro();
    }



}
