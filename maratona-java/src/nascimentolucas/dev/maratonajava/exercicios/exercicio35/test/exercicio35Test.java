package nascimentolucas.dev.maratonajava.exercicios.exercicio35.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio35.dominio.Caminhao;
import nascimentolucas.dev.maratonajava.exercicios.exercicio35.dominio.Navio;

public class exercicio35Test {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao(3000,500);
        Navio navio = new Navio(60000,20000);

        caminhao.imprimeCaminhao();

        caminhao.carregar(1000);
        System.out.println("Caminhão foi carregado!");
        System.out.println("Carga atual: "+caminhao.getCargaAtual()+" Kgs");

        System.out.println("\n");

        navio.imprimeNavio();

        navio.carregar(10000);
        System.out.println("Navio foi carregado!");
        System.out.println("Carga atual registrada: "+navio.getCargaAtual()+" KGs");

        System.out.println("\n");

        navio.descarregar(500);
        System.out.println("Navio foi descarregado!");
        System.out.println("Carga atual registrada: "+navio.getCargaAtual()+" KGs");



    }
}
