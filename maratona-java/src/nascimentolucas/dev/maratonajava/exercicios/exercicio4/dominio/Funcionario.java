package nascimentolucas.dev.maratonajava.exercicios.exercicio4.dominio;

public class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
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

    public double calcularBonus() {
        double bonus = salario * 0.10;
        return bonus;
    }

    public void imprime(){
        System.out.println("Funcionario: "+getNome()+"\nRemuneração: "+getSalario()+"\nBônus: "+calcularBonus());
    }
}
