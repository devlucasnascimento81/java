package nascimentolucas.dev.maratonajava.exercicios.exercicio29.dominio;

public class Cliente {
    private String nome;
    private CategoriaCliente categoriaCliente;

    public Cliente(String nome, CategoriaCliente categoriaCliente) {
        this.nome = nome;
        this.categoriaCliente = categoriaCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaCliente getCategoriaCliente() {
        return categoriaCliente;
    }

    public void setCategoriaCliente(CategoriaCliente categoriaCliente) {
        this.categoriaCliente = categoriaCliente;
    }

    public double getDesconto(){
        return switch (categoriaCliente) {
            case COMUM -> 0.05;
            case PREMIUM -> 0.10;
            case VIP -> 0.15;
        };
    }

    public void imprime(){
        System.out.println("Nome cliente: "+getNome());
        System.out.println("Categoria: "+getCategoriaCliente());
        System.out.println("Desconto garantido: "+getDesconto());
    }
}
