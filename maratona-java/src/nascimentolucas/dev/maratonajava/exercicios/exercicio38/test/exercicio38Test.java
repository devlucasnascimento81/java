package nascimentolucas.dev.maratonajava.exercicios.exercicio38.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio38.dominio.Produto;
import nascimentolucas.dev.maratonajava.exercicios.exercicio38.dominio.TipoProduto;

public class exercicio38Test {
    public static void main(String[] args) {
        Produto[] produtos = {
                new Produto("Ear pods pro",89.90, TipoProduto.ELETRONICO),
                new Produto("Ford Ka 1.6 auto",38.080,TipoProduto.VEICULO),
                new Produto("Ovo pascoa Kinder bueno",69.90,TipoProduto.ALIMENTO)
        };
        for (Produto p : produtos){
            p.imprime();
        }
    }
}
