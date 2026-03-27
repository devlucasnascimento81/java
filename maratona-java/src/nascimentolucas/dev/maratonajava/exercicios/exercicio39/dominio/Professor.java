package nascimentolucas.dev.maratonajava.exercicios.exercicio39.dominio;

public class Professor {
    private String nome;
    private Aluno[] alunos;
    private int totalAlunos;

    public Professor(String nome) {
        this.nome = nome;
        this.alunos = new Aluno[3];
        this.totalAlunos = 0;
    }

    public void adicionarAlunos(Aluno aluno){
        if (totalAlunos < 3){
            alunos[totalAlunos] = aluno;
            totalAlunos ++;
        }
    }

    public void imprime(){
        System.out.println("Professor: "+this.nome);
        for (Aluno a : alunos){
            System.out.println("Aluno: "+a.getNomeAluno());
        }
    }
}
