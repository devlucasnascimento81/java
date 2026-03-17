package nascimentolucas.dev.maratonajava.exercicios.exercicio12.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio12.dominio.*;

public class exercicio12Test {
    public static void main(String[] args) {
        Transporte[] transportes = {
                new Bike(),
                new Carro(TipoCombustivel.HIBRIDO),
                new Moto(TipoCombustivel.GASOLINA)
        };
        for (Transporte t : transportes){
            t.mover();
        }
    }


}
