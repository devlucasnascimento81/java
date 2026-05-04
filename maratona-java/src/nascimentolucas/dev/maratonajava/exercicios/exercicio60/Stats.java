package nascimentolucas.dev.maratonajava.exercicios.exercicio60;

import java.util.Arrays;
import java.util.Scanner;

public class Stats {

    public static int maiorValor(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Erro: o array não pode ser null ou vazio!");
        }
        int maior = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }
        return maior;
    }

    public static int menorValor(int[] array){
        if (array == null || array.length == 0){
            throw new IllegalArgumentException("Erro: o array não pode ser null ou vazio!");
        }
        int menor = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < menor){
                menor = array[i];
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual tamanho do  array que você deseja criar?");
        int tamanho = sc.nextInt();

        int nums [] = new int[tamanho];

        for (int i = 0; i < nums.length; i++){
            System.out.print("Digite um número: ");
            nums[i] = sc.nextInt();
        }
        try {
            System.out.println("Seu array: "+Arrays.toString(nums));
            System.out.println("Buscando maior valor...");
            System.out.println("Maior valor encontrado: "+maiorValor(nums));
            System.out.println("Buscando menor valor...");
            System.out.println("Menor valor encotrado: "+menorValor(nums));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando programa...");
            sc.close();
        }


    }
}
