package InterfacePagamento;

public class Boleto implements Pagavel{
    private int codigoBoleto;
    private int dataVencimento;
    private double desconto;

    public Boleto(int codigoBoleto, int dataVencimento) {
        this.codigoBoleto = codigoBoleto;
        this.dataVencimento = dataVencimento;
    }

    public int getCodigoBoleto() {
        return codigoBoleto;
    }

    public int getDataVencimento() {
        return dataVencimento;
    }

    @Override
    public void exibirComprovante() {
        System.out.println("=== COMPROVANTE DE PAGAMENTO ===");
        System.out.println("Método de pagamento: Boleto");
        System.out.println("Data de vencimento" + this.getDataVencimento());
        System.out.println();
    }


    @Override
    public void processorPagamento(double valor) {

    }
}
