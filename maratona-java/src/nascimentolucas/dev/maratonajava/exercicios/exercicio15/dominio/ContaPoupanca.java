package nascimentolucas.dev.maratonajava.exercicios.exercicio15.dominio;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numeroConta, String titular, double saldo, TipoConta tipo) {
        super(numeroConta, titular, saldo, tipo);
    }

    public void renderJuros(){
        double novoSaldo = getSaldo() * 1.02;
        setSaldo(novoSaldo);
        System.out.println("Saldo atualizado: "+novoSaldo);

    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }
}
