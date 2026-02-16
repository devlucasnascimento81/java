package nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.test;

import nascimentolucas.dev.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("jiraya");
        pessoa.setIdade(46);

        pessoa.imprime();
//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());
    }
}
