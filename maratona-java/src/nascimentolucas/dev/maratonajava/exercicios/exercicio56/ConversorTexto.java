package nascimentolucas.dev.maratonajava.exercicios.exercicio56;

import java.util.Scanner;

public class ConversorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.print("Digite um numero inteiro: ");
                String entrada = sc.nextLine();
                numero = Integer.parseInt(entrada);
                valido = true;
            } catch (NumberFormatException e) {
                System.out.println("Isso não é um número! tente novamente.");
            }

            System.out.println("O dobro é: " + (numero * 2));

        }
    }
}
