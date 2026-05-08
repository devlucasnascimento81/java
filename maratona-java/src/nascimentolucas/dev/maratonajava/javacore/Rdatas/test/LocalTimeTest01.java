package nascimentolucas.dev.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(12,12,12);
        LocalTime timeNOw = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNOw);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
    }
}
