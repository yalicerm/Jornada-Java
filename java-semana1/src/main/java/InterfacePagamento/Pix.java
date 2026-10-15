package InterfacePagamento;

public class Pix implements Pagavel{
    private int ChavePix;
    private String nomeTitular;

    public Pix(int chavePix, String nomeTitular) {
        ChavePix = chavePix;
        this.nomeTitular = nomeTitular;
    }

    public int getChavePix() {
        return ChavePix;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    @Override
    public void processorPagamento(double valor) {
        System.out.println("Valor a pagar: " + valor);
    }

    @Override
    public void exibirComprovante() {
        System.out.println("=== COMPROVANTE DE PAGAMENTO ===");
        System.out.println("Método de pagamento: Pix");
        System.out.println("Chave pix: " + this.getChavePix());
        System.out.println("Nome do titular: " + this.getNomeTitular());
    }
}
