package GerenciadoHashSets.SistemaEscola;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main(String[] args) {

        Aluno alice = new Aluno("Alice Resende", "EW2M");
        Aluno tayna = new Aluno("Tayna Martins", "Farmacia");
        Aluno lena = new Aluno("Lena Alves", "CC");

        Map<String, Aluno> listaAluno = new HashMap<>();

        //Adicionando a chave(matricula) e vinculando a um aluno
        listaAluno.put("202602", alice);
        listaAluno.put("202603", tayna);
        listaAluno.put("202604", lena);


        //Chave -> String matricula, Value -> As informações/Atributos dentro da classe Aluno
        for (String alunos : listaAluno.keySet()){
            System.out.println(alunos + " - " + listaAluno.get(alunos));
        }
    }
}
