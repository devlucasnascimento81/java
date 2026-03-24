package nascimentolucas.dev.maratonajava.exercicios.exercicio32.dominio;

public class Conta {
    private String titulo;
    private double saldo;

    public Conta(String titulo, double saldo) {
        this.titulo = titulo;
        this.saldo = saldo;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getSaldo() {
        return saldo;
    }


}
