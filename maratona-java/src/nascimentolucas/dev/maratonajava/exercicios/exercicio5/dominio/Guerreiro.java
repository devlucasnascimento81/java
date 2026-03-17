package nascimentolucas.dev.maratonajava.exercicios.exercicio5.dominio;

public class Guerreiro extends Personagem implements Atacavel{

    public Guerreiro(String nome, double vida, TipoPersonagem tipoPersonagem) {
        super(nome, vida, TipoPersonagem.GUERREIRO);
    }

    @Override
    public double atacar() {
        return 25;
    }
}
