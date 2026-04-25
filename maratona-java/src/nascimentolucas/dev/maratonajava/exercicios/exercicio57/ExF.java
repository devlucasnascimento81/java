package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

import java.util.Scanner;

public class ExF {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um índice ou 'sair' para encerrar: ");
            String entrada = sc.nextLine();

            if (entrada.equals("sair")) {
                System.out.println("Encerrando programa...");
                break;
            }
            try {
                int a = Integer.parseInt(entrada);
                System.out.println(nomes[a]);
            } catch (NumberFormatException e){
                System.out.println("Erro: apenas numeros são válidos!");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro: posição não existe no índice");
            }

        }
    }
}
