package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

import java.util.Scanner;

public class ExD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        String entrada = sc.nextLine();

        try{
            int idade = Integer.parseInt(entrada);
            if (idade >= 0 && idade <= 150){
                System.out.println("Sua idade é: "+idade);
            }else {
                throw new IllegalArgumentException("Idade invalida: Digite entre 0 e 150 anos!");
            }
        }catch (NumberFormatException e){
            System.out.println("É valido apenas numero inteiro");
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
