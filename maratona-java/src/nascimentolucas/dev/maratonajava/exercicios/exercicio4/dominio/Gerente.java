package nascimentolucas.dev.maratonajava.exercicios.exercicio4.dominio;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }


    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 0.20;
        return bonus;
    }
}
