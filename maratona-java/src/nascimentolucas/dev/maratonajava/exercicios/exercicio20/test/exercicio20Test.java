package nascimentolucas.dev.maratonajava.exercicios.exercicio20.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio20.dominio.Animal;
import nascimentolucas.dev.maratonajava.exercicios.exercicio20.dominio.Cachorro;
import nascimentolucas.dev.maratonajava.exercicios.exercicio20.dominio.Passaro;
import nascimentolucas.dev.maratonajava.exercicios.exercicio20.dominio.Peixe;

public class exercicio20Test {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cachorro(),
                new Passaro(),
                new Peixe()
        };
        for (Animal a : animals){
            a.emitirSom();
            a.mover();
        }
    }
}
