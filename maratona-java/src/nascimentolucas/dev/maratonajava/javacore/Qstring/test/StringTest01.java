package nascimentolucas.dev.maratonajava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "lucas";// string constant pool
        String nome2 = "lucas";
        nome = nome.concat(" Nacimento");
       //nome2 = nome2.concat(" Campos");
        System.out.println(nome);
        System.out.println(nome2);
        System.out.println(nome == nome2);


    }
}
