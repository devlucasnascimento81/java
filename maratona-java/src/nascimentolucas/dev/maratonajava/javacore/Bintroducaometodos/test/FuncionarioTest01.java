package nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.test;

import nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome = "Menphis";
        funcionario01.idade = 28;
        funcionario01.salarios = new double[]{1200, 987.32, 2000};

        funcionario01.imprime();


    }
}
