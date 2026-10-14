package ControleUniversal;

public class ControleTv implements Controlador{
    //Passando os métodos
    private int volume;
    private boolean ligado;
    private boolean tocar;

    public ControleTv() {
        this.volume = 50;
        this.ligado = false;
        this.tocar = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocar() {
        return tocar;
    }

    public void setTocar(boolean tocar) {
        this.tocar = tocar;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void aumentarVolume() {
        if (this.isLigado()){
            this.setVolume(getVolume() + 5);
        } else{
            System.out.println("A TV está desligada");
        }
    }

    @Override
    public void baixarVolume() {
        if (this.isLigado()){
            if (getVolume() == 0){
                System.out.println("O volume já está zerado");
            } else{
                this.setVolume(getVolume() - 5);
            }
        }  else {
            System.out.println("A TV está desligada");
        }
    }

    //Menu vai ser só um método para printar as informações atual do controle

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? : " + this.isLigado());
        System.out.println("Está tocando? : " + this.isTocar());
        System.out.println("Volume atual: " + this.getVolume());
        for (int i = 1 ; i <= this.getVolume() ; i+= 10){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && this.getVolume() == 0){
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isTocar())){
            this.setTocar(true);
            System.out.println("Canal despausado com sucesso!");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isTocar()){
            this.setTocar(false);
            System.out.println("Canal pausado com sucesso!");
        }
    }
}
