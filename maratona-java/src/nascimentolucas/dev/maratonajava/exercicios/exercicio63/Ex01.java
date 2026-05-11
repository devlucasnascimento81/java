package nascimentolucas.dev.maratonajava.exercicios.exercicio63;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try(sc){
            System.out.print("Digite a frase do dia:");
            String texto = sc.nextLine();
            System.out.println(processar(texto));
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando programa...");
            sc.close();
        }

    }
    public static String processar(String texto){
        if (texto == null || texto.isEmpty()){
            throw new IllegalArgumentException("Erro: o texto não pode ser null ou vazio");
        }
        String[] palavras = texto.split(" ");
        String maisLonga = palavras[0]; // começa a percorrer o array na pos '0'.
        StringBuilder resultado = new StringBuilder();
        for (String palavra : palavras) {
            resultado.append(Character.toUpperCase(palavra.charAt(0)));
            resultado.append(palavra.substring(1)).append(" ");
        }
        String comMaiusculas = resultado.toString().trim();

        for (String palavra : palavras) {
            if (palavra.length() > maisLonga.length()){
                maisLonga = palavra;
            }
        }
        StringBuilder invertida = new StringBuilder();
        for (int i = palavras.length - 1; i >= 0; i--) {
            invertida.append(palavras[i]).append(" ");
        }

        return "Primeira letra em MAIÚSCULO: " + comMaiusculas+
                "\n A frase invertida: "+ invertida +
                "\n A palavra mais longa da frase: "+ maisLonga;
    }
}
