package nascimentolucas.dev.maratonajava.exercicios.exercicio37.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio37.dominio.Carro;
import nascimentolucas.dev.maratonajava.exercicios.exercicio37.dominio.Moto;

public class exercicio37Test {
    public static void main(String[] args) {
        Carro carro = new Carro(0,220);
        Moto moto = new Moto(20,190);

        carro.imprimeCarro();
        carro.acelerar(120);
        carro.imprimeCarro();
        carro.freiar(30);
        carro.imprimeCarro();

        moto.imprimeMoto();
        moto.acelerar(80);
        moto.imprimeMoto();
        moto.freiar(10);
        moto.imprimeMoto();
    }
}
