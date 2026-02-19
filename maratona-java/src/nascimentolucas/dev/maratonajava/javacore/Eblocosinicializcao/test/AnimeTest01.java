package nascimentolucas.dev.maratonajava.javacore.Eblocosinicializcao.test;

import nascimentolucas.dev.maratonajava.javacore.Eblocosinicializcao.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("One piece");

        for (int episodio: anime.getEpisodios())
        System.out.print(episodio + " ");
    }
}
