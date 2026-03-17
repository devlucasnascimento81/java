package nascimentolucas.dev.maratonajava.exercicios.exercicio3.dominio;

import java.util.Arrays;

public class Turma {
    private String nomeTurma;
    private Aluno[] alunos;

    public Turma(String nomeTurma, Aluno[] alunos) {
        this.nomeTurma = nomeTurma;
        this.alunos = alunos;
    }

    public void imprimirAlunos(){
        System.out.println(nomeTurma);
        for (Aluno aluno : alunos) {
            aluno.imprimir();
        }
    }

}
