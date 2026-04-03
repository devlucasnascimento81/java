package nascimentolucas.dev.maratonajava.exercicios.exercicio48.domain;

public class Moto extends Veiculo {
    private double cilindradas;

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    public Moto(String nome, double velocidadeMax, double cilindradas) {
        super(nome, velocidadeMax);
        this.cilindradas = cilindradas;
    }

    @Override
    public void descricao() {
        System.out.println("Modelo  da moto: "+getNome());
        System.out.println("Cilindradas: "+getCilindradas());
        System.out.println("Velocidade Max: "+getVelocidadeMax());
    }
}
