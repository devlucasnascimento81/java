package nascimentolucas.dev.maratonajava.javacore.Jmodificadorfinal.test;

import nascimentolucas.dev.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import nascimentolucas.dev.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;
import nascimentolucas.dev.maratonajava.javacore.Jmodificadorfinal.dominio.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        carro.COMPRADOR.setNome("patolino");
        System.out.println(carro.COMPRADOR);

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("f50 spyder");
        ferrari.imprime();
    }
}
