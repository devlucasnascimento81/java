package nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.test;

import nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.setNome("Menphis");
        funcionario01.setIdade(23);
        funcionario01.setSalarios(new double[]{1200, 900.90, 3333});

        funcionario01.imprime();
        System.out.println("Média " + funcionario01.getMedia());


    }
}
