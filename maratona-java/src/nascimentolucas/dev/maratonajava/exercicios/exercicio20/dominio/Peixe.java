package nascimentolucas.dev.maratonajava.exercicios.exercicio20.dominio;

public class Peixe implements Animal {
    @Override
    public void emitirSom() {
        System.out.println("Blub Blub!!");
    }

    @Override
    public void mover() {
        System.out.println("O peixe nada...");
    }
}
