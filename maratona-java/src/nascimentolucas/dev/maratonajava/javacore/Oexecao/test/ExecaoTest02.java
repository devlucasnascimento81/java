package nascimentolucas.dev.maratonajava.javacore.Oexecao.test;

import java.io.File;
import java.io.IOException;

public class ExecaoTest02 {
    static void main () throws IOException {
        criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado "+ isCriado);

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
