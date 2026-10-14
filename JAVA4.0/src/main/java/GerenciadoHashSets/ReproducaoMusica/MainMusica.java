package GerenciadoHashSets.ReproducaoMusica;

public class MainMusica {
    static void main(String[] args) {
        Player filaMusica = new Player();

        Musica m1 = new Musica("GO", "BLACKPINK");
        Musica m2 = new Musica("Bad Dreams", "KEANE");
        Musica m3 = new Musica("TOXIC", "Britney Spears");
        Musica m4 = new Musica("Seoul City", "Jennie");


        filaMusica.adicionarMusica(m1);
        filaMusica.adicionarMusica(m2);
        filaMusica.adicionarMusica(m3);
        filaMusica.adicionarMusica(m4);

        filaMusica.exibirFila();


    }
}
