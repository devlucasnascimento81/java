package nascimentolucas.dev.maratonajava.javacore.Lclassesabtstratas.test;

import nascimentolucas.dev.maratonajava.javacore.Lclassesabtstratas.dominio.Funcionario;
import nascimentolucas.dev.maratonajava.javacore.Lclassesabtstratas.dominio.Gerente;
import nascimentolucas.dev.maratonajava.javacore.Lclassesabtstratas.dominio.Supervisor;

public class FuncionarioTest01 {
    public static void main(String[] args) {

        Supervisor supervisor = new Supervisor("jhony", 2000);
        Gerente gerente = new Gerente("dio", 1200);
        System.out.println(gerente);
        System.out.println(supervisor);
        gerente.imprime();
        supervisor.imprime();



    }
}
