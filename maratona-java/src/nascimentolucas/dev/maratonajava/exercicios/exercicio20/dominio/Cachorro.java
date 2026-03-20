package nascimentolucas.dev.maratonajava.exercicios.exercicio20.dominio;

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Rouff Rouff !!");
    }

    @Override
    public void mover() {
        System.out.println("O cachorro cava...");
    }
}
