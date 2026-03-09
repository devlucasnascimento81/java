package nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.test;

import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("i7",1200);
        Tomate tomate = new Tomate("mexicano", 7);
        tomate.setDataValidade("11/12/2026");

        CalculadoraImposto.calcularImposto(tomate );

    }
}
