package nascimentolucas.dev.maratonajava.exercicios.exercicio48.domain;

public class Carro extends Veiculo {
    private String cor;

    public Carro(String nome, double velocidadeMax, String cor) {
        super(nome, velocidadeMax);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void descricao() {
        System.out.println("Modelo  do carro: "+getNome());
        System.out.println("Cor: "+getCor());
        System.out.println("Velocidade Max: "+getVelocidadeMax());
    }
}
