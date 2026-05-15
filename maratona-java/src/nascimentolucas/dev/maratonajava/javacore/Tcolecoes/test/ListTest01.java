package nascimentolucas.dev.maratonajava.javacore.Tcolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(16);
        List<String> nomes2 = new ArrayList<>(16);
        nomes.add("William");
        nomes.add("DevDojo Academy");
        nomes2.add("lucas");
        nomes2.add("talita");

        nomes.addAll(nomes2);

        nomes.remove(0);
        nomes.remove(2);

        for (String nome: nomes){
            System.out.println(nome);
        }

        nomes.add("Suane");
        System.out.println("----------");

        for (int i = 0; i < nomes.size(); i++){
            System.out.println(nomes.get(i));
        }


    }
}
