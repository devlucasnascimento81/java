package nascimentolucas.dev.maratonajava.javacore.Aintroducaoclasses.test;

import nascimentolucas.dev.maratonajava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Toyota";
        carro1.modelo = "Hillux";
        carro1.ano = 2026;

        carro2.nome = "BMW";
        carro2.modelo = "i3";
        carro2.ano = 2001;
        System.out.println("\nCarro 1:");
        System.out.println("Fabricante: " +carro1.nome+ ", Modelo: " +carro1.modelo+ ", Ano: " +carro1.ano);
        System.out.println("\nCarro 2:");
        System.out.println("Fabricante: " +carro2.nome+ ", Modelo: " +carro2.modelo+ ", Ano: " +carro2.ano);
    }
}
