package nascimentolucas.dev.maratonajava.exercicios.exercicio64;

import java.util.HashMap;
import java.util.Scanner;

public class contadorPalavras {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Escreva um texto abaixo:");
            String texto = scanner.nextLine();
            System.out.println("Contando quantas palavras tem no seu texto...");
            contarPalavras(texto);
            scanner.close();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("encerrando programa...");
        }
    }

    public static void contarPalavras(String texto){
        if (texto == null ||  texto.isEmpty()){
            throw new IllegalArgumentException("Erro: texto não pode ser null ou vazio!");
        }
        HashMap<String, Integer> contador =  new HashMap<>();
        String[] palavras = texto.split(" ");
        for (String palavra : palavras) {
            contador.put(palavra, contador.getOrDefault(palavra, 0) + 1);
        }
        System.out.println(contador);
    }
}
