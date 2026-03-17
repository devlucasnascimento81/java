package nascimentolucas.dev.maratonajava.exercicios.exercicio10.dominio;

public class CartaoCredito implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento com cartão: "+valor);
    }
}
