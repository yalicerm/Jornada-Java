package GerenciadoHashSets.ReproducaoMusica;

import java.util.LinkedList;

public class Player {
    private LinkedList<Musica> filaMusica; //Usando LINKED pois é perfeito para remover ou inserir musicas novas na fila

    public Player(){
        this.filaMusica = new LinkedList<>();
    }

    public void adicionarMusica(Musica m){
        this.filaMusica.add(m);
        System.out.println("Música " + m.getNome() + " adicionada na fila!");
    }

    public void tocarProxima(){
        if (filaMusica.isEmpty()){
            System.out.println("A fila está vazia!");
        } else{
            Musica proxMusica = filaMusica.pollFirst();
            System.out.println("Tocando agora [" + proxMusica.getNome() + "] - [" + proxMusica.getAtista() + " ]");
           // Metodo pollFirst Coloca o próximo item para "tocar" e remove logo em seguida
        }
    }

    public void tocarSeguir(Musica m){
        //Adicionando a próxima música na fila:
        filaMusica.addFirst(m);
    }

    public void exibirFila(){
        System.out.println(" ====== EXIBINDO MUSICAS NA FILA ======");
        System.out.println("Músicas na fila: " + this.filaMusica.size());
        for ( Musica musicas : filaMusica){
            System.out.println(musicas.getNome() + " - " + musicas.getAtista());
        }
        System.out.println(" ======================================");
    }


    public LinkedList<Musica> getFilaMusica() {
        return filaMusica;
    }
}
