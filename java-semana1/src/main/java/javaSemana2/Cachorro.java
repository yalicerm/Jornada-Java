package javaSemana2;

public class Cachorro implements Animal {

    @Override
    public void latir() {
        System.out.println("AU AU AU");
    }

    @Override
    public void correr() {
        System.out.println("Cachorro correndo...");
    }

    @Override
    public void comer() {
        System.out.println("O cachorro está dormindo...");
    }

    @Override
    public void dormir() {
        System.out.println("O cachorro agora está descando...");
    }
}
