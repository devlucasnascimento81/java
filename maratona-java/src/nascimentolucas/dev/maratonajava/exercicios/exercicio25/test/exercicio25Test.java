package nascimentolucas.dev.maratonajava.exercicios.exercicio25.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio25.dominio.Boleto;
import nascimentolucas.dev.maratonajava.exercicios.exercicio25.dominio.CartaoCredito;
import nascimentolucas.dev.maratonajava.exercicios.exercicio25.dominio.Pagamento;
import nascimentolucas.dev.maratonajava.exercicios.exercicio25.dominio.Pix;

public class exercicio25Test {
    public static void main(String[] args) {
        Pagamento[] pagamentos = {
                new CartaoCredito(),
                new Pix(),
                new Boleto()
        };
        double[] valores = {189.90, 50, 249.90};

        for (int i = 0; i < pagamentos.length; i++) {
            pagamentos[i].pagar(valores[i]);
        }

    }
}
