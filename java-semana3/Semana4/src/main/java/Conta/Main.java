package Conta;

public class Main {
     public static void main(String[] args) {
         Conta c1 = new Conta(2025294, "Alice");

         c1.depositar(100);
         //c1.depositar(600);
         c1.status();

    }
}
