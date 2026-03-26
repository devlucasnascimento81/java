package nascimentolucas.dev.maratonajava.exercicios.exercicio36.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio36.dominio.Livro;

public class exercicio36Test {
    public static void main(String[] args) {
        Livro[] livros = {
                new Livro("o incrivel  james markster","James markster"),
                new Livro("Um novo mundo","Lucão"),
                new Livro("Jardim dos amassos vol 2","Jiraya"),
                new Livro("Fusca amarelo","desconhecido?")
        };

        Livro livro1 = livros[0];
        livro1.emprestar();
        Livro livro2 = livros[2];
        livro2.emprestar();

        for (Livro l : livros){
            l.imprime();
        }

    }
}
