package nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.test;

import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import nascimentolucas.dev.maratonajava.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;

import java.util.ArrayList;
import java.util.List;

public class RepositorioTest {
    public static void main(String[] args) {
        RepositorioBancoDeDados repositorioBancoDeDados = new RepositorioBancoDeDados();
        repositorioBancoDeDados.salvar();
        List<String> List = new ArrayList<>();
        List.add("Goku");
        List.add("gohan");
        List.add("Goten");
        System.out.println(List);
    }
}
