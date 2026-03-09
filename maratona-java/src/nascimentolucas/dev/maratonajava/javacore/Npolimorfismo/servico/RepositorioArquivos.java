package nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.servico;

import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivos implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("Salvando em um arquivo");
    }
}
