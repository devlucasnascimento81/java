package nascimentolucas.dev.maratonajava.javacore.Csobrecargametodos.test;

import nascimentolucas.dev.maratonajava.javacore.Csobrecargametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.init("Naruto","shounen",200);
        anime.init("Naruto","shounen",200,"ação/comédia/drama");
        anime.imprime();
    }
}
