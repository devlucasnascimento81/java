package nascimentolucas.dev.maratonajava.exercicios.exercicio1.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio1.dominio.Carro;

public class exercicio1Test {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Ford","Mustang",2002);
        Carro carro2 = new Carro("Bmw","m3",2004);

        carro1.imprimir();
        carro2.imprimir();
    }
}
