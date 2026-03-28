package nascimentolucas.dev.maratonajava.exercicios.exercicio41.test;

public class InversãoArray {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};

        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = temp;
        }

        for (int n : numeros) {
            System.out.println(n);
        }
    }
}
