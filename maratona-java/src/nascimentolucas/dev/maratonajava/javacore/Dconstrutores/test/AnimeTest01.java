package nascimentolucas.dev.maratonajava.javacore.Dconstrutores.test;


import nascimentolucas.dev.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Jujutsu Kaisen", "TV", 86, "Ação", "MAPPA");
        //Anime anime2 = new Anime();

        anime.imprime();
        //anime2.imprime();
    }
}
