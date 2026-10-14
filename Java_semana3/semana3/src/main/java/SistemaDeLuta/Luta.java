package SistemaDeLuta;

/*
Regras:
Lutadores da mesma categoria
Desafiado e desafiante devem ser lutadores diferentes
Só pode acontecer se a luta estiver aprovada
Só pode ter como resultado a vitória de um lutador ou empate
 */

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int round;
    private boolean aprovada;

    public void marcarLuta(Lutador l1, Lutador l2){
        if ( l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.aprovada = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar(){
        if (aprovada){
          System.out.println("Começando a apresentação dos lutadores!");
          System.out.println("### Primeiro Lutador: ###");
          this.desafiado.apresentar();
          System.out.println("### Segundo Lutador: ###");
          this.desafiante.apresentar();

          Random aleatorio = new Random(); //Para receber valor aleatório
          int vencedor = aleatorio.nextInt(3);
          switch (vencedor){
              case 0: //empate
                 System.out.println("Empatou");
                 this.desafiado.empatarLuta();
                 this.desafiante.empatarLuta();
                 break;
              case 1: //desafiado
                  System.out.println("Vitória do desafiado!!!");
                  this.desafiado.ganharLuta();
                  this.desafiante.perderLuta();
                  break;
              case 2:  //desafiante
                  System.out.println("Vitória do desafiante!!");
                  this.desafiado.perderLuta();
                  this.desafiante.ganharLuta();
                  break;
          }
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
