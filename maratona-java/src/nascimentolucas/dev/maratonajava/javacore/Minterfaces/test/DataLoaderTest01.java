package nascimentolucas.dev.maratonajava.javacore.Minterfaces.test;

import nascimentolucas.dev.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import nascimentolucas.dev.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import nascimentolucas.dev.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();
        System.out.println("----------------------------------");
        databaseLoader.remove();
        fileLoader.remove();
        System.out.println("----------------------------------");
        databaseLoader.checkPermission();
        fileLoader.checkPermission();
        System.out.println("----------------------------------");
        DataLoader.retrieveMaxDataSize();
        DatabaseLoader.retrieveMaxDataSize();
    }
}
