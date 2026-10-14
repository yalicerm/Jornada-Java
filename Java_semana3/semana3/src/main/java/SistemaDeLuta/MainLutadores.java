package SistemaDeLuta;

public class MainLutadores {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4]; //Criando vetor para facilitar

        l[0] = new Lutador("Adrien", "França", 31,
                1.75, 68.9, 11, 2, 1);

        l[1] = new Lutador("Carlos", "Brasil", 29,
                           1.68, 57.8, 14, 2, 3 );

        l[2] = new Lutador("Pedro", "Brasl", 29, 1.65,
                80.5, 12, 2, 1);

        l[3] = new Lutador("João", "EUA", 32, 1.78, 90.2, 10, 4, 0);

        /*
        for (Lutador lutador : l) {
            lutador.apresentar();
        }

         */



        //Vamos testar a classe LUTA

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();

        //Conferir a quantidade de vitorias, derrotas e empates depois da luta
        l[0].status();
        l[1].status();


    }

}
