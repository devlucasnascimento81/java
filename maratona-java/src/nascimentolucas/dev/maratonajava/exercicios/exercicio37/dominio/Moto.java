package nascimentolucas.dev.maratonajava.exercicios.exercicio37.dominio;

public class Moto extends Veiculo {
    private double velocidadeMax;

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public Moto(double velocidadeAtual, double velocidadeMax) {
        super(velocidadeAtual);
        this.velocidadeMax = velocidadeMax;
    }

    @Override
    public void acelerar(double velocidade) {
        if (getVelocidadeAtual() + velocidade <= velocidadeMax) {
            setVelocidadeAtual(getVelocidadeAtual() + velocidade);
        }
    }

    @Override
    public void freiar(double velocidade) {
        if (getVelocidadeAtual() - velocidade >= 0) {
            setVelocidadeAtual(getVelocidadeAtual() - velocidade);
        }
    }

    public void imprimeMoto() {
        System.out.println("Velocidade atual da moto: " + getVelocidadeAtual());
        System.out.println("Velocidade máxima da moto: " + getVelocidadeMax());
        System.out.println("\n");
    }
}
