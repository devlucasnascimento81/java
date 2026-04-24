package nascimentolucas.dev.maratonajava.exercicios.exercicio56;

public class DivisaoSegura {
    public static int dividir(int a, int b){
        try {
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("Não permitido divisão por zero");
            return -1;
        }
    }


    public static void main(String[] args) {

            System.out.println(dividir(10,5));
            System.out.println(dividir(10,0));
    }


}
