package Luisa;

public class Cliente1 {
    private String nome;
    private String CPF;
    private String end;

    private static int quantidadeCliente = 0;

    public Cliente1(String nom , String c, String e){
        this.nome = nom;
        this.CPF = c;
        this.end = e;
        quantidadeCliente++;
    }

    public String getNome() {
        return nome;
    }


    public String getCPF() {
        return CPF;
    }


    public String getEnd() {
        return end;
    }


    public static int getQuantidadeCliente() {
        return quantidadeCliente;
    }

}
