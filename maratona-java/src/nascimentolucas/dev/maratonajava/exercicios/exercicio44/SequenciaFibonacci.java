package nascimentolucas.dev.maratonajava.exercicios.exercicio44;

public class SequenciaFibonacci {
    public static void fibonacci(int n) {
        int anterior = 0;
        int atual = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(anterior);
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }
    }

    public static void main(String[] args) {
        fibonacci(10);
    }
}
