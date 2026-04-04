package nascimentolucas.dev.maratonajava.javacore.Oexecao.execao.test;

import java.io.File;
import java.io.IOException;

public class ExecaoTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("maratona-java/arquivo\\teste.txt");
        try {
            boolean isCriado =  file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
