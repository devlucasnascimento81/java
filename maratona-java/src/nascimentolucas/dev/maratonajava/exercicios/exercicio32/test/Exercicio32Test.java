package nascimentolucas.dev.maratonajava.exercicios.exercicio32.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio32.dominio.ContaCorrente;
import nascimentolucas.dev.maratonajava.exercicios.exercicio32.dominio.ContaPoupanca;

public class Exercicio32Test {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente("Patolino",30000,5000);
        ContaPoupanca contaPoupanca = new ContaPoupanca("Gaguinho",2000,1.2);

        contaCorrente.imprimeContaCorrente();
        System.out.println("\n");
        contaPoupanca.imprimeContaPoupanca();

    }
}
