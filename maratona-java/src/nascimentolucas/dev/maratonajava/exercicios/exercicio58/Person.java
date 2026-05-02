package nascimentolucas.dev.maratonajava.exercicios.exercicio58;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0 || age > 150){
            throw new RuntimeException ("Idade inválida: "+age);
        } if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        this.name = name;
        this.age = age;
    }

    public void imprime(){
        System.out.println("Nome: "+this.name);
        System.out.println("Idade: "+this.age);
    }

}
