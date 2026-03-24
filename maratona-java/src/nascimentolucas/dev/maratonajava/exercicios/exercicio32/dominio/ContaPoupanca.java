package nascimentolucas.dev.maratonajava.exercicios.exercicio32.dominio;

public class ContaPoupanca extends Conta implements SaldoTotal{
    private double taxaRendimento;

    public ContaPoupanca(String titulo, double saldo, double taxaRendimento) {
        super(titulo, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }


    @Override
    public double getSaldoTotal() {
        return getSaldo() * taxaRendimento;
    }

    public void imprimeContaPoupanca(){
        System.out.println("Nome Titular: "+getTitulo());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Taxa de rendimeno: "+getTaxaRendimento());
        System.out.println("Saldo Total: "+getSaldoTotal());
    }
}
