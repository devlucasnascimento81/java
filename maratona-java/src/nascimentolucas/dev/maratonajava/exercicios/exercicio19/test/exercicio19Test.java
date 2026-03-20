package nascimentolucas.dev.maratonajava.exercicios.exercicio19.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio19.dominio.Cargo;
import nascimentolucas.dev.maratonajava.exercicios.exercicio19.dominio.Funcionario;

public class exercicio19Test {
    public static void main(String[] args) {
        Funcionario[] funcionarios = {
                new Funcionario("jhon snow", Cargo.PLENO),
                new Funcionario("Denerys",Cargo.SENIOR),
                new Funcionario("Sansa",Cargo.JUNIOR)
        };
        for (Funcionario f : funcionarios){
            f.imprime();
        }
    }
}
