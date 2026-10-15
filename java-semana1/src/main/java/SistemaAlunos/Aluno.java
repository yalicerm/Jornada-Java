package SistemaAlunos;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota1;
    private double nota2;
    private double nota3;
    private double media;

    public Aluno(String nome, int matricula, double nota1, double nota2, double nota3) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.media = 0;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }


    public double getNota1() {
        return nota1;
    }


    public double getNota2() {
        return nota2;
    }


    public double getNota3() {
        return nota3;
    }

    public double getMedia() {
        return media;
    }


    public double calcularMedia(){
        return this.media = (this.getNota1() + this.getNota2() + this.getNota3())/3;
    }

    public String verificarSitucao(){
        if (this.getMedia() >= 7){
            return "Aluno aprovado";
        } else{
            return "Aluno reprovado";
        }
    }

    public void exbirBoletim(){
        System.out.println(" === BOLETIM DO ALUNO ===");
        System.out.println("Nome do Aluno: " + this.getNome());
        System.out.println("Matrícula do aluno: " + this.getMatricula());
        System.out.printf("Média do aluno %.2f " , this.getMedia());
        System.out.println("Situação atual: " + verificarSitucao());

    }
}
