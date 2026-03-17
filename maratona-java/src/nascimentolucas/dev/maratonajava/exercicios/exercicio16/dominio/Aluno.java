package nascimentolucas.dev.maratonajava.exercicios.exercicio16.dominio;

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



    public String conceito() {
        if (nota >= 9) return "A";
        if (nota >= 7) return "B";
        if (nota >= 5) return "C";
        return "D";
    }

    public void imprime() {
        System.out.println("Aluno: " + getNome() + " Nota: " + getNota()+" Conceito: "+conceito());
    }
}
