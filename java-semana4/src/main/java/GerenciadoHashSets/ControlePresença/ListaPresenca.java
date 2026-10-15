package GerenciadoHashSets.ControlePresença;

import java.util.HashSet;
import java.util.Set;

public class ListaPresenca {
    private Set<Integer> listaPre = new HashSet<>();

    public void registrarPresenca(Aluno aluno){
        if (listaPre.contains(aluno.getMatricula())){
            System.out.println("Aluno " + aluno.getNome() + " já está registrado na presença");
        } else {
            listaPre.add(aluno.getMatricula());
        }

    }

    public void removerPresenca(Aluno aluno){
        if (listaPre.contains(aluno.getMatricula())){
            listaPre.remove(aluno.getMatricula());
            System.out.println("Aluno " + aluno.getNome() + " saiu mais cedo");
        } else {
            System.out.println("Aluno " + aluno.getNome() + " não está presente");
        }
    }

    public void totalAlunos(){
        System.out.println("Total de alunos presentes: " + listaPre.size());
    }

    public void listarAlunos(){
        for (Integer matricula : listaPre){
            System.out.println(matricula);
        }
    }

    public void verificarPresenca(Aluno aluno){
        if (listaPre.contains(aluno.getMatricula())){
            System.out.println("Aluno " + aluno.getNome() + " está presente");
        } else {
            System.out.println("Aluno " + aluno.getNome() + " não está presente");
        }
    }
}
