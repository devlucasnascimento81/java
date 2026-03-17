package nascimentolucas.dev.maratonajava.exercicios.exercicio3.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio3.dominio.Aluno;
import nascimentolucas.dev.maratonajava.exercicios.exercicio3.dominio.Turma;

public class exercicio3Test {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("RockLee",13);
        Aluno a2 = new Aluno("Neji hyuga",14);
        Aluno a3 = new Aluno("Tenten",12);

        Aluno[] alunos = {a1, a2, a3};

        Turma turma1 = new Turma("3º ano B", alunos);


        turma1.imprimirAlunos();

    }
}
