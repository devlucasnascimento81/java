package nascimentolucas.dev.maratonajava.exercicios.exercicio23.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio23.dominio.Produto;

public class exercicio23Test {
    public static void main(String[] args) {
        Produto[] produtos = {
                new Produto("Labubu",99.90,20),
                new Produto("Morango do amor",18.90,10),
                new Produto("Bobie Goodies",9.90,35),
                new Produto("Ovo pistache",79.90,70)
        };

        produtos[0].adicionarEstoque(20);
        produtos[1].removerEstoque(5);
        produtos[2].adicionarEstoque(5);
        produtos[3].removerEstoque(20);
        for (Produto p : produtos){

            p.imprime();
            System.out.println("Valor total do estoque: "+p.getPreco() * p.getQuantidade());
        }
    }
}
