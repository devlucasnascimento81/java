package nascimentolucas.dev.maratonajava.exercicios.exercicio43;

public class ContaDePaavras {

    public static int contarPalavra(String[] palavras, String buscada) {
        int contador = 0;
        for (String p : palavras) {
            if (p.equalsIgnoreCase(buscada)) {
                contador++;
            }
        }
        return contador;
    }

    public static void main(String[] args) {
        String[] palavras = {"java","python","javali","dominó","java","relogio","gelo","java"};
        int resultado = contarPalavra(palavras,"java");
        System.out.println(resultado);
    }
}
