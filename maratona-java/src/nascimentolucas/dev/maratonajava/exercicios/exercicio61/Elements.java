package nascimentolucas.dev.maratonajava.exercicios.exercicio61;

import java.util.Arrays;
import java.util.Scanner;

public class Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do índice do seu array: ");
        int tamanhoArray = sc.nextInt();

        int[] nums = new int[tamanhoArray];
        for (int i = 0; i < nums.length; i++){
            System.out.print("Digite um numero: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Seu array: "+ Arrays.toString(nums));
        try{
            System.out.print("Digite o numero alvo: ");
            int alvo = sc.nextInt();
            int resultado = contar(nums,alvo);
            System.out.println("O valor "+alvo+" aparece  "+resultado+" vezes");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("encerrando programa...");
            sc.close();
        }

    }

    public static int contar(int[] array, int alvo){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Erro: array não pode ser nulo ou vazio");
        }
        int num = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == alvo){
                num ++;
            }
        }
        return num;
    }
}
