package nascimentolucas.dev.maratonajava.exercicios.exercicio34.dominio;

public final class Funcionario {
    private final String cpf;
    private String nome;
    private double salario;

    public Funcionario(String cpf, String nome, double salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
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

    public void imprime(){
        System.out.println("Nome do funcionário: "+getNome());
        System.out.println("CPF: "+getCpf());
        System.out.println("Salário: "+getSalario());
    }
}
