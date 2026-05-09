package nascimentolucas.dev.maratonajava.exercicios.exercicio62;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try (sc){
            System.out.print("Digite o dia: ");
            int dia = sc.nextInt();

            System.out.print("Digite o mês: ");
            int mes = sc.nextInt();

            System.out.print("Digite o ano: ");
            int ano = sc.nextInt();

            LocalDate data = LocalDate.of(ano, mes, dia);

            System.out.println(data);

            System.out.println("Vamos analisar sua data!");

            analisarData(data);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Encerrando programa...");
            sc.close();
        }

    }
    public static void analisarData(LocalDate data){
        if (data == null){
            throw new IllegalArgumentException("Erro: a data não pode ser null");
        }
        LocalDate natal = LocalDate.of(2026,12,25);
        long diasParaNatal = ChronoUnit.DAYS.between(data, natal);
        System.out.println("dia: "+data.getDayOfMonth()+", do mês: "+ data.getMonth()+", do ano: "+ data.getYear());
        System.out.println("dia da semana: "+data.getDayOfWeek());
        if (data.isLeapYear()){
            System.out.println("Ano bisexto!");
        } else {
            System.out.println("Ano não bisexto.");
        }
        System.out.println("Falta: "+diasParaNatal+" dias para o natal!");

    }
}
