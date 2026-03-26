package nascimentolucas.dev.maratonajava.exercicios.exercicio36.dominio;

public class Livro {
    private String titulo;
    private String autor;
    private boolean disponivel = true;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void emprestar(){
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        disponivel = true;
    }

    public void imprime(){
        System.out.println("Título do livro: "+getTitulo());
        System.out.println("Nome do autor: "+getAutor());
        if (disponivel){
            System.out.println("Está disponível!");

        }else {
            System.out.println("Livro indisponível :(");
        }

        System.out.println("\n");
    }
}
