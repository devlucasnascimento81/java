package nascimentolucas.dev.maratonajava.exercicios.exercicio51.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio51.dominio.Circulo;
import nascimentolucas.dev.maratonajava.exercicios.exercicio51.dominio.Forma;
import nascimentolucas.dev.maratonajava.exercicios.exercicio51.dominio.Retangulo;
import nascimentolucas.dev.maratonajava.exercicios.exercicio51.dominio.Triangulo;

public class FormaTest {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo("Retangulo",8.0,4.5);
        Triangulo triangulo = new Triangulo("Triângulo",6,6);
        Circulo circulo = new Circulo("Círculo",8);

        Forma[] formas = {retangulo,triangulo,circulo};

        for (Forma f : formas){
            f.descricao();
        }
    }
}
