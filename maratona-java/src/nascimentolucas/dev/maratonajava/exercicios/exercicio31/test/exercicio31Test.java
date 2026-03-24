package nascimentolucas.dev.maratonajava.exercicios.exercicio31.test;

import nascimentolucas.dev.maratonajava.exercicios.exercicio31.dominio.ConversorTemperatura;

public class exercicio31Test {
    public static void main(String[] args) {
        System.out.println("Celsius para Fahrenheit: "+ConversorTemperatura.celsiusParaFahrenheit(30));
        System.out.println("Fahrenheit para Celsius: "+ConversorTemperatura.fahrenheitParaCelsius(80));
        System.out.println("Celsius para Kelvin: "+ConversorTemperatura.celsiusParaKelvin(50));
    }
}
