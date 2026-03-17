package nascimentolucas.dev.maratonajava.exercicios.exercicio14.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio14.dominio.CartaoCredito;
import nascimentolucas.dev.maratonajava.exercicios.exercicio14.dominio.Pedido;
import nascimentolucas.dev.maratonajava.exercicios.exercicio14.dominio.Pix;
import nascimentolucas.dev.maratonajava.exercicios.exercicio14.dominio.StatusPedido;

public class exercicio14Test {
    public static void main(String[] args) {
        Pedido[] pedidos = {
                new Pedido(89377,129.90,StatusPedido.PENDENTE,new CartaoCredito()),
                new Pedido(74738,299.90,StatusPedido.PENDENTE,new Pix()),
                new Pedido(39252,49.90,StatusPedido.CANCELADO, new Pix())
        } ;for (Pedido p : pedidos){
            p.pagarPedido();
            p.mostrarPedido();
        }
    }
}
