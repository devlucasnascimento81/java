package nascimentolucas.dev.maratonajava.exercicios.exercicio22.dominio;

public class Carro extends Veiculo  {

    private int numerosDePortas;

    public Carro(String marca, String modelo, double velocidadeMax, int numerosDePortas) {
        super(marca, modelo, velocidadeMax);
        this.numerosDePortas = numerosDePortas;
    }

    public int getNumerosDePortas() {
        return numerosDePortas;
    }

    public void setNumerosDePortas(int numerosDePortas) {
        this.numerosDePortas = numerosDePortas;
    }

    @Override
    public void descricao() {
        System.out.println("Veículo tipo: automóvel");
        System.out.println("Marca: "+getMarca());
        System.out.println("Modelo: "+getModelo());
        System.out.println(getNumerosDePortas()+" Portas");
        System.out.println("Velocidade Máxima: "+getVelocidadeMax());
    }
}
