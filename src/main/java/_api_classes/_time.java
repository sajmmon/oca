package _api_classes;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class _time {

    public static void main(String[] args) {
        System.out.println(LocalTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalDateTime.now());

        LocalDate date1 = LocalDate.of(2017, 9, 3);
        LocalDate date2 = LocalDate.of(2078, Month.APRIL, 2);

        LocalTime time1 = LocalTime.of(12, 12);
        LocalTime time2 = LocalTime.of(12, 12, 4);
        LocalTime time3 = LocalTime.of(12, 12, 4, 4);

        LocalDateTime dateTime1 = LocalDateTime.of(date1, time1).minusHours(6).minusMinutes(6);
        LocalDateTime dateTime2 = LocalDateTime.of(122, Month.AUGUST, 1, 12, 12);
        LocalDateTime dateTime3 = LocalDateTime.of(122, Month.AUGUST, 1, 12, 12, 3);
        LocalDateTime dateTime4 = LocalDateTime.of(122, Month.AUGUST, 1, 12, 12, 3, 200);


        date1.plusDays(1).plusWeeks(1).plusMonths(1).plusYears(1);
        time1.plusHours(1).plusMinutes(1).plusSeconds(1).plusNanos(1);

        date1.isAfter(date2);
        dateTime1.isAfter(dateTime2);

        Period period1 = Period.between(date1, date2).plusDays(1).plusMonths(1).plusYears(1); // no plusWeeks()
        Period period2 = Period.of(2012,12,12);
        Period period3 = Period.ofDays(1);
        Period period4 = Period.ofWeeks(1);
        Period period5 = Period.ofMonths(1);
        Period period6 = Period.ofYears(1);

        date1.plus(period1);

        /** Tricky */
        Period period10 = Period.ofDays(1).ofYears(1); // ofYears(1) ONLY

        System.out.println();
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(date1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(date1));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(dateTime1));

        System.out.println();
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT).format(time1));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(time1));
        System.out.println(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).format(dateTime1));

        System.out.println();
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).format(dateTime1));
        System.out.println(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(dateTime1));

        date1.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));

        System.out.println();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("M MM MMM MMMM MMMM, d dd, y yy yyy yyyy, h hh: m mm");
        System.out.println(dateTime1.format(dtf));


        DateTimeFormatter f = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("01 02 2015", f);
        LocalTime time = LocalTime.parse("11:22");
        System.out.println(date);          // 2015-01-02
        System.out.println(time);          // 11:22


    }
}
