package ControleUniversal;

public class ConObj {
   public  static void main(String[] args) {
        Controlador con1 = new ControleTv();
        con1.ligar();
        con1.baixarVolume();
        con1.abrirMenu();
    }

}
