package ImpostoRenda;

public abstract class Contribuinte {
    protected String nome;
    protected String cpf;

    public Contribuinte(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public abstract void pagarImposto(double renda);


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
