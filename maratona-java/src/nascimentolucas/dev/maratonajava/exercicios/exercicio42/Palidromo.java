package nascimentolucas.dev.maratonajava.exercicios.exercicio42;

public class Palidromo {
    public static boolean isPalindromo(String palavra) {
       int inicio = 0;
       int fim = palavra.length() - 1;

       while (inicio < fim) {

           if (palavra.charAt(inicio) != palavra.charAt(fim)) {
               return false;
           }

           inicio++;
           fim--;
       }
       return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindromo("arara"));
        System.out.println(isPalindromo("java"));
        System.out.println(isPalindromo("radar"));

    }
}
