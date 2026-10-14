package Heranca;

public class Funcionario extends Pessoa{
    private String setor;
    private boolean trabalhar;

    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void mudarTrabalho(String s){
        this.setSetor(s);
        System.out.println("Setor modificado: " + getSetor());
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhar() {
        return trabalhar;
    }

    public void setTrabalhar(boolean trabalhar) {
        this.trabalhar = trabalhar;
    }
}
