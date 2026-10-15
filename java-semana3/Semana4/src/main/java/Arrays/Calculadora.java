package Arrays;

public class Calculadora {
    private int num;

    public void SomaArray(int [] numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }

        System.out.println("Resultado da soma: " + soma);
    }

    public void SomaVarargs(int...numeros){
        int soma = 0;
        for (int num : numeros){
            soma += num;
        }

        System.out.println("Resultado da soma de var: " + soma);

    }

}
