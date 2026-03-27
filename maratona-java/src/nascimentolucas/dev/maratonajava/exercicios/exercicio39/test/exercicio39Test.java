package nascimentolucas.dev.maratonajava.exercicios.exercicio39.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio39.dominio.Aluno;
import nascimentolucas.dev.maratonajava.exercicios.exercicio39.dominio.Professor;

public class exercicio39Test {
    public static void main(String[] args) {
        Professor professor = new Professor("Girafales");

        professor.adicionarAlunos(new Aluno("Chiquinha"));
        professor.adicionarAlunos(new Aluno("kiko"));
        professor.adicionarAlunos(new Aluno("chaves"));
        professor.adicionarAlunos(new Aluno("ñoño"));

        professor.imprime();
    }
}
