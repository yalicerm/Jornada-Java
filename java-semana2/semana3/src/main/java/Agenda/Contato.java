package Agenda;

public class Contato {
    private String nome;
    private String tel;
    private String email;
    private CategoriaCon categoria;

    //Para contato vamos usar ENUM

    public enum CategoriaCon{
        FAMILIA,
        AMIGOS,
        TRABALHO
    }

    public Contato(String nome, String tel, String email, CategoriaCon categoria) {
        this.nome = nome;
        this.tel = tel;
        this.email = email;
        this.categoria = categoria;
    }

    //Validar o email com o setter

    public void setEmail(String novoEmail) {
        if (novoEmail.contains("@") && novoEmail.contains(".")){
            this.email = novoEmail;
            System.out.println("Email salvo com sucesso");
        } else{
            System.out.println("Erro!");
        }
    }

    public void exibirContato(){
        System.out.println("=== Informações do contato ===");
        System.out.println("Nome salvo do contato: " + this.getNome());
        System.out.println("Telefone: " + this.getTel());
        System.out.println("Categoria: " + this.getCategoria());

    }

    //Verificar se o telefone teem 9 digitos
    public void setTel(String tele) {
        if (tele.length() == 9){
            this.tel = tele;
            System.out.println("Telefone salvo com sucesso!");
        } else{
            System.out.println("ERRO: O telefone deve ter exatamente 9 dígitos.");
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTel() {
        return tel;
    }



    public String getEmail() {
        return email;
    }


    public CategoriaCon getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaCon categoria) {
        this.categoria = categoria;
    }
}
