package nascimentolucas.dev.maratonajava.exercicios.exercicio12.dominio;

public class Bike implements Transporte {

    @Override
    public void mover() {
        System.out.println("Bicicleta está pedalando");
    }
}
