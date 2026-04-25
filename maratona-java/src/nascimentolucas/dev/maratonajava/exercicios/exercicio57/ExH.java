package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

import java.util.Scanner;

public class ExH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        String entrada = sc.nextLine();

        try {
            int a = Integer.parseInt(entrada);
            System.out.println(a);
        } catch (NumberFormatException e){
            System.out.println("Erro: apenas numeros são válidos");
        } finally {
            sc.close();
            System.out.println("fechando scanner...2");
            System.out.println("Encerrando programa...");
        }
    }
}
