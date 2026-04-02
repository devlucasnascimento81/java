package nascimentolucas.dev.maratonajava.exercicios.exercicio47;
import java.util.Scanner;

public class AtividadeArrays {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] valores = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.printf("Digite o numero da posicao [%d]: ", i + 1);
            valores[i] = in.nextInt();
        }

        int somaElementos = 0;
        for(int x = 0; x < 7; x++) {
          somaElementos  += valores[x];
        }

        System.out.printf("A soma dos elementos é: %d\n", somaElementos);

        for (int x = 0; x < 7; x++){
            int produto = valores[x] * x;
            System.out.printf("A mult. do indice pelo elem. %d * %d = %d\n", x, valores[x], produto);
        }
        double soma = somaElementos;
        double media = soma / 7.0;
        System.out.printf("A media aritmetrica dos elementos é: %f\n", media);
    }
}
