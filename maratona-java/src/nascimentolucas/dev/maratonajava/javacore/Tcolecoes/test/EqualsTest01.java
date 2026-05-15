package nascimentolucas.dev.maratonajava.javacore.Tcolecoes.test;

import nascimentolucas.dev.maratonajava.javacore.Tcolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2D", "iPhone");
        Smartphone s2 = new Smartphone("1ABC2D", "s25");

        System.out.println(s1.equals(s2));
    }
}
