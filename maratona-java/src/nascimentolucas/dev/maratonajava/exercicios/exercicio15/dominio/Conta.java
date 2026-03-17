package nascimentolucas.dev.maratonajava.exercicios.exercicio15.dominio;

public class Conta implements OperacaoBancaria{
    private int  numeroConta;
    private  String titular;
    private double saldo;
    private TipoConta tipo;

    public Conta(int numeroConta, String titular, double saldo, TipoConta tipo) {

        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.tipo = tipo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public TipoConta getTipo() {
        return tipo;
    }

    public void setTipo(TipoConta tipo) {
        this.tipo = tipo;
    }



    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Deposito realizado: "+valor);
        System.out.println("Saldo atual: "+getSaldo());
    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque realizado: "+valor);
            System.out.println("Saldo atual: "+getSaldo());
        }else System.out.println("Saldo insuficiente.");
    }
}
