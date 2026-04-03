package nascimentolucas.dev.maratonajava.exercicios.exercicio48.domain;

public class Caminhao extends Veiculo {
    private int eixos;

    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    public Caminhao(String nome, double velocidadeMax, int eixos) {
        super(nome, velocidadeMax);
        this.eixos = eixos;
    }

    @Override
    public void descricao() {
        System.out.println("Modelo  do caminhão: "+getNome());
        System.out.println("Eixos: "+getEixos());
        System.out.println("Velocidade Max: "+getVelocidadeMax());
    }
}
