package nascimentolucas.dev.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Lucas";
        nome.concat(" Nascimento");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuffer sb = new StringBuffer("Lucas Nascimento");
        sb.append(" Dev").append(" Dojo");
        System.out.println(sb);
    }
}
