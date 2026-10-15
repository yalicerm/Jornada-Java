package InterfacePagamento;

public class CartaCredito implements Pagavel{
    private int numeroCartao;
    private String nomeTitular;
    private int cvv;
    private double taxa;

    public CartaCredito(int cvv, String nomeTitular, int numeroCartao) {
        this.cvv = cvv;
        this.nomeTitular = nomeTitular;
        this.numeroCartao = numeroCartao;
    }

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getCvv() {
        return cvv;
    }


    @Override
    public void processorPagamento(double valor) {
        this.taxa = valor * (1 + 0.03);
        System.out.println("Valor a pagar: " + this.taxa);
    }


    @Override
    public void exibirComprovante() {
        System.out.println("=== COMPROVANTE DE PAGAMENTO ===");
        System.out.println("Método de pagamento: Cartão crédito");
        System.out.println("Nome do titular: " + this.getNomeTitular());
    }
}
