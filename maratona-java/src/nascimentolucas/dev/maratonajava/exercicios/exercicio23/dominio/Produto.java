package nascimentolucas.dev.maratonajava.exercicios.exercicio23.dominio;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
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

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int adicionarEstoque(int qtd){
        return quantidade += qtd;
    }

    public int removerEstoque(int qtd){
        if (quantidade >= qtd) return quantidade -= qtd;
        else return quantidade;
    }

    public void imprime(){
        System.out.println("Nome do produto: "+getNome());
        System.out.println("Preço: "+getPreco());
        System.out.println("Quantidade: "+getQuantidade());

    }

}
