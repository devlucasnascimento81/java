package nascimentolucas.dev.maratonajava.exercicios.exercicio63;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Digite um numero");
            String valor = sc.nextLine();
            System.out.println(validar(valor));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("encerrando programa");
        }

    }
    public static String validar(String valor) {
        if (valor == null || valor.isEmpty()) {
            throw new IllegalArgumentException("Erro: o valor não pode ser null ou vazio!");
        }
        double num;
        try {
            num = Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Erro: valor inválido, digite um número!");
        }

        double ceil = Math.ceil(num);
        double floor = Math.floor(num);
        double raiz = Math.sqrt(num);

        String sinal;
        if (num > 0) {
            sinal = "positivo";
        } else if (num < 0) {
            sinal = "negativo";
        } else {
            sinal = "zero";
        }

        return "valor convertido: "+valor+
                "\nValor arredondado pra cima: "+ceil+
                "\nValor arredondado pra baixo: "+floor+
                "\nRaiz quadrada de "+valor+" é: "+raiz+
                "\nvalor: "+sinal;
    }
}
