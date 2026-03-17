package nascimentolucas.dev.maratonajava.exercicios.exercicio15.dominio;

public class ContaCorrente extends Conta{
    public ContaCorrente(int numeroConta, String titular, double saldo, TipoConta tipo) {
        super(numeroConta, titular, saldo, tipo);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        valor += 2;
        super.sacar(valor);
        System.out.println("Taxa de saque: 2.00");
    }
}
