package nascimentolucas.dev.maratonajava.exercicios.exercicio19.dominio;

public class Funcionario {
    private String nome;
    private Cargo cargo;

    public Funcionario(String nome, Cargo cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public double getSalarioBase() {
        return switch (cargo){
            case JUNIOR -> 3000;
            case PLENO -> 6000;
            case SENIOR -> 10000;
        };
    }

    public void imprime(){
        System.out.println("Funcionario: "+getNome());
        System.out.println("Cargo: "+getCargo());
        System.out.println("Salario: "+getSalarioBase());
    }
}
