package nascimentolucas.dev.maratonajava.exercicios.exercicio40.test;


import nascimentolucas.dev.maratonajava.exercicios.exercicio40.dominio.Guerreiro;
import nascimentolucas.dev.maratonajava.exercicios.exercicio40.dominio.Mago;

public class exercicio40Test {
    public static void main(String[] args) {
        Guerreiro guerreiro = new Guerreiro("guts",2000,200);
        Mago mago = new Mago("Yuno", 1500,300);

        guerreiro.imprime();
        mago.imprime();

        mago.atacar(guerreiro);
        mago.imprimeAtaque();

        guerreiro.imprimeAlvo();

        mago.ataqueEspecial();
        mago.imprimeAtqEspecial();
        mago.atacar(guerreiro);
        mago.imprimeAtaque();

        guerreiro.imprimeAlvo();
        guerreiro.modoBeserker();
        guerreiro.imprimeModoBeserker();
        guerreiro.imprimeAtaque();
        guerreiro.atacar(mago);

        mago.imprimeAlvo();

        guerreiro.modoBeserker();
        guerreiro.imprimeModoBeserker();
        guerreiro.imprimeAtaque();
        guerreiro.atacar(mago);

        mago.imprimeAlvo();
        mago.morteAlvo();
    }
}
