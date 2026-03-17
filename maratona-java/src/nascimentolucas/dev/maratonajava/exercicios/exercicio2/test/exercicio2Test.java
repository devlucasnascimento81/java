package nascimentolucas.dev.maratonajava.exercicios.exercicio2.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio2.dominio.ContaBancaria;

public class exercicio2Test {
    public static void main(String[] args) {
        ContaBancaria clienteA = new ContaBancaria("josefino",1600);
        clienteA.depositar(100);
        clienteA.sacar(300);
        clienteA.imprimirSaldo();
    }
}
