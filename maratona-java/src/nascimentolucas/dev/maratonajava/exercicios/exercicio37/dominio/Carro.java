package nascimentolucas.dev.maratonajava.exercicios.exercicio37.dominio;

public class Carro extends Veiculo {
    private double velocidadeMax;

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public Carro(double velocidadeAtual, double velocidadeMax) {
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

    public void imprimeCarro() {
        System.out.println("Velocidade atual do carro: " + getVelocidadeAtual());
        System.out.println("Velocidade máxima do carro: " + getVelocidadeMax());
        System.out.println("\n");
    }
}
