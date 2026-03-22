package nascimentolucas.dev.maratonajava.exercicios.exercicio25.dominio;

public class Boleto implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado no boleto: "+valor);
    }
}
