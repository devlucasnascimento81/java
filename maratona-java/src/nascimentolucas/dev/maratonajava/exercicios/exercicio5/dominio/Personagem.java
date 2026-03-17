package nascimentolucas.dev.maratonajava.exercicios.exercicio5.dominio;

public abstract class Personagem {
    private String nome;
    private double vida;
    private TipoPersonagem tipoPersonagem;


    public Personagem(String nome, double vida, TipoPersonagem tipoPersonagem) {
        this.nome = nome;
        this.vida = vida;
        this.tipoPersonagem = tipoPersonagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public TipoPersonagem getTipoPersonagem() {
        return tipoPersonagem;
    }

    public void setTipoPersonagem(TipoPersonagem tipoPersonagem) {
        this.tipoPersonagem = tipoPersonagem;
    }

    public abstract double atacar();

    public void imprimirStatus(){
        System.out.println("Personagem: "+getNome()+"\nVida: "+getVida()+"\nTipo: "+getTipoPersonagem()+"\nAtaque: "+atacar());

        }

}
