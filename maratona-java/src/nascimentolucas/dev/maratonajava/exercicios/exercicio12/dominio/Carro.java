package nascimentolucas.dev.maratonajava.exercicios.exercicio12.dominio;

public class Carro implements Transporte{
    TipoCombustivel tipoCombustivel;

    public Carro(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void mover() {
        System.out.println("Carro está dirigindo");
    }
}
