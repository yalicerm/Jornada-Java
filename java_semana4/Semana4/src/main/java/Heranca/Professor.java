package Heranca;

public class Professor extends Pessoa{
    private String especialidade;
    private double salario;

    public Professor(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
    }

    public void receberAumen(int valor){
        this.setSalario(getSalario() + valor);
        System.out.println("Salário modificado: " + this.getSalario());
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
