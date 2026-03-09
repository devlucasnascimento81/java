package nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.test;

import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.dominio.SmartTv;
import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args){
        Computador computador = new Computador("MacBook", 6000 );
        Tomate tomate = new Tomate("tomate cereja", 10);
        SmartTv smarttv = new SmartTv("TCl 40 4k oled",1600);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(smarttv);
    }
}
