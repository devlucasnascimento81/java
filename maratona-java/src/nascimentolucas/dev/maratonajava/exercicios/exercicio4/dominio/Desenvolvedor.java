package nascimentolucas.dev.maratonajava.exercicios.exercicio4.dominio;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        double bonus = getSalario() * 0.15;
        return bonus;
    }
}
