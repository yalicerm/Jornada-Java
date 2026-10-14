package GerenciadoHashSets.SistemaBiblioteca;

public class Livro {
    private String titulo;
    private int anoPubli;

    public Livro(String titulo, int anoPubli) {
        this.titulo = titulo;
        this.anoPubli = anoPubli;
    }


    public String getTitulo() {
        return titulo;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    @Override
    public String toString() {
        return "| Título: " + this.titulo + " | Ano: " + this.anoPubli;
    }
}
