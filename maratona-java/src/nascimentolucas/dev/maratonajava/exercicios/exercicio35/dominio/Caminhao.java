package nascimentolucas.dev.maratonajava.exercicios.exercicio35.dominio;

public class Caminhao implements Transportavel{
    private int capacidadeMaxima;
    private int cargaAtual;

    public Caminhao(int capacidadeMaxima, int cargaAtual) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.cargaAtual = cargaAtual;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public int getCargaAtual() {
        return cargaAtual;
    }

    public void setCargaAtual(int cargaAtual) {
        this.cargaAtual = cargaAtual;
    }

    @Override
    public int carregar(int peso) {
        if (peso <= capacidadeMaxima){
            return cargaAtual += peso ;
        }else {
            return 0;
        }
    }

    @Override
    public int descarregar(int peso) {
        return cargaAtual -= peso;
    }
    public void imprimeCaminhao(){
        System.out.println("Capacidade máxima do caminhão: "+getCapacidadeMaxima()+" KGs");
        System.out.println("Carga atual do caminhão: "+getCargaAtual()+" KGs");
    }
}
