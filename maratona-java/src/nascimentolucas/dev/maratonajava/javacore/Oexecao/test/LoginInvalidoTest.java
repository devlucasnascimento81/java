package nascimentolucas.dev.maratonajava.javacore.Oexecao.test;

import nascimentolucas.dev.maratonajava.javacore.Oexecao.dominio.LoginInvalidoExeption;

import java.util.Scanner;

public class LoginInvalidoTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoExeption e){
            System.out.println(e.getMessage());
        }

    }

    private static void logar() throws LoginInvalidoExeption {
        Scanner teclado = new Scanner(System.in);
        String username08 = "goku";
        String senha = "ssj";
        System.out.println("Usuário");
        String entradaUsuario = teclado.nextLine();
        System.out.println("Senha");
        String entradaSenha = teclado.nextLine();
        if (!username08.equals(entradaUsuario) || !senha.equals(entradaSenha)){
            throw new LoginInvalidoExeption("Usuário ou senha inválidos");
        }

        System.out.println("Usuário logado com sucesso");

    }
}
