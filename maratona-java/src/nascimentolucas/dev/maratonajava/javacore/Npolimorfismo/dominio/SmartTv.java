package nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.dominio;

public class SmartTv extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.21;

    public SmartTv(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Smart Tv... ");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
