package nascimentolucas.dev.maratonajava.exercicios.exercicio33.dominio;

public class Validador {

    public static boolean isEmailValido(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean isSenhaValida(String senha){
        return senha.length() >= 8;
    }

    public  static boolean isMaiorDeIdade(int idade){
        return idade >= 18;
    }
}
