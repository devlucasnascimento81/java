package nascimentolucas.dev.maratonajava.exercicios.exercicio10.dominio;

public class Pix implements Pagamento{
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento com pix: "+valor);
    }
}
