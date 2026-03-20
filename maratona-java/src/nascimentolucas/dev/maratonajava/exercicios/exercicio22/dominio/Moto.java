package nascimentolucas.dev.maratonajava.exercicios.exercicio22.dominio;

public class Moto extends Veiculo{

    private double cilindradas;

    public Moto(String marca, String modelo, double velocidadeMax, double cilindradas) {
        super(marca, modelo, velocidadeMax);
        this.cilindradas = cilindradas;
    }

    public double getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(double cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void descricao() {
        System.out.println("Veículo tipo: motocicleta");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println("Cilindradas: "+getCilindradas());
        System.out.println("Velocidade Máxima: "+getVelocidadeMax());
    }
}
