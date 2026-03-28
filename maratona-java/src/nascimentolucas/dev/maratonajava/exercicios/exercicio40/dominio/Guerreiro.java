package nascimentolucas.dev.maratonajava.exercicios.exercicio40.dominio;

public class Guerreiro extends Personagem{
    private double armaduraBeserker;

    public Guerreiro(String nome, double vida, double ataque) {
        super(nome, vida, ataque);
        this.armaduraBeserker = 500;
    }

    public void modoBeserker(){
        setAtaque(getAtaque() + this.armaduraBeserker);
    }

    public void imprimeModoBeserker(){
        System.out.println(getNome()+" Ativou modo beserker");
        System.out.println(getNome()+" Aumentou o poder de ataque!");
    }

    @Override
    public void atacar(Personagem alvo) {
        alvo.setVida(alvo.getVida() - getAtaque());
    }

}
