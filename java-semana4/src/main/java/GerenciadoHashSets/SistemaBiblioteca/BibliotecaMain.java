package GerenciadoHashSets.SistemaBiblioteca;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BibliotecaMain {
    static void main(String[] args) {

        Map<String, List<Livro>> listaLivros = new HashMap<>();

        listaLivros.put("Programação", new ArrayList<>());
        listaLivros.put("Ficção", new ArrayList<>());
        listaLivros.put("Romance", new ArrayList<>());
        listaLivros.put("Suspense", new ArrayList<>());

        //Adicionando os livros em cada categoria

        listaLivros.get("Ficção").add(new Livro("Harry Potter", 1997));
        listaLivros.get("Ficção").add(new Livro("Senhor dos aneis",1996 ));
        listaLivros.get("Programação").add(new Livro("Código Limpo", 2006));

        //Criar uma variável para facilitar a filtragem de busca
        String categoriaBuscada= "Ficção";
        List<Livro> livroDeFiccao = listaLivros.get(categoriaBuscada);

        //Ver todos os livros de Ficção
        for (Livro livros : livroDeFiccao){
            System.out.println(livros.getTitulo() + " - " + livros.getAnoPubli());
        }

        //Ver os livros de Programação:
        String categoriaBusc = "Programação";
        List<Livro> livrosDePro = listaLivros.get(categoriaBusc);

        for (Livro livos : livrosDePro){
            System.out.println(livos.getTitulo() + " | " + livos.getAnoPubli());
        }

        //Ver todos os livros da biblioteca:
        for (String livros : listaLivros.keySet()){
            System.out.println("Categoria: " + livros + " | " + listaLivros.get(livros));
        }



    }
}
