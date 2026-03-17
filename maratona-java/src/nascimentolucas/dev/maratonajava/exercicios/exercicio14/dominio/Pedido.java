package nascimentolucas.dev.maratonajava.exercicios.exercicio14.dominio;

public class Pedido {
    private int id;
    private double valor;
    StatusPedido status;
    Pagamento pagamento;

    public Pedido(int id, double valor, StatusPedido status, Pagamento pagamento) {
        this.id = id;
        this.valor = valor;
        this.status = status;
        this.pagamento = pagamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public void setStatus(StatusPedido staus) {
        this.status = staus;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public void pagarPedido(){
        if (status == StatusPedido.PENDENTE){
            pagamento.pagar(valor);
            status = StatusPedido.PAGO;

        }else if (status == StatusPedido.CANCELADO){
            System.out.println("PEDIDO CANCELADO");
        } else System.out.println("Pedido já processado.");
    }

    public void mostrarPedido(){
        System.out.println("Pedido ID: "+getId());
        System.out.println("Valor: "+getValor());
        System.out.println("Status: "+getStatus());

    }
}

