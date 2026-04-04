package nascimentolucas.dev.maratonajava.exercicios.exercicio51.dominio;

public class Circulo extends Forma{
    private double raio;

    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double getArea() {
        return Math.PI * getRaio() * getRaio();
    }
}
