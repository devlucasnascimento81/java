package nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.servico;

import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em uma memoria");
    }
}
