package nascimentolucas.dev.maratonajava.exercicios.exercicio5.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio5.dominio.Arqueiro;
import nascimentolucas.dev.maratonajava.exercicios.exercicio5.dominio.Guerreiro;
import nascimentolucas.dev.maratonajava.exercicios.exercicio5.dominio.Mago;
import nascimentolucas.dev.maratonajava.exercicios.exercicio5.dominio.TipoPersonagem;

public class exercicio5Test {
    public static void main(String[] args) {
        Guerreiro g = new Guerreiro("guts",300, TipoPersonagem.GUERREIRO);
        Mago m = new Mago("Gandalf",200,TipoPersonagem.MAGO);
        Arqueiro a = new Arqueiro("Frank", 180,TipoPersonagem.ARQUEIRO);
        g.imprimirStatus();
        m.imprimirStatus();
        a.imprimirStatus();
    }
}
