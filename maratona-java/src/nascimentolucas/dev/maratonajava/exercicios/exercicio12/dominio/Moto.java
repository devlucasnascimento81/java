package nascimentolucas.dev.maratonajava.exercicios.exercicio12.dominio;

public class Moto implements Transporte {
    TipoCombustivel tipoCombustivel;

    public Moto(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void mover() {
        System.out.println("Moto está acelerando");
    }
}
