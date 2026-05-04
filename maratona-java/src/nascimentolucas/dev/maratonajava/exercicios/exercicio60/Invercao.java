package nascimentolucas.dev.maratonajava.exercicios.exercicio60;

import java.util.Arrays;
import java.util.Scanner;

public class Invercao {
    public static void inverter(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Erro: array não pode ser nulo ou vazio!");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do seu array: ");
        int tamanho = sc.nextInt();

        int[] nums = new int[tamanho];

        for (int i = 0; i < nums.length; i++){
            System.out.print("Digite o elemento: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Seu array: "+ Arrays.toString(nums));

        try {
            System.out.println("invertendo o array...");
            inverter(nums);
            System.out.println("Array inverso: "+Arrays.toString(nums));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando programa...");
            sc.close();
        }
    }
}
