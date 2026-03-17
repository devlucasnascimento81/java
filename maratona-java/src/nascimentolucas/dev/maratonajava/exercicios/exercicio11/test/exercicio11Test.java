package nascimentolucas.dev.maratonajava.exercicios.exercicio11.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio11.dominio.Funcionario;
import nascimentolucas.dev.maratonajava.exercicios.exercicio11.dominio.NivelAcesso;

public class exercicio11Test {
    public static void main(String[] args) {
        NivelAcesso admin = NivelAcesso.ADMIN;
        NivelAcesso gerente = NivelAcesso.GERENTE;
        NivelAcesso usuario = NivelAcesso.USUARIO;
        Funcionario f1 = new Funcionario("Vorcaro",100000, admin);
        Funcionario f2 = new Funcionario("Saul",1600,gerente);
        Funcionario f3 = new Funcionario("Mia",1200,usuario);

        f1.imprime();
        f2.imprime();
        f3.imprime();

    }
}
