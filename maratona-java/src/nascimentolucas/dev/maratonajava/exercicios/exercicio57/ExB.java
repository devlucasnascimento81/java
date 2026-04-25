package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

public class ExB {
    public static void main(String[] args) {
        int[] numeros = {10,20,30};
        try {
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("posição não existe");
        }
    }
}
