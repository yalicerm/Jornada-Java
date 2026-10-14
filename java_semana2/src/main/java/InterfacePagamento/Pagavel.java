package InterfacePagamento;

public interface Pagavel {
    public void processorPagamento(double valor);
    public abstract void exibirComprovante();
}
