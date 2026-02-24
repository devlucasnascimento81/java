package nascimentolucas.dev.maratonajava.javacore.Gassociacao.test;

import nascimentolucas.dev.maratonajava.javacore.Gassociacao.domino.Escola;
import nascimentolucas.dev.maratonajava.javacore.Gassociacao.domino.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Kakashi sensei");
        Professor professor2 = new Professor("Iruka sensei");
        Professor[]  professores = {professor1,professor2};
        Escola escola = new Escola("Konoha", professores);

        escola.imprime();
    }

}
