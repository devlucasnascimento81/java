package nascimentolucas.dev.maratonajava.javacore.Hheranca.test;

import nascimentolucas.dev.maratonajava.javacore.Hheranca.dominio.Endereco;
import nascimentolucas.dev.maratonajava.javacore.Hheranca.dominio.Funcionario;
import nascimentolucas.dev.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua são josé");
        endereco.setCep("55636-000");
        Pessoa pessoa = new Pessoa("Perna Longa");
        pessoa.setCpf("176.254.554-09");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        System.out.println("------------------------");
        System.out.println("## Funcionário ## ");

        Funcionario funcionario = new Funcionario("Patolino");
        funcionario.setCpf("324.578.696-00");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(1650.00);

        funcionario.imprime();


    }
}
