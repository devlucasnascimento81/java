package nascimentolucas.dev.maratonajava.exercicios.exercicio53;

public class Pilha {
    private int topo;

    public Pilha(int capacidade) {
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    private int[] elementos;

    public void empilhar(int valor) {
        if (topo < elementos.length -1) {
            topo++;
            elementos[topo] = valor;
        }
    }

    public int desempilhar(){
        int valor = elementos[topo];
        topo--;
        return  valor;


    }

    public boolean isVazia(){
        return topo == -1;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.empilhar(40);
        pilha.empilhar(5);



       while (!pilha.isVazia()) {
            System.out.println(pilha.desempilhar());
       }

    }
}
