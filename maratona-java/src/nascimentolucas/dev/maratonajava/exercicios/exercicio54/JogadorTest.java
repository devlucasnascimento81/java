package nascimentolucas.dev.maratonajava.exercicios.exercicio54;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador[] jogadores = {
                new Jogador("itadori", 80),
                new Jogador("megume",78),
                new Jogador("maki",95),
                new Jogador("rakari",67),
                new Jogador("yuta",190)
        };
        for (int i = 0; i < jogadores.length; i++){
            Jogador temp = jogadores[i];
            int indiceMaior = i;
            for (int x = i + 1; x < jogadores.length; x++){
                if (jogadores[x].getPontuacaoo() > jogadores[indiceMaior].getPontuacaoo()) {
                    indiceMaior = x;
                }
            }
            jogadores[i] = jogadores[indiceMaior];
            jogadores[indiceMaior] = temp;
        }

        for (Jogador j : jogadores){
            System.out.println("Jogador: "+j.getNome());
            System.out.println("Pontução: "+j.getPontuacaoo());
            System.out.println("-----------------");
        }
    }


}
