package nascimentolucas.dev.maratonajava.exercicios.exercicio57;

public class ExA {
    public static void main(String[] args) {
        String valor = "1";

        try{
            int num = Integer.parseInt(valor);
        } catch (NumberFormatException e){
            System.out.println("por favor insira um numero!");
        }
    }
}
