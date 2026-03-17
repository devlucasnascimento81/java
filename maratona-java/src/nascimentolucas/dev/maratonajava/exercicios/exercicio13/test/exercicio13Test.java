package nascimentolucas.dev.maratonajava.exercicios.exercicio13.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio13.dominio.Pedido;
import nascimentolucas.dev.maratonajava.exercicios.exercicio13.dominio.StatusPedido;

public class exercicio13Test {
    public static void main(String[] args) {
        Pedido p1 = new Pedido(959349,290, StatusPedido.PENDENTE);
        p1.mostrarPedido();
        p1.atualizarStatus(StatusPedido.PROCESSANDO);
        p1.mostrarPedido();
        p1.atualizarStatus(StatusPedido.ENVIADO);
        p1.mostrarPedido();
        p1.atualizarStatus(StatusPedido.ENTREGUE);
        p1.mostrarPedido();

    }
}
