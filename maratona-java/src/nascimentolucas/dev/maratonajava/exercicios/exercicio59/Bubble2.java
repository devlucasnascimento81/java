package nascimentolucas.dev.maratonajava.exercicios.exercicio59;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble2 {

    public static void ordenar(int[] array) {
        if (array == null){
            throw new IllegalArgumentException("Erro: O array não pode ser null.");
        }
        if (array.length < 2) {
            throw new IllegalArgumentException("O array precisa ter pelo menos 2 elementos");
        }
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos elementos o array vai ter?");
        int tamanho = sc.nextInt();

        int[]nums = new int[tamanho];

        for (int i = 0; i < nums.length; i++){
            System.out.println("Digite um número: ");
            nums[i] = sc.nextInt();
        }

        try {
            System.out.println("Ordenando seu array...");
            ordenar(nums);
            System.out.println(Arrays.toString(nums));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
