package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

public class ExG {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e){
            System.out.println("Erro: operção invalida");
        } finally {
            System.out.println("Programa finalizado!");
        }
    }
}
