package nascimentolucas.dev.maratonajava.exercicios.exercicio9.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio9.dominio.Aluno;

public class exercicio9test {
    public static void main(String[] args) {
        Aluno[] alunos = {
                new Aluno("yuji",6),
                new Aluno("megumi",9)
        };
        for (Aluno n : alunos){
            n.imprime();
        }


    }
}
