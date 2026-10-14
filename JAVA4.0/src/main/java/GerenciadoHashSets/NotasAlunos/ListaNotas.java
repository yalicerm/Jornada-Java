package GerenciadoHashSets.NotasAlunos;

import java.util.HashMap;
import java.util.Map;

public class ListaNotas {
    private Map<Aluno, Double> notasAlunos = new HashMap<>();

    //Cadastra e atualiza nota caso já existir um Aluno cadastrado
    public void cadastrarOuAtualizaNota(Aluno a, Double nota){
        if (notasAlunos.containsKey(a)){
            notasAlunos.put(a, nota);
            System.out.println("Nota do aluno atulizada");
        } else {
            notasAlunos.put(a, nota);
            System.out.println("Nota adicionada com sucesso!");
        }
    }

    public void consultarNota(Aluno aluno){
        if (notasAlunos.containsKey(aluno)){
            Double notaAluno = notasAlunos.get(aluno);
            System.out.println("Nota do(a) aluno(a) " + aluno.getNome() + " : " + notaAluno);
        } else {
            System.out.println("Aluno não encontrado");
        }
    }

    public void removerAluno(Aluno aluno){
        if (notasAlunos.containsKey(aluno)){
            notasAlunos.remove(aluno);
            System.out.println("Aluno(a) " + aluno.getNome() + " removido");
        }
    }

    public void listarAlunos(){
        System.out.println(" ==== LISTA DE ALUNOS ====");
        for (Aluno alunos : notasAlunos.keySet()){
            System.out.println(alunos + " -> Nota: " + notasAlunos.get(alunos));
        }
    }

    public void mediaTurma(){
        if (notasAlunos.isEmpty()){ //Caso nao tenha nenhum aluno cadastrados, podemos criar uma msg de erro.
            System.out.println("Notas estão zeradas");
        } else {
            Double notas = 0.0;
            Double media = 0.0;
            for (Double nota : notasAlunos.values()){
                notas += nota;
            }
            media = notas/notasAlunos.size();
            System.out.println("Media da turma foi de: " + media); //pode realizar a media direto no sout
        }
    }

    public void alunosAprovados(){
        for (Aluno alunos : notasAlunos.keySet()){
            if (notasAlunos.get(alunos) > 6.0){
                System.out.println(alunos + " = APROVADO");
            }
        }
    }


}
