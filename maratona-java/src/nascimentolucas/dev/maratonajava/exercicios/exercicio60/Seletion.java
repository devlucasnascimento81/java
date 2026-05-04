package nascimentolucas.dev.maratonajava.exercicios.exercicio60;

import java.util.Arrays;
import java.util.Scanner;

public class Seletion {

    public static void ordenar(int[] array){
        if (array == null || array.length < 2){
            throw new IllegalArgumentException("Erro: o array não pode ser null ou ter menos de 2 elementos no indice!");
        }
        for (int i = 0; i < array.length -1; i++){
            int indiceMenor = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[indiceMenor]){
                    indiceMenor = j;
                }
            }
            int temp = array[i];
            array[i] = array[indiceMenor];
            array[indiceMenor] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do array: ");
        int tamanho = sc.nextInt();

        int[] nums = new int[tamanho];
        for (int i = 0 ; i < nums.length; i++){
            System.out.println("Digite o elemento: ");
            nums[i] = sc.nextInt();
        }
        try {
            System.out.println("Seu array: "+ Arrays.toString(nums));
            System.out.println("Ordenando...");
            ordenar(nums);
            System.out.println("Array ordenado: "+Arrays.toString(nums));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando programa...");
            sc.close();
        }
    }
}
