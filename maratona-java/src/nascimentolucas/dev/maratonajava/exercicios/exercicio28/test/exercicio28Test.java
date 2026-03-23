package nascimentolucas.dev.maratonajava.exercicios.exercicio28.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio28.dominio.Partida;

public class exercicio28Test {
    public static void main(String[] args) {
        Partida[] partidas = {
            new Partida("Corinthians","Palmeiras",4,2),
            new Partida("Barcelona","Real Madrid",3,3),
            new Partida("Santa Cruz","Sport",1,2),
            new Partida("Boca Juniors","River Plate",1,1)
        };
        for (Partida p : partidas){
            p.imprime();
        }
    }
}
