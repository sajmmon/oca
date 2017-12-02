package _datetime;

import java.time.*;
import java.time.temporal.TemporalAdjuster;

public class Main {
    static LocalTime localTime1 = LocalTime.now();
    static LocalDate localDate1 = LocalDate.parse("2018-03-31");
    static LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);

    static LocalTime localTime2 = LocalTime.now();
    static LocalDate localDate2 = LocalDate.MAX;
    static LocalDateTime localDateTime2 = LocalDateTime.of(localDate2, localTime2);

    public static void main(String[] args) {
        /** Compiles */
        System.out.println(localDate1); // 2018-09-12

        System.out.println(localDate1.isAfter(localDate1)); // false

        localDate1 = localDate1.withMonth(2); // Adjusts day to 28
        localDate1 = localDate1.withDayOfMonth(31); // Invalid date 'FEBRUARY 31' DateTimeException
        localDate1.withDayOfYear(366); // Not a leap year DateTimeException


    }

}
