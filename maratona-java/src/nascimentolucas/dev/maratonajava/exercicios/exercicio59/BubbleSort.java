package nascimentolucas.dev.maratonajava.exercicios.exercicio59;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] vetors = {5, 3, 8, 1, 4};
        System.out.println(Arrays.toString(vetors));

        for (int i = 1; i < vetors.length; i++){
            for (int j = 0; j < vetors.length -1; j++) {
                if (vetors[j] > vetors[j + 1]) {
                    int temp = vetors[j];
                    vetors[j] = vetors[j + 1];
                    vetors[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(vetors));
    }
}
