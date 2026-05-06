package nascimentolucas.dev.maratonajava.exercicios.exercicio61;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o tamanho do indice do array: ");
        int tamanhoArray = sc.nextInt();

        int[] nums = new int[tamanhoArray];
        for (int i = 0; i < nums.length; i++){
            System.out.println("Digite um elemento: ");
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

    public static void ordenar(int[] array){
        if (array == null || array.length < 2){
            throw new IllegalArgumentException("Erro: o array não pode ser nulo ou vazio!");
        }
        for (int i = 1; i < array.length; i++){
            int chave = array[i];
            int j = i -1;
            while (j >= 0 && array[j] > chave){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = chave;
        }
    }


}
