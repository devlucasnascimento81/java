package nascimentolucas.dev.maratonajava.exercicios.exercicio55.domain;

public class Produto {
    private String nome;
    private double preco;
    private TipoDesconto tipoDesconto;

    public Produto(String nome, double preco, TipoDesconto tipoDesconto) {
        this.nome = nome;
        this.preco = preco;
        this.tipoDesconto = tipoDesconto;
    }

    public TipoDesconto getTipoDesconto() {
        return tipoDesconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getPreecoFinal() {
        return switch (tipoDesconto) {
            case NENHUM -> preco;
            case BRONZE -> preco * 0.95;
            case PRATA -> preco * 0.90;
            case OURO -> preco * 0.85;
        };
    }
}
