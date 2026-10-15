package SistemaDeLuta;

public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;

    //SetPeso vai modificar o SetCategoria automaticamente ( SetCategoria deve ser private)
    //Criar vetor na MAIN de 6 objetos.
    //Constructor sem categoria


    public Lutador(String nome, String nacionalidade, int idade, double altura, double peso, int vitoria, int derrota, int empate) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitoria = vitoria;
        this.derrota = derrota;
        this.empate = empate;

    }

    public void apresentar(){
        System.out.println(" === APRESENTAÇÃO LUTADOR ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Nacionalidade: " + this.nacionalidade);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.altura + " m");
        System.out.println("Peso: " + this.peso + " Kg");
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitórias: " + this.vitoria);
        System.out.println("Derrotas: " + this.derrota);
        System.out.println("Empates: " + this.empate);
        System.out.println("==================================");



    }

    //Esse método é apenas uma mini apresentação
    public void status(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Vitórias: " + this.vitoria);
        System.out.println("Derrotas: " + this.derrota);
        System.out.println("Empates: " + this.empate);

    }

    public void ganharLuta(){
        this.setVitoria(getVitoria() + 1);
    }

    public void perderLuta(){
        this.setDerrota(getDerrota() + 1);
    }

    public void empatarLuta(){
        this.setEmpate(getEmpate() + 1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso( double peso) {
        this.peso = peso;
        this.setCategoria(); //Toda vez que o peso é acessado, ele acessa a categoria também.

    }

    public String getCategoria() {
        return categoria;
    }


    private void setCategoria() {
        if (getPeso() < 52.2){
            this.categoria = "Inválido";
        } else if (getPeso() <= 70.3){
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9){
            this.categoria = "Médio";
        } else if (getPeso() <= 120.2){
            this.categoria = "Pesado";
        } else{
            this.categoria = "Inválido";
        }
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
}
