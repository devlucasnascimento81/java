package nascimentolucas.dev.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000.80;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro  = true;
        boolean falso = false;
        char caractere = 65;
        String nome = "Lucão";

        System.out.println("A idade é "+idade+" anos");
        System.out.println(verdadeiro);
        System.out.println("char " +caractere);
        System.out.println("Oi, me chamo "+nome+", tudo bem?");
    }
}
