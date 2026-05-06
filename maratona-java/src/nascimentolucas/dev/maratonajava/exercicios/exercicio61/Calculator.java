package nascimentolucas.dev.maratonajava.exercicios.exercicio61;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do indice do seu array: ");
        int tamanhoArray = sc.nextInt();

        int[] nums = new int[tamanhoArray];
        for (int i = 0; i < nums.length; i++){
            System.out.print("Digite um numero: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Seu array: "+ Arrays.toString(nums));

        try{
            System.out.print("Você gostaria de somar todos os elementos? (s/n): ");
            String escolha = sc.next();
            if (escolha.equals("s")){
                int valorTotal = somar(nums);
                System.out.println("A soma de todos os elementos são: "+valorTotal);
            }
            System.out.print("Gostaria de saber a média? ");
            String escolhaMedia = sc.next();
            if (escolhaMedia.equals("s")){
                double media = media(nums);
                System.out.println("A media do indice é: "+media);
            }

        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando programa...");
            sc.close();
        }

    }
    public static int somar(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Erro: array não pode ser nulo ou vazio");
        }
        int total = 0;
        for (int j : array) {
            total += j;
        }
        return total;
    }

    public static double media(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Erro: array não pode ser nulo ou vazio");
        }
        return (double) somar(array) / array.length;

    }
}
