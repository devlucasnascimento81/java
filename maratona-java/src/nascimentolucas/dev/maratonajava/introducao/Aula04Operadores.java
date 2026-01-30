package nascimentolucas.dev.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 + numero02;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        //< > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10.0;



        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("IsDezIgualVinte "+isDezIgualVinte);
        System.out.println("IsDezIgualDez "+isDezIgualDez);
        System.out.println("IsDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrintra = idade > 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrintra = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrintra "+isDentroDaLeiMaiorQueTrintra);
        System.out.println("isDentroDaLeiMenorQueTrintra "+isDentroDaLeiMenorQueTrintra);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("Posso comprar o playstation 5? "+isPlaystationCincoCompravel);
    }
}
