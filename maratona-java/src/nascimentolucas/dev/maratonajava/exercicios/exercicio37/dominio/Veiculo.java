package nascimentolucas.dev.maratonajava.exercicios.exercicio37.dominio;

public abstract class Veiculo {
    private double velocidadeAtual;

    public Veiculo(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public abstract void acelerar(double velocidade);

    public abstract void freiar(double velocidade);

}
