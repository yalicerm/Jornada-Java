package Ex1CursoEmVideo;

//Vai ter uma agregação com a classe Pessoa
//Vai relacionar om a interface Publicaoa

//Atributos aberto é booleano
//Só podemos abrir um livro se ele tiver fechado e só podemos
//fechar um livro se ele tiver aberto

//Só podemos folhear, avançarPag e voltarPag se o livro tiver aberto
//Leitor é uma instância da classe pessoa

//Pagina atual começa em zero, o usuário coloca depois

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; //Atribuição

    public Livro(String titulo, String autor, int totalPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPag = totalPag;
        this.aberto = false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    public String detalhe() {  //Novo tipo de método para printar as info do livro
        return "Livro: " + this.getTitulo() + "Autor: " + this.getAutor();
    }

    @Override
    public void abrir() {
        if (!aberto){
            this.aberto = true;
            System.out.println("Abrindo livro...");
        } else{
            System.out.println("O livro já está aberto");
        }
    }

    @Override
    public void fechar() {
        if (this.aberto){
            this.aberto = false;
            System.out.println("Fechando livro...");
        } else{
            System.out.println("O livro já está fechado");
        }
    }

    @Override
    public void folhear(int p) {
        if (p > this.getTotalPag()){
            this.setPagAtual(0);
            System.out.println("Erro");
        } else{
            this.setPagAtual(p);

        }
    }

    //Livro aberto
    //A pagAtual e soma mais um
    @Override
    public void avançar() {
        if (this.aberto){
            this.setPagAtual(getPagAtual() + 1);
            System.out.println("Avençado....Número da página atualizada: " + this.getPagAtual());
        } else{
            System.out.println("Impossível agora. O livro está fechado");
        }
    }

    @Override
    public void voltar() {
        if (this.aberto){
            this.setPagAtual(getPagAtual() - 1);
            System.out.println("Voltando...Número da página atualizada: " + this.getPagAtual());
        } else {
            System.out.println("Impossível agora. O livro está fechado");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPag() {
        return totalPag;
    }

    public void setTotalPag(int totalPag) {
        this.totalPag = totalPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
}
