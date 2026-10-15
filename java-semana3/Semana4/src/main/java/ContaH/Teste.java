package ContaH;

public class Teste {
    static void main(String[] args) {
        ContaSimples contaS = new ContaSimples("João", 202529);
        ContaEspecial contaE = new ContaEspecial("Alice", 202524);

        contaS.abrirConta();
        contaS.depositar(100);
        contaS.diaRend();
        contaS.calcularNovoSaldo(500);
        contaS.status();

        contaE.abrirConta();
        contaE.depositar(150000);
        contaE.sacar(100000);
        contaE.status();


    }
}
