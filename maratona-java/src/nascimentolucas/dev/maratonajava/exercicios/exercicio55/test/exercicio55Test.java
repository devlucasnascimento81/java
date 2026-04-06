package nascimentolucas.dev.maratonajava.exercicios.exercicio55.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio55.domain.Carrinho;
import nascimentolucas.dev.maratonajava.exercicios.exercicio55.domain.Produto;
import nascimentolucas.dev.maratonajava.exercicios.exercicio55.domain.TipoDesconto;

public class exercicio55Test {
    public static void main(String[] args) {
        Produto[] produtos = {
                new Produto("capinha celular",15,TipoDesconto.PRATA),
                new Produto("jogo de copos",29.90,TipoDesconto.OURO),
                new Produto("jogo de facas",49.90,TipoDesconto.NENHUM),
                new Produto("camisa treino",38.80,TipoDesconto.PRATA),
                new Produto("maçarico chef",22.90,TipoDesconto.BRONZE),
                new Produto("óculos de sol",38.90, TipoDesconto.NENHUM)
        };

        Carrinho carrinho =  new Carrinho(produtos);

        for (Produto produto : carrinho.getProdutos()){
            System.out.println("Produto: "+produto.getNome());
            System.out.println("Preço: "+ produto.getPreco());
            if ( produto.getTipoDesconto() == TipoDesconto.NENHUM){
                System.out.println("Sem cupom de desconto :(");
            } else {
                System.out.println("Cupom aplicado!");

            }
            System.out.println("Preço final: "+produto.getPreecoFinal());
            System.out.println("----------------------------------");
        }

        System.out.println("total: "+carrinho.getTotal());

    }
}
