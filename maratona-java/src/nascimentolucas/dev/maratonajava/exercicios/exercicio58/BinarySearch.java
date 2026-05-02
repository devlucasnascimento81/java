package nascimentolucas.dev.maratonajava.exercicios.exercicio58;

public class BinarySearch {
    public int buscaBinaria(int[] array, int alvo){
            int inicio = 0;
            int fim = array.length - 1;
            int meio;

            while (inicio <= fim) {
                meio = (inicio + fim) / 2;
                if (array[meio] == alvo) return meio;
                if (array[meio] < alvo) inicio =  meio + 1; // descarta esquerda
                else fim = meio - 1; // descarta direita
            }

            return -1; //não encontrou
    }


    public static void main(String[] args) {

    }
}
