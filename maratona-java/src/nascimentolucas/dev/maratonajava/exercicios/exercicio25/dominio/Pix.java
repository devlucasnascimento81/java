package nascimentolucas.dev.maratonajava.exercicios.exercicio25.dominio;

public class Pix implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado no pix: "+valor);
    }
}
