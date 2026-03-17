package nascimentolucas.dev.maratonajava.exercicios.exercicio4.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio4.dominio.Desenvolvedor;
import nascimentolucas.dev.maratonajava.exercicios.exercicio4.dominio.Gerente;

public class exercicio4Test {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("augusto",1900);
        Desenvolvedor desenvolvedor = new Desenvolvedor("jurandir",2800);

        gerente.imprime();
        System.out.println("--------------------------");
        desenvolvedor.imprime();
    }
}
