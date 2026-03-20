package nascimentolucas.dev.maratonajava.exercicios.exercicio20.dominio;

public class Passaro implements Animal{
    @Override
    public void emitirSom() {
        System.out.println("Piu piu!!");
    }

    @Override
    public void mover() {
        System.out.println("O passaro voa...");
    }
}
