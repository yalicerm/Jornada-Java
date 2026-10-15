package Heranca;

public class Aluno extends Pessoa{
    private int matricula;
    private String curso;
    private double mensalidade;
    private boolean cancelar;

    public Aluno(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.mensalidade = 1300.00;
        this.cancelar = false;
    }

    public void cancelaMatr(){
        System.out.println("Matricula será cancelada");
        this.cancelar = true;
    }

    public void pagarMensalidade(double men){
        if (this.cancelar){
            System.out.println("Sua matrícula já foi cancelada");
        } else {
            if (men != getMensalidade()){
                System.out.println("Valor incorreto. Pague o valor exato da mensalidade");
            } else {
                System.out.println("Mensalidade paga com sucesso!");
            }
        }
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public boolean isCancelar() {
        return cancelar;
    }

    public void setCancelar(boolean cancelar) {
        this.cancelar = cancelar;
    }
}
