package nascimentolucas.dev.maratonajava.exercicios.exercicio15.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio15.dominio.Conta;
import nascimentolucas.dev.maratonajava.exercicios.exercicio15.dominio.ContaCorrente;
import nascimentolucas.dev.maratonajava.exercicios.exercicio15.dominio.ContaPoupanca;
import nascimentolucas.dev.maratonajava.exercicios.exercicio15.dominio.TipoConta;

public class exercicio15Test {
    public static void main(String[] args) {
        Conta[] contas = {
                new ContaPoupanca(63739, "patolino", 1000, TipoConta.POUPANCA),
                new ContaCorrente(87278, "Perna Longa", 20000, TipoConta.CORRENTE),
                new ContaCorrente(28003, "Gaguinho", 600, TipoConta.CORRENTE)
        };
        for (Conta c : contas) {
            if (c.getTipo() == TipoConta.POUPANCA) {
                ContaPoupanca cp = (ContaPoupanca) c;
                cp.depositar(2000);
                cp.renderJuros();
            } else {
                c.depositar(100);
                c.sacar(60);

            }
        }
    }
}
