package nascimentolucas.dev.maratonajava.exercicios.exercicio55.domain;

public class Carrinho {
    private Produto[] produtos;

    public Carrinho(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public double getTotal(){
        double total = 0;
        for (Produto p : produtos){
            total += p.getPreecoFinal();
        }
        return total;
    }

}
