package nascimentolucas.dev.maratonajava.exercicios.exercicio31.dominio;

public class ConversorTemperatura {

    public static double celsiusParaFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitParaCelsius(double fahrenheit){
        return (fahrenheit - 32) * 5/9;
    }
    public static double celsiusParaKelvin(double celsius){
        return celsius + 273.15;
    }
}
