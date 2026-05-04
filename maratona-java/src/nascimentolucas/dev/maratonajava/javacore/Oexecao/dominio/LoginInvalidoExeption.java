package nascimentolucas.dev.maratonajava.javacore.Oexecao.dominio;

public class LoginInvalidoExeption extends Exception{
    public LoginInvalidoExeption() {
        super("Login inválido");
    }

    public LoginInvalidoExeption(String message) {
        super(message);
    }
}
