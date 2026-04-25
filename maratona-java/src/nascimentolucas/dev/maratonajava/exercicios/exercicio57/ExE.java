package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

import java.util.Scanner;

public class ExE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro numero: ");
        String a1 = sc.nextLine();

        System.out.print("Segundo numero: ");
        String b1 = sc.nextLine();

        System.out.print("Operação (+, -, *, /): ");
        String op = sc.nextLine();

        try {
            int a = Integer.parseInt(a1);
            int b = Integer.parseInt(b1);
            int t = 0;
            switch (op) {
                case "+": t = a + b;
                    break;
                case "-": t = a - b;
                    break;
                case "*": t = a * b;
                    break;
                case "/": t = a / b;
                    break;
                default:
                    throw new RuntimeException("Erro: Operação inválida");
            }
            System.out.println("Resultado: "+t);

        } catch (NumberFormatException e){
            System.out.println("Erro: válido apenas numero!");
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
