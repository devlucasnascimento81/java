package nascimentolucas.dev.maratonajava.exercicios.exercicio51.dominio;

public class Retangulo extends Forma{


    private double base;
    private double altura;

    public Retangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double getArea() {
        return getBase() * getAltura();
    }

}
