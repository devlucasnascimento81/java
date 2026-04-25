package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        String[] nomes = {"lucas", "tiago", "mateus"};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite um numero para pesquisar no ínice: ");
            String entrada = sc.nextLine();
            int a = Integer.parseInt(entrada);
            System.out.println(nomes[a]);
        }catch (NumberFormatException e){
            System.out.println("Erro: digite apenas números");
        }finally {
            System.out.println("Busca encerrada.");
        }
    }
}
