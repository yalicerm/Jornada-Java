package GerenciadoHashSets.NotasAlunos;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {

        Aluno a1 = new Aluno("Alice");
        Aluno a2 = new Aluno("Tayna");
        Aluno a3 = new Aluno("Claire");
        Aluno a4 = new Aluno("Luisa");
        Aluno a5 = new Aluno("Nicole");

        ListaNotas l1 = new ListaNotas();
        l1.cadastrarOuAtualizaNota(a1, 8.7);
        l1.cadastrarOuAtualizaNota(a2, 8.9);
        l1.cadastrarOuAtualizaNota(a3, 5.6);
        l1.cadastrarOuAtualizaNota(a4, 5.9);

        //l1.removerAluno(a3);
        // Atualizando nota  -> l1.cadastrarOuAtualizaNota(a1, 8.2);

        l1.listarAlunos();

        l1.alunosAprovados();

        l1.mediaTurma();



    }
}
