package nascimentolucas.dev.maratonajava.exercicios.exercicio58;

public class InsertionSort {
    public static void main(String[] args) {
        int[] vetors = {5,2,4,3,7};
        // algoritmo insertion sort
        for (int i = 1; i < vetors.length; i++){
            int key = vetors[i];// elemento atual
            int j = i - 1;

            //move os elementos maiores para a direta
            while (j >= 0 && vetors[j] > key) {
                vetors[j + 1] = vetors[j];
                j--;
            }
            //insere a chave na posição correta
            vetors[j + 1] = key;

        }

        //imprimir resultado
        for (int i = 0; i < vetors.length; i++) {
            System.out.println(vetors[i] + " ");
        }
    }
}
