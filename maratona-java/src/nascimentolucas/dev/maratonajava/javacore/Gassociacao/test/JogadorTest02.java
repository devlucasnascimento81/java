package nascimentolucas.dev.maratonajava.javacore.Gassociacao.test;

import nascimentolucas.dev.maratonajava.javacore.Gassociacao.domino.Jogador;
import nascimentolucas.dev.maratonajava.javacore.Gassociacao.domino.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1  = new Jogador("Neymar");
        Time time = new Time("CBF");


        jogador1.imprime();
    }
}
