package nascimentolucas.dev.maratonajava.exercicios.exercicio48.domain;

public abstract class Veiculo {
    private String nome;
    private double velocidadeMax;

    public Veiculo(String nome, double velocidadeMax) {
        this.nome = nome;
        this.velocidadeMax = velocidadeMax;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public abstract void descricao();
}
