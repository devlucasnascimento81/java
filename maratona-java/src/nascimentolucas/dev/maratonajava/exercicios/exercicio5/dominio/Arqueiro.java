package nascimentolucas.dev.maratonajava.exercicios.exercicio5.dominio;

public class Arqueiro extends Personagem implements Atacavel {
    public Arqueiro(String nome, double vida, TipoPersonagem tipoPersonagem) {
        super(nome, vida, TipoPersonagem.ARQUEIRO);
    }

    @Override
    public double atacar() {
        return 18;
    }
}
