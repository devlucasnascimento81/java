package nascimentolucas.dev.maratonajava.exercicios.exercicio32.dominio;

public class ContaCorrente extends Conta implements SaldoTotal{
    private double limteChequeEspecial;

    public ContaCorrente(String titulo, double saldo, double limteChequeEspecial) {
        super(titulo, saldo);
        this.limteChequeEspecial = limteChequeEspecial;
    }

    public double getLimteChequeEspecial() {
        return limteChequeEspecial;
    }

    @Override
    public double getSaldoTotal() {
        return getSaldo() + limteChequeEspecial;
    }

    public void imprimeContaCorrente(){
        System.out.println("Nome Titular: "+getTitulo());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Limite cheque especial: "+getLimteChequeEspecial());
        System.out.println("Saldo Total: "+getSaldoTotal());
    }
}
