package nascimentolucas.dev.maratonajava.exercicios.exercicio62;

import java.util.Calendar;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc){
            System.out.print("Digite um nùmero: ");
            int a = sc.nextInt();
            System.out.print("Digite um número: ");
            int b = sc.nextInt();
            calcular(a,b);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando...");
            sc.close();
        }

    }
    public static void calcular(double a, double b){
        if (a < 0 || b < 0){
            throw new IllegalArgumentException("O valor inserido não pode ser negativo!");
        }
        if (a != b){
            System.out.println("O maior entre os dois números: "+Math.max(a,b));
            System.out.println("----------------------------------------------------------------");
            System.out.println("O menor entre os dois números: "+Math.min(a,b));
        } else {
            System.out.println("os numeros são iguais! não há diferença entre os dois elementos");
            System.out.println("----------------------------------------------------------------");
        }
        System.out.println("A potência de: "+a+", elevado à: "+b+", é igual: "+Math.pow(a,b));
        System.out.println("----------------------------------------------------------------");
        System.out.println("A raiz quadrada de: "+a+" = "+Math.sqrt(a));
        System.out.println("----------------------------------------------------------------");
        System.out.println("O valor absoluto da diferença entre os dois elementos: "+Math.abs(a - b));
    }
}
