package GerenciadoHashSets.NotasAlunos;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String nome;

    public Aluno(String nome) {
        this.nome = nome;

    }

    @Override
    public String toString() {
        return "Nome: " + nome;
    }

    public String getNome() {
        return nome;
    }


}
