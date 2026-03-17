package nascimentolucas.dev.maratonajava.exercicios.exercicio5.dominio;

public class Mago extends Personagem implements Atacavel {
    public Mago(String nome, double vida, TipoPersonagem tipoPersonagem) {
        super(nome, vida, TipoPersonagem.MAGO);
    }

    @Override
    public double atacar() {
        return 40;
    }
}

