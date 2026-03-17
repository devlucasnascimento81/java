package nascimentolucas.dev.maratonajava.exercicios.exercicio3.dominio;

public class Aluno {
    public String nome;
    public int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprimir(){
        System.out.println("Aluno: "+nome+"\nIdade: "+idade);
    }
}
