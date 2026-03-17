package nascimentolucas.dev.maratonajava.exercicios.exercicio1.dominio;

public class Carro {
    public String marca;
    public String modelo;
    public double ano;

    public Carro(String marca, String modelo, double ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void imprimir(){
        System.out.println("Marca: "+marca+"\nModelo: "+modelo+"\nAno: "+ano);
    }
}
