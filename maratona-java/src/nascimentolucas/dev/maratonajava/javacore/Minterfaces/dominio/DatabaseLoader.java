package nascimentolucas.dev.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemover {
    @Override
    public void load() {
        System.out.println("Carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados do banco de dados");
    }

    @Override
    public void checkPermission() {
        DataLoader.super.checkPermission();
        System.out.println("Checando permissões do nosso banco de dados...");
    }

    public static void retrieveMaxDataSize() {
        System.out.println("Dentro da retrieveMaxDataSize na classe DatabaseLoader");
    }

}
