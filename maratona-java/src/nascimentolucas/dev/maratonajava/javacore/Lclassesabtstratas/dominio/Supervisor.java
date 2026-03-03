package nascimentolucas.dev.maratonajava.javacore.Lclassesabtstratas.dominio;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, double salario) {
        super(nome, salario);


    }


    @Override
    public void calculaBonus() {
        this.salario = this.salario + this.salario * 0.05;
    }

    @Override
    public void imprime() {
        System.out.println("imprimindo...");
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
