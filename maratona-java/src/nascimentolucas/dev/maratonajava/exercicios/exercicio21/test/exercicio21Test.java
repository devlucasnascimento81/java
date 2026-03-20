package nascimentolucas.dev.maratonajava.exercicios.exercicio21.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio21.dominio.Calculadora;

public class exercicio21Test {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(18,6));
        System.out.println(calculadora.somar(30,10,5));
        System.out.println(calculadora.somar(19.5,22.2));
    }
}
