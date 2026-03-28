package nascimentolucas.dev.maratonajava.exercicios.exercicio40.dominio;

public abstract class Personagem {
    private String nome;
    private double vida;
    private double ataque;

    public Personagem(String nome, double vida, double ataque) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
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

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public abstract void atacar(Personagem alvo);

    public void morteAlvo(){
        if (getVida() <= 0){
            System.out.println(getNome()+" está fora de combate!");
        }
    }

    public void imprimeAtaque(){
        System.out.println(getNome()+" Iniciou o ataque!");
        System.out.println("Poder de ataque: "+getAtaque());
        System.out.println("\n");
    }

    public void imprimeAlvo(){
        System.out.println(getNome()+" Sofreu ataque!");
        System.out.println("Vitalidade atual: "+getVida());
        System.out.println("\n");
    }

    public void imprime(){
        System.out.println("Nome do personagem: "+getNome());
        System.out.println("Vitalidade: "+getVida());
        System.out.println("Poder de ataque: "+getAtaque());
        System.out.println("\n");
    }
}
