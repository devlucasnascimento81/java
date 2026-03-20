package nascimentolucas.dev.maratonajava.exercicios.exercicio18.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio18.dominio.Circulo;
import nascimentolucas.dev.maratonajava.exercicios.exercicio18.dominio.Forma;
import nascimentolucas.dev.maratonajava.exercicios.exercicio18.dominio.Retangulo;

public class exercicio18Test {
    public static void main(String[] args) {
        Forma[] formas = {
                new Circulo(6),
                new Retangulo(8,6)
        };
        for (Forma f : formas){
            System.out.println("Area calculada: "+f.calcularArea());
        }
    }
}
