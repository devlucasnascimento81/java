package nascimentolucas.dev.maratonajava.exercicios.exercicio26.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio26.dominio.Livro;

public class exercicio26Test {
    public static void main(String[] args) {
        Livro[] livros = {
                new Livro("A metamorfose","Franz Kafka",1915),
                new Livro("Carta ao pai","Franz Kafka",1919),
                new Livro("Código limpo","Cecil martin",2008),
                new Livro("+ esperto que o diabo","Napoleon hill",2011),
                new Livro("A lei do triunfo","Napoleon hill",1928)
        };
        String autorBuscado  = "hitler";

        boolean encontrou = false;
        for (Livro l : livros){
            if(l.getAutor().equals(autorBuscado)){
                encontrou = true;
                l.imprime();
            }
        }

        if (!encontrou){
            System.out.println("Nenhum livro encontrado!");
        }

    }
}
