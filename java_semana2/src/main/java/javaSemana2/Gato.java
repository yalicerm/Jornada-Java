package javaSemana2;

public class Gato implements Animal{
    @Override
    public void latir() {
        System.out.println("MIAU");

    }

    @Override
    public void correr() {
        System.out.println("Gatinho está correndo...");

    }

    @Override
    public void comer() {
        System.out.println("Gatinho está comendo...");

    }

    @Override
    public void dormir() {
        System.out.println("Gatinho está agora dormindo....");

    }
}
