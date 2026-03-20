package nascimentolucas.dev.maratonajava.exercicios.exercicio18.dominio;

public class Retangulo implements Forma{
    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
