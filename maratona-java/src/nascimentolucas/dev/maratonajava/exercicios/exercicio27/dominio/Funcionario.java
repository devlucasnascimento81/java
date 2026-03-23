package nascimentolucas.dev.maratonajava.exercicios.exercicio27.dominio;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void imprime(){
        System.out.println("Funcionario: "+getNome());
        System.out.println(("Salario base: "+getSalarioBase()));
    }
}
