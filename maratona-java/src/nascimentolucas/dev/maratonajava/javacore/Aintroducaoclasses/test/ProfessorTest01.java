package nascimentolucas.dev.maratonajava.javacore.Aintroducaoclasses.test;

import nascimentolucas.dev.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Satoru Gojo";
        professor.idade = 30;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);

    }
}
