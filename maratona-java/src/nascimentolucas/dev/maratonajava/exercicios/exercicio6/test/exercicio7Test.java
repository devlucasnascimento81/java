package nascimentolucas.dev.maratonajava.exercicios.exercicio6.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio6.dominio.Livro;

public class exercicio7Test {
    public static void main(String[] args) {
        Livro[] livros = {
                new Livro("A metamorfose","Franz Kafka",200),
                new Livro("Nada pode me parar","David goggins",250),
                new Livro("O principe","Maquiavel",190)
        };
        for (Livro l : livros) {
             l.imprimirInfo();
        }
    }
}
