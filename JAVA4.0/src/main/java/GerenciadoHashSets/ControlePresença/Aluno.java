package GerenciadoHashSets.ControlePresença;

import java.util.Random;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome) {
        this.nome = nome;
        this.matricula = gerarMatricula();
    }

    public int gerarMatricula(){
        Random random = new Random();
        int idMatricula = random.nextInt(000000, 999999);
        return idMatricula;
    }

    @Override  //para comprar se uma matricula é igual a outra
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;
        return matricula == aluno.matricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getMatricula() {
        return matricula;
    }
}
