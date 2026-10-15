package GerenciadoHashSets.CadastroLogin;

import java.util.HashMap;
import java.util.Map;

public class TelaLogin {
    private HashMap<String, Usuario> usuarios;
    private Usuario usuarioLogado; //Atributo usado para armazenar toda vez que um usário consegui efetuar login

    public TelaLogin(){
        this.usuarios = new HashMap<>(); //Instanciando o mapa assim que criamos um Sistema de Login
        this.usuarioLogado = null; //No inicio não vamos ter nenhum usuario logado

        //Chamando a metodo de cadastro para criar um admin pro sistema.
        cadastrarUsuario("admin", "admin@0123", "userAdmin@gmail.com");
    }

    public boolean cadastrarUsuario(String username, String senha, String email){
        //Verifica se o Username não está vazio
        if (username == null || username.trim().isEmpty()){
            System.out.println("ERRO. Username está vazio");
            return false;
        }

        //Verifica se o Username já existe
        if (usuarios.containsKey(username)){
            System.out.println("Esse username já está em uso");
            return false;
        }

        // Verifica se a senha deve ter no mínimo 6 caracteres
        if (senha.length() < 6){
            System.out.println("Senha deve ter no mínimo 6 caracteres");
            return false;
        }

        //Verifica se o email digitado pelo usuário contém @ (verficação básica)
        if (!email.contains("@")){
            System.out.println("Email inválido");
            return false;
        }

        // Etapa de cadastro de um novo usuário caso passe por todas as verificações
        Usuario novoUsuario = new Usuario(username, senha, email); //Instancia um novo usuario
        usuarios.put(username, novoUsuario); //Adiciona esse usuário como Value e mantem o username dele como Key.
        System.out.println("Usuário cadastrado com sucesso!");
        return true;
    }

    //Para efetuar login não é preciso passar o email. Apenas Username e senha é necessário
    public boolean fazerLogin(String username, String senha){
        //Se o username existe
        if (!usuarios.containsKey(username)){
            System.out.println("Usário não encontrado");
            return false;
        }

        //Acessar os dados do Usuário no HashMap e colocar dentro de uma nova variável para facilitar as validações de senha
        Usuario usuario = usuarios.get(username);

        //Verificar se a senha está correta
        //Acessando o metodo verificarSenha da Classe Usuário
        if (!usuario.verficarSenha(senha)){
            System.out.println("Senha incorreta");
            return false;
        }

        //Etapa onde o login será efetuado com sucesso
        this.usuarioLogado = usuario; //O user que passou por todas as verificação vai ser tratado agora como Usuario Logado
        System.out.println("Login efetudo com sucesso");
        return true;
    }

    public void fazerLogout(){
        //Verificar se existe algum usuário logado antes
        if (usuarioLogado != null){
            System.out.println("Usuário " + usuarioLogado.getUsername() + " está saindo...");
            usuarioLogado = null; //Após realizar o logout, o usuarioLogado voltar a ficar null esperando o login novamente.
        } else {
            System.out.println("Nenhum usuário está logado no momento");
        }
    }

    //Atualizar o mapa com a novaSenha
    public boolean alterarSenha(String username, String senhaAtual, String novaSenha){

        //Novamente a verificação de Senha e Usuario correto/existente
        if (!usuarios.containsKey(username)){
            System.out.println("Usário não encontrado");
            return false;
        }

        //Mesma lógica de verificação de senha do metodo de login já que para alterar uma senha, a senha atual deve estar correta.
        Usuario usuario = usuarios.get(username);

        if (!usuario.verficarSenha(senhaAtual)){
            System.out.println("Senha incorreta");
            return false;
        }

        //A nova senha deve respeita a regra de 6 caracteres
        if (novaSenha.length() < 6){
            System.out.println("Nova deve ter no mínimo 6 caracteres");
            return false;
        }

        //Processo de atualiza a nova senha pelo set
        usuario.setSenha(novaSenha);
        System.out.println("Senha alterada com sucesso");
        return true;
    }

    public boolean removerUsuario(String username, String senha){
        //Verificação que a senha e username está corretos ou existem antes de remover um usuario

        if (!usuarios.containsKey(username)){
            System.out.println("Usuário não encontrado");
            return false;
        }

        Usuario usuario = usuarios.get(username);
        if (!usuario.verficarSenha(senha)) {
            System.out.println("Senha incorreta!");
            return false;
        }

        //Última etapa verifica se o usuario está logado ou não. Não pode remover um user se ele estiver logado
        if (usuarioLogado != null && usuarioLogado.getUsername().equals(username)){ //Se o usuario logado é diferente de null e possuo o mesmo username
            System.out.println("Para realizar a remoção, deve fazer logout primeiro");
            return false;
        }

        usuarios.remove(username);
        System.out.println("Usuário removido com sucesso!");
        return true;
    }

    public void listarUsuario(){
        if (usuarios.isEmpty()){  //Caso não tiver nenhum usuário adicionado no HashMap
            System.out.println("Nenhum usuário encontrado");
            return;
        }

        System.out.println(" === USUÁRIOS CADASTRADOS ===");
        System.out.println(" -> Total de usuário cadastrado: " + usuarios.size());
        for (String usernames : usuarios.keySet()){
            System.out.println("Username: " + usernames);
        }
    }

    //Metodo para imprimir informações mais detalhadas do usuário
    public void detalhamentoInfoUsuario(){
        for (Usuario usuario : usuarios.values()) {
            System.out.println("─".repeat(40));
            usuario.exibirInfoUser();
        }
        System.out.println("─".repeat(40));
    }

    //Verifia se esta logado
    public boolean uLogado() {
        return usuarioLogado != null;
    }

    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }

    public boolean usuarioExiste(String username) {
        return usuarios.containsKey(username);
    }

    //Conta quantos usuários existe
    public int getTotalUsuarios() {
        return usuarios.size();
    }



}
