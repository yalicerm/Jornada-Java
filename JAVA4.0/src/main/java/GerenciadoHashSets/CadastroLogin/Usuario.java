package GerenciadoHashSets.CadastroLogin;

public class Usuario {
    private String username;
    private String senha;
    private String email;
    private String dataCadastro;

    public Usuario(String username, String senha, String email) {
        this.username = username;
        this.senha = senha;
        this.email = email;
        this.dataCadastro = dataAtual();
    }

    public String getUsername() {
        return username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean verficarSenha(String senhaDigitada){
        return this.senha.equals(senhaDigitada); //Retornar verdadeiro quando a senha digitada pelo usuário for igual a que está atributo ao objeto

    }

    //Obter a data que usuário realizou o cadastro
    public String dataAtual(){
        java.time.LocalDateTime dataAgora = java.time.LocalDateTime.now(); //dataAgora recebe o pacotos Datetime do Java para pegar o hora atual.
        java.time.format.DateTimeFormatter dataFormatada = java.time.format.DateTimeFormatter.ofPattern("dd/mm/yyyy HH:mm:ss"); //Processo de formatação da data para Dia/Mes/Ano Hora/Minutos/Segundos
        return dataAgora.format(dataFormatada); //formata a variavel dataAgora com a formatação especificada em dataFormatada
    }

    //Exibir as informações do Usuario como seu Username, email cadastrado e a hora que foi realizado o Cadastro.
    public void exibirInfoUser(){
        System.out.println("Username: " + this.username);
        System.out.println("Email cadastrado: " + this.email);
        System.out.println("Cadastro realizado em: " + this.dataCadastro);
    }

    @Override
    public String toString() {
        return "Usuario [User = " + username + " , Email = " + email + " ]";
    }
}
