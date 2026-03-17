package nascimentolucas.dev.maratonajava.exercicios.exercicio13.dominio;

public class Pedido {
    private long id;
    private double valor;
    private StatusPedido status;

    public Pedido(long id, double valor, StatusPedido status) {
        this.id = id;
        this.valor = valor;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public void atualizarStatus(StatusPedido novoStatus){
        setStatus(novoStatus);
    }
    public void mostrarPedido(){
        System.out.println("ID pedido: "+getId());
        System.out.println("Valor: "+getValor());
        System.out.println("Status: "+getStatus());
    }


}
