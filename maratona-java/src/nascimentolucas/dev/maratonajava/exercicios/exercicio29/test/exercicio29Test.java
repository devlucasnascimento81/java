package nascimentolucas.dev.maratonajava.exercicios.exercicio29.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio29.dominio.CategoriaCliente;
import nascimentolucas.dev.maratonajava.exercicios.exercicio29.dominio.Cliente;

public class exercicio29Test {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Miguel", CategoriaCliente.COMUM);
        Cliente cliente2 = new Cliente("João",CategoriaCliente.PREMIUM);
        Cliente cliente3 = new Cliente("Pedro",CategoriaCliente.VIP);

        double valorFinal = 500 - (500 * cliente1.getDesconto());
        double valorFinal1 = 500 - (500 * cliente2.getDesconto());
        double valorFinal2 = 500 - (500 * cliente3.getDesconto());

        cliente1.imprime();
        System.out.println("Valor final: "+valorFinal);

        System.out.println("\n");

        cliente2.imprime();
        System.out.println("Valor final: "+valorFinal1);

        System.out.println("\n");

        cliente3.imprime();
        System.out.println("Valor final: "+valorFinal2);

    }
}
