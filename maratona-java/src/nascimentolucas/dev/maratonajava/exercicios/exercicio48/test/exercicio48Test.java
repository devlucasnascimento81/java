package nascimentolucas.dev.maratonajava.exercicios.exercicio48.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio48.domain.Caminhao;
import nascimentolucas.dev.maratonajava.exercicios.exercicio48.domain.Carro;
import nascimentolucas.dev.maratonajava.exercicios.exercicio48.domain.Moto;
import nascimentolucas.dev.maratonajava.exercicios.exercicio48.domain.Veiculo;

public class exercicio48Test {
    public static void main(String[] args) {
        Veiculo[] veiculos = {
                new Carro("Astra",280,"prata"),
                new Moto("Bmw Gs",220,1200),
                new Caminhao("Mercedinha",180,4)
        };
        for (Veiculo v : veiculos){
            v.descricao();
            System.out.println("\n");
        }
    }
}
