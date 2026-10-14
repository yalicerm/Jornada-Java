package Ex1CursoEmVideo;

public class Main {
    public static void main(String[] args) {
        Pessoa leitor1 = new Pessoa("Alice", 20, 'F');
        Pessoa leitor2 = new Pessoa("Tayna", 21, 'F');

        Livro livro1 = new Livro("Introdução valorant", "Sacy", 150, leitor1);
        Livro livro2 = new Livro("Java pra iniciante", "Gustavo", 300, leitor2);
        //Para retornar o valor do nosso método string detalhe, usamos um System.out

        livro1.abrir();
        livro1.folhear(30);
        livro1.avançar();

    }
}
