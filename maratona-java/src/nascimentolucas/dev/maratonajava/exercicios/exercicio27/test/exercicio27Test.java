package nascimentolucas.dev.maratonajava.exercicios.exercicio27.test;


import nascimentolucas.dev.maratonajava.exercicios.exercicio27.dominio.Estagiario;
import nascimentolucas.dev.maratonajava.exercicios.exercicio27.dominio.Gerente;

public class exercicio27Test {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Michael scott",1700,200);
        Estagiario estagiario = new Estagiario("Ryan howard",0,700);

        gerente.imprime();
        System.out.println("Bônus: "+gerente.getBonus());
        System.out.println("Salario total: "+gerente.getSalarioTotal());

        System.out.println("--------------------------");

        estagiario.imprime();
        System.out.println("Bolsa Auxílio: "+estagiario.getBolsaAuxilio());
        System.out.println("Salario total: "+estagiario.getSalarioTotal());
    }
}
