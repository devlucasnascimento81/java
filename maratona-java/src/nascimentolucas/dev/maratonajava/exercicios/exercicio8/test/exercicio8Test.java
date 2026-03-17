package nascimentolucas.dev.maratonajava.exercicios.exercicio8.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio8.dominio.Aluno;

public class exercicio8Test {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("hinata",6);
        Aluno a2 = new Aluno("Kageyama",9);
        a1.aprovado();
        a2.aprovado();
        a1.imprimir();
        a2.imprimir();

    }
}
