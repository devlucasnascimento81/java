package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

import java.util.Scanner;

public class ExC {
    public static void main(String[] args) {
        int [] numeros = {22, 32, 5};
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        String entrada = sc.nextLine();

        try {
            int indice = Integer.parseInt(entrada);
            System.out.println(numeros[indice]);
        }catch (NumberFormatException e){
            System.out.println("Erro: Apenas numeros inteiros são aceitos!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Erro: posição não existe no array");
        }
    }
}
