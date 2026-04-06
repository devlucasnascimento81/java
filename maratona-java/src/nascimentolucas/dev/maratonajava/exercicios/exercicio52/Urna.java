package nascimentolucas.dev.maratonajava.exercicios.exercicio52;

public class Urna {
    private int votos[];

    public Urna() {
        this.votos = new int[Candidato.values().length];
    }

    public void votar(Candidato c){
        votos[c.ordinal()]++;
    }

    public Candidato getVencedor(){
        int vencedor = 0;
        for (int i = 1; i < votos.length; i++){
            if (votos[i] > votos[vencedor]){
                vencedor = i;
            }
        }
        return Candidato.values()[vencedor];
    }
}
