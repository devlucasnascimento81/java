package nascimentolucas.dev.maratonajava.exercicios.exercicio8.dominio;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean aprovado(){
        return nota >= 7;
    }

    public void imprimir(){
        System.out.println("Nome: "+getNome()+"\nNota: "+getNota());
        System.out.println("Status do aluno: "+(aprovado() ? "Aprovado" : "Reprovado"));
    }
}
