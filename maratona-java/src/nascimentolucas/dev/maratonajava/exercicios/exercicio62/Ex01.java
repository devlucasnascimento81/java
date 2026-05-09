package nascimentolucas.dev.maratonajava.exercicios.exercicio62;


import java.util.Scanner;

//Manipulação de strings
public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc) {
            System.out.println("Digite uma frase abaixo: ");
            String entrada = sc.nextLine();
            System.out.println(analisar(entrada));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando programa...");
        }

    }
    public static String analisar(String texto){
        if (texto == null || texto.isEmpty()){
            throw new IllegalArgumentException("Erro! Texto não pode ser null ou vazio.");
        }
        String maiusculo = texto.toUpperCase();
        String minusculo = texto.toLowerCase();
        int caracteres = texto.replace(" ","").length();
        String[] palavras = texto.split(" ");
        int qtdPalavras = palavras.length;
        String limpa = texto.replace(" ", "").toLowerCase();
        boolean palindromo = limpa.equals(new StringBuilder(limpa).reverse().toString());

        return "Maiúsculo: "+ maiusculo +
                "\nMinúsculo+ "+ minusculo +
                "\nCaracteres: "+ caracteres +
                "\nPalavras: "+ qtdPalavras +
                "\nPaalíndromo: "+palindromo;


    }
}
