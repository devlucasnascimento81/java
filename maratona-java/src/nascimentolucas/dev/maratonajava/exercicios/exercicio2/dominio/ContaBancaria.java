package nascimentolucas.dev.maratonajava.exercicios.exercicio2.dominio;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        saldo -= valor;
    }

    public void imprimirSaldo(){
        System.out.println("Nome titular: "+titular+"\nSaldo da conta: "+saldo);
    }
}
