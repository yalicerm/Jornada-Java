package exemplosJava;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float media = 0;
        float resultado = 0;
        for (int i = 0 ; i < 4; i++){
            System.out.println("Digite a " + (i + 1) + "° nota: ");
            float nota = scan.nextFloat();
            media += nota;
        }
        scan.close();
        resultado = media / 4;
        System.out.println("Média das notas finais: " + resultado);

    }
}
