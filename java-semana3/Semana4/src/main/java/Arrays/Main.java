package Arrays;

public class Main {
    static void main(String[] args) {
        Calculadora con1 = new Calculadora();

        //Usando array como parametro
        int [] numero = {1,2,3,4,5};
        con1.SomaArray(numero);

        //Usando Varargs como parametro
        con1.SomaVarargs(1,2,3,4,5,6);
    }
}
