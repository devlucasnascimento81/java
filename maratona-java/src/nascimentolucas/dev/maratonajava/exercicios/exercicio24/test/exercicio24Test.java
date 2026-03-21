package nascimentolucas.dev.maratonajava.exercicios.exercicio24.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio24.dominio.DiaSemana;

public class exercicio24Test {
    public static void main(String[] args) {
        for (DiaSemana dia : DiaSemana.values()) {
            if (dia.isFimDeSemana()) {
                System.out.println(dia+" É fim de semana!");
            }  else {
                System.out.println(dia+" É dia útil!");
            }
        }
    }
}
