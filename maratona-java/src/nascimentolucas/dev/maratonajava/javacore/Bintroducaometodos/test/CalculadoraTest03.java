package nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.test;

import nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("---------------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,5);
    }
}
