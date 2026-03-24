package nascimentolucas.dev.maratonajava.exercicios.exercicio30.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio30.dominio.Aluno;

public class exercicio30Test {
    public static void main(String[] args) {
        Aluno[] alunos = {
                new Aluno("Rafael soares",new double[]{7,3.5,6.5,5.5}),
                new Aluno("Daniel silva", new double[]{8.5,9,7.5,8}),
                new Aluno("Joel jr", new double[]{9.5,10,9,8.5})
        };
        for (Aluno a : alunos){
            a.imprime();
        }
    }
}
