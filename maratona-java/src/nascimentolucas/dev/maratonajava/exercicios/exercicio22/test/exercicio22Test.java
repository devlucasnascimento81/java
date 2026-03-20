package nascimentolucas.dev.maratonajava.exercicios.exercicio22.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio22.dominio.Carro;
import nascimentolucas.dev.maratonajava.exercicios.exercicio22.dominio.Moto;
import nascimentolucas.dev.maratonajava.exercicios.exercicio22.dominio.Veiculo;

public class exercicio22Test {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
                new Carro("Mercedes", "maybach",220,4),
                new Moto("Honda","hornet",210,600)
        };
        for (Veiculo v : veiculos){
            v.descricao();
        }
    }



}
