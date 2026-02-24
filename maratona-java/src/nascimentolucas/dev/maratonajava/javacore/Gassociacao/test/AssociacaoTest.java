package nascimentolucas.dev.maratonajava.javacore.Gassociacao.test;

import nascimentolucas.dev.maratonajava.javacore.Gassociacao.domino.Aluno;
import nascimentolucas.dev.maratonajava.javacore.Gassociacao.domino.Local;
import nascimentolucas.dev.maratonajava.javacore.Gassociacao.domino.Professor;
import nascimentolucas.dev.maratonajava.javacore.Gassociacao.domino.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua xx de novembro");
        Aluno aluno = new Aluno("Sasuke Uchiha", 16);
        Professor professor = new Professor("Orochimaru", "Sábio");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("Imortalidade", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
