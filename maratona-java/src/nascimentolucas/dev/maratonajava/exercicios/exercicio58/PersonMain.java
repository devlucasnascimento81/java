package nascimentolucas.dev.maratonajava.exercicios.exercicio58;

import java.util.Scanner;

public class PersonMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome:");
        String name = sc.nextLine();
        System.out.print("Digite sua idade: ");
        int age = sc.nextInt();


        try {
            Person person = new Person(name, age);
            person.imprime();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando programa...");
            sc.close();
        }
    }
}
