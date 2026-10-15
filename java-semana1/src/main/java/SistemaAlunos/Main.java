package SistemaAlunos;

import java.util.ArrayList;

public class Main {
    static void main(String[] args) {
        Aluno aluno1 = new Aluno("Alice", 2025293, 6.5, 7.8, 9.5);
        Aluno aluno2 = new Aluno("Tayna", 2025294, 7.8, 6.8, 5.4);
        Aluno aluno3 = new Aluno("João", 2025295, 9.5, 5.8, 6.5);
        Aluno aluno4 = new Aluno("Pedro", 2025296, 5.5, 4.8, 6.5);
        Aluno aluno5 = new Aluno("Carla", 2025297, 3.5, 9.8, 7.5);


        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        listaAlunos.add(aluno1);
        listaAlunos.add(aluno2);
        listaAlunos.add(aluno3);
        listaAlunos.add(aluno4);
        listaAlunos.add(aluno5);



        //Calcular a média geral da turma (Nesse caso, tive que excluir o void do método;
        //Pois agora estou chamado ela diretamente aqui no objeto e ela tem que me retornar num valor pra saber chamada aqui;
        double somaMedia = 0;
        for (Aluno aluno : listaAlunos){
            somaMedia += aluno.calcularMedia();
        }

        //Media geral
        double mediaGeral = somaMedia / listaAlunos.size();

        //Exibir quantos foram aprovados e quantos foram reprovado
        int aprovado = 0;
        int reprovado = 0;

        for (Aluno aluno : listaAlunos){
            if (aluno.calcularMedia() >= 7){
                aprovado++;
            } else{
                reprovado++;
            }
        }

        //Exibir boletim dos 5 alunos
        for ( Aluno aluno : listaAlunos){
            aluno.exbirBoletim();
        }

        //Exibindo o boletim completo agora
        System.out.println("===== SITUAÇÕES FINAIS DOS ALUNOS ====");
        System.out.println("Média geral da turma: " + mediaGeral);
        System.out.println("Alunos aprovados: " + aprovado);
        System.out.println("Alunos reprovados: " + reprovado);
        System.out.println("======================================");
    }
}
