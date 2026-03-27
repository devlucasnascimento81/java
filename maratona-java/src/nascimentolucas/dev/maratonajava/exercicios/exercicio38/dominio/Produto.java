package nascimentolucas.dev.maratonajava.exercicios.exercicio38.dominio;

public class Produto {
    private String nome;
    private double preco;
    TipoProduto tipoProduto;

    public Produto(String nome, double preco, TipoProduto tipoProduto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoProduto = tipoProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoProduto getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(TipoProduto tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public double getImpostoTotal() {
        return switch (tipoProduto) {
            case VEICULO -> preco * 0.40;
            case ALIMENTO -> preco * 0.07;
            case ELETRONICO -> preco * 0.30;
        };
    }

    public void imprime() {
        System.out.println("Tipo do produto: " + getTipoProduto());
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Imposto a pagar: " + getImpostoTotal());
        System.out.println("Preço final: " + (getPreco() + getImpostoTotal()));
        System.out.println("\n");
    }
}
