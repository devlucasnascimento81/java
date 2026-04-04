package nascimentolucas.dev.maratonajava.exercicios.exercicio51.dominio;

public abstract class Forma {

    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract double getArea();

    public void descricao(){
        System.out.println("Nome da forma: "+getNome());
        System.out.println("Área calculada: "+getArea());
        System.out.println("\n");
    }
}
