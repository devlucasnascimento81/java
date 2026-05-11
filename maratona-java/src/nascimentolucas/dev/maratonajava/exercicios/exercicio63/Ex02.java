package nascimentolucas.dev.maratonajava.exercicios.exercicio63;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite sua data de nascimento...");
            System.out.print("Dia: ");
            int dia = sc.nextInt();
            System.out.print("Mês: ");
            int mes = sc.nextInt();
            System.out.print("Ano: ");
            int ano = sc.nextInt();
            LocalDate nascimento = LocalDate.of(ano, mes, dia);
            System.out.println("Iniciando calculadora de idade...");
            System.out.println(calculadoraIdade(nascimento));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Encerrando programa...");
        }

    }
    public static String calculadoraIdade(LocalDate nascimento){
        if (nascimento == null || nascimento.isAfter(LocalDate.now())){
            throw new IllegalArgumentException("Erro: data não pode ser null ou no futuro");
        }
        LocalDate dataAtual = LocalDate.now();
        LocalDate aniversario = nascimento.withYear(LocalDate.now().getYear());
        long anos = ChronoUnit.YEARS.between(nascimento, dataAtual);
        long meses = ChronoUnit.MONTHS.between(nascimento, dataAtual);
        long dias = ChronoUnit.DAYS.between(nascimento, dataAtual);
        boolean maiorIdade = anos >= 18;
        if (aniversario.isBefore(LocalDate.now())){
            aniversario = aniversario.plusYears(1);
        }
        if (maiorIdade){
            System.out.println("\nÉ maior de idade!");
        } else {
            System.out.println("\nÉ menor de idade!");
        }
        long diasAniversario = ChronoUnit.DAYS.between(LocalDate.now(), aniversario);
        return "Sua idade em anos: "+anos+
                "\nSua idade em  mêses: "+meses+
                "\nSua idade em dias: "+dias+
                "\nFalta "+diasAniversario+" dias, para o seu aniversário";
    }
}
