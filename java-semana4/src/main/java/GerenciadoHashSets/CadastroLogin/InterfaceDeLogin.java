package GerenciadoHashSets.CadastroLogin;

import java.util.Scanner;

public class InterfaceDeLogin {
    private TelaLogin sistemaLogin; //Composição -> Uma interface de login não existe sem o sistema por trás dela
    private  Scanner scanner;

    public InterfaceDeLogin(){
        this.sistemaLogin = new TelaLogin();
        this.scanner = new Scanner(System.in);
    }

    //Metodo que vai iniciar o menu de opções
    public void iniciar(){
        int op = 0;

        System.out.println(" ======== SISTEMA DE LOGIN ======");
        //Crie um loop pro usuario acessar todas as opções desde que seja diferente de 7

        while (op != 7){
            exibirMenu();

            try {
                System.out.println("Digite qual opção deseja: ");
                op = Integer.parseInt(scanner.nextLine());
                System.out.println();

                switch (op){
                    case 1:
                        telaCadastro();
                        break;

                    case 2:
                        telaLogin();
                        break;

                    case 3:
                        telaLogout();
                        break;

                    case 4:
                        alterarSenha();
                        break;

                    case 5:
                        removerUsuario();
                        break;

                    case 6:
                        listarUsuario();
                        break;

                    case 7:
                        System.out.println("Encerrando sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida! Digite outro núero entre 1 e 7");
                }
            } catch (NumberFormatException e){
                System.out.println("Digite apenas númmeros");
            }
        }
        scanner.close();
    }

    public void exibirMenu(){
        System.out.println(" -------------------------");
        System.out.println("      MENU PRINCIPAL     ");
        System.out.println(" -------------------------");

            System.out.println("│  1. Cadastrar novo usuário          │");
            System.out.println("│  2. Fazer login                     │");
            System.out.println("│  3. Fazer logout                    │");
            System.out.println("│  4. Alterar senha                   │");
            System.out.println("│  5. Remover usuário                 │");
            System.out.println("│  6. Listar usuários                 │");
            System.out.println("│  7. Encerrar                        │");
            System.out.println("│                                     │");

    }

    public void telaCadastro(){
        System.out.print("Crie um username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Crie uma senha (mín. 6 caracteres): ");
        String senha = scanner.nextLine();

        System.out.print("Digite seu email: ");
        String email = scanner.nextLine().trim();

        sistemaLogin.cadastrarUsuario(username, senha, email);
    }

    public void telaLogin() {
        System.out.println(" ==== TELA DE LOGIN ====");

        // Verifica se já está logado
        if (sistemaLogin.uLogado()) {
            System.out.println("Você já está logado como: " + sistemaLogin.getUsuarioLogado().getUsername());
            System.out.println("Faça logout primeiro para trocar de usuário.");
            return;
        }

        int tentativas = 0;
        int maxTentativas = 3;
        boolean loginSucesso = false;

        while (tentativas < maxTentativas && !loginSucesso) {
            System.out.print("Digite seu username: ");
            String username = scanner.nextLine().trim();

            System.out.print("Digite sua senha: ");
            String senha = scanner.nextLine();

            loginSucesso = sistemaLogin.fazerLogin(username, senha);
        }

        if (!loginSucesso){
            tentativas++;
            int tentivasRestantes = maxTentativas - tentativas;

            if(tentivasRestantes > 0){
                System.out.println("Você ainda tem " + tentivasRestantes + " tentativas restantes");
            } else {
                System.out.println("Sistema Bloquearo! O numero de tentivas foi atigindo");
            }
        }
    }

    public void telaLogout(){
        System.out.println(" ====== TELA DE LOGOUT =====");
        sistemaLogin.fazerLogout();
    }

    public void alterarSenha(){
        System.out.print("Digite seu username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Digite sua senha atual: ");
        String senhaAtual = scanner.nextLine();

        System.out.print("Nova senha (mín. 6 caracteres): ");
        String novaSenha = scanner.nextLine();

        System.out.print("Confirme a nova senha: ");
        String confirmacao = scanner.nextLine();

        if (!novaSenha.equals(confirmacao)) {
            System.out.println("As senhas não coincidem!");
            return;
        }

        sistemaLogin.alterarSenha(username, senhaAtual, novaSenha);
    }

    private void removerUsuario(){
        System.out.print("Username: ");
        String username = scanner.nextLine().trim();

        System.out.print("Senha (para confirmar): ");
        String senha = scanner.nextLine();

        System.out.print("Tem certeza? (s/n): ");
        String confirmacao = scanner.nextLine().toLowerCase();

        if (confirmacao.equals("s") || confirmacao.equals("sim")) {
            sistemaLogin.removerUsuario(username, senha);
        } else {
            System.out.println("Operação cancelada.");
        }
    }

    //Em andamento ainda
    public void listarUsuario(){

    }

}
