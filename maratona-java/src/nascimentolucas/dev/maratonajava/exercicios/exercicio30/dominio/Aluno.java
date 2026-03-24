package nascimentolucas.dev.maratonajava.exercicios.exercicio30.dominio;

import java.util.Arrays;

public class Aluno implements  Avaliavel{
    private String nome;
    private double[] notas;

    public Aluno(String nome, double[] notas) {
        this.nome = nome;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public double[] getNotas() {
        return notas;
    }

    @Override
    public double getMedia() {
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }

    public void imprime(){
        System.out.println("Aluno: "+getNome());
        System.out.println("Boletim: "+ Arrays.toString(notas));
        if (getMedia() >= 7){
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }
}
