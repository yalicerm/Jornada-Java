package GerenciadoHashSets.ControlePresença;

public class Main {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Alice");
        Aluno aluno2 = new Aluno("Tayna");
        Aluno aluno3 = new Aluno("João");
        Aluno aluno4 = new Aluno("Pedro");
        Aluno aluno5 = new Aluno("Claire");

        ListaPresenca l1 = new ListaPresenca();

        l1.registrarPresenca(aluno1);
        l1.registrarPresenca(aluno2);
        l1.registrarPresenca(aluno3);

        l1.listarAlunos();
        l1.totalAlunos();

    }
}
