package nascimentolucas.dev.maratonajava.exercicios.exercicio33.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio33.dominio.Validador;

public class exercicio33Test {
    public static void main(String[] args) {

        String email = "lucascamposx@gmail.com";

        if (Validador.isEmailValido(email)){
            System.out.println("Email válido");
        } else {
            System.out.println("Email inválido");
        }

        String senha = "babyShark11";

        if (Validador.isSenhaValida(senha)){
            System.out.println("Senha Válida");
        } else {
            System.out.println("Senha inválida");
        }

        int idade = 12;

        if (Validador.isMaiorDeIdade(idade)){
            System.out.println("Idade válida");
        } else {
            System.out.println("Idade inválida");
        }
    }
}
