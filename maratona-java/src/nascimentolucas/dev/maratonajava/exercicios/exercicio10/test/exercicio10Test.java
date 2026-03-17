package nascimentolucas.dev.maratonajava.exercicios.exercicio10.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio10.dominio.CartaoCredito;
import nascimentolucas.dev.maratonajava.exercicios.exercicio10.dominio.Pagamento;
import nascimentolucas.dev.maratonajava.exercicios.exercicio10.dominio.Pix;

public class exercicio10Test {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
            new CartaoCredito(),
            new Pix()

        };
        for (Pagamento p : pagamentos){
            p.pagar(120);
        }
    }
}
