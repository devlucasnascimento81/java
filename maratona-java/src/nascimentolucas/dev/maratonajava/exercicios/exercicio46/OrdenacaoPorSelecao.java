package nascimentolucas.dev.maratonajava.exercicios.exercicio46;

import java.util.Arrays;

public class OrdenacaoPorSelecao {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 8, 1, 4};

        System.out.println(Arrays.toString(numeros));

        for (int i = 0; i < numeros.length; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[indiceMenor]) {
                    indiceMenor = j;
                }
            }
            int temp = numeros[i];
            numeros[i] = numeros[indiceMenor];
            numeros[indiceMenor] = temp;

        }
        System.out.println(Arrays.toString(numeros));
    }


}
