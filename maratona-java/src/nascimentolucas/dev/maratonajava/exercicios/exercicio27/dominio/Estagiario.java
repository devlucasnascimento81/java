package nascimentolucas.dev.maratonajava.exercicios.exercicio27.dominio;

public class Estagiario extends Funcionario implements SalarioTotal{
    private double bolsaAuxilio;

    public Estagiario(String nome, double salarioBase, double bolsaAuxilio) {
        super(nome, salarioBase);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double getSalarioTotal() {
        return bolsaAuxilio ;
    }
}
