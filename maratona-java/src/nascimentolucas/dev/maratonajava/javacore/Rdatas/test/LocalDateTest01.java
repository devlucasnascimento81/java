package nascimentolucas.dev.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2026, Month.MAY,26);
        LocalDate agora = LocalDate.now();
        System.out.println(agora);
        System.out.println(date);
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());
    }
}
