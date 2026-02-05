package nascimentolucas.dev.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        //
        String[] nomes = new String[4];
        nomes[0] = "Goku";
        nomes[1] = "ichigo";
        nomes[2] = "Naruto";
        nomes[3] = "luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }
}
