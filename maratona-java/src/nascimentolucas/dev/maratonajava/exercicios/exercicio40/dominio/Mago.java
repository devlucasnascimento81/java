package nascimentolucas.dev.maratonajava.exercicios.exercicio40.dominio;

public class Mago extends Personagem{
    private double tufao;

    public Mago(String nome, double vida, double ataque) {
        super(nome, vida, ataque);
        this.tufao = 300;
    }

    public void ataqueEspecial(){
        setAtaque(getAtaque() + this.tufao);
    }

    public void imprimeAtqEspecial(){
        System.out.println(getNome()+" Usou ataque especial");
        System.out.println(getNome()+" Aumentou o poder de ataque!");

    }

    @Override
    public void atacar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - getAtaque());
    }


}
