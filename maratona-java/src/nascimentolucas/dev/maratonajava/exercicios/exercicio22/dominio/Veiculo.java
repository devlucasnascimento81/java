package nascimentolucas.dev.maratonajava.exercicios.exercicio22.dominio;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private  double velocidadeMax;

    public Veiculo(String marca, String modelo, double velocidadeMax) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public abstract void descricao();
}
