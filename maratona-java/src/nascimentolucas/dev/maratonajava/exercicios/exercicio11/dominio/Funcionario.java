package nascimentolucas.dev.maratonajava.exercicios.exercicio11.dominio;


public class Funcionario {
    private String nome;
    private double salario;
    NivelAcesso nivel;

    public Funcionario(String nome, double salario, NivelAcesso nivel) {
        this.nome = nome;
        this.salario = salario;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelAcesso nivel) {
        this.nivel = nivel;
    }

    public void imprime(){
        System.out.println("Funcionario: "+getNome()+"\nNivel: "+getNivel()+"\nSalario: "+getSalario());
    }
}
