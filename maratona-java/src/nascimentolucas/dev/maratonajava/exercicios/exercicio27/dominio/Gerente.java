package nascimentolucas.dev.maratonajava.exercicios.exercicio27.dominio;

public class Gerente extends Funcionario implements SalarioTotal {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getSalarioTotal() {
        return getSalarioBase() + bonus;
    }
}
