package nascimentolucas.dev.maratonajava.exercicios.exercicio17.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio17.dominio.ContaBancaria;

public class exercicio17Test {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("julio foolio",100.000);
        ContaBancaria conta2 = new ContaBancaria("Alfredo Santana",80.000);

        conta1.imprime();
        System.out.println("----------------------");
        conta1.sacar(30.000);
        System.out.println("Saque realizado!");
        System.out.println("Saldo atual: "+conta1.getSaldo());

        System.out.println("----------------------");
        conta2.imprime();
        System.out.println("----------------------");
        conta2.depositar(50.000);
        System.out.println("Deposito realizado!");
        System.out.println("Saldo atual: "+conta2.getSaldo());


    }
}
