package _datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;

public class Main {
    static LocalTime localTime1 = LocalTime.now();
    static LocalDate localDate1 = LocalDate.parse("2018-03-31");
    static LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime1);

    static LocalTime localTime2 = LocalTime.now();
    static LocalDate localDate2 = LocalDate.MAX;
    static LocalDateTime localDateTime2 = LocalDateTime.of(localDate2, localTime2);

    public static void main(String[] args) throws InterruptedException {
        /** Compiles */
        System.out.println(localDate1); // 2018-09-12

        System.out.println(localDate1.isAfter(localDate1)); // false

        localDate1 = localDate1.withMonth(2); // Adjusts day to 28
        if(false) {
            localDate1 = localDate1.withDayOfMonth(31); // Invalid date 'FEBRUARY 31' DateTimeException
            localDate1.withDayOfYear(366); // Not a leap year DateTimeException
        }

        /** Period */
        Period p = Period.ZERO.ofYears(10);
        p = p.ofMonths(16);
        System.out.println(p.toTotalMonths());


        /** Chaining */
        localTime1 = LocalTime.NOON.withHour(10).plusMinutes(120);

        /** Formatter */
        if(false) { // Runtime exceptions
            System.out.println(localTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
            System.out.println(localDate1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        }
        System.out.println(localDateTime1.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        // Prints: 2018-03-31T22:17:20.301

        /** ofPattern syntax */
        String input = "AAA 15 BBB 10PM.";
        String pattern = "'AAA 'm' BBB 'ha.";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
        LocalTime lt = LocalTime.parse(input, dtf);
        System.out.println(lt);

        /** Instant */
        Instant i = Instant.now();
        long l1 = i.toEpochMilli();
        Thread.sleep(3000L);
        long l2 = i.toEpochMilli();
        System.out.println(l1 + "\t" + l2);
    }

}
