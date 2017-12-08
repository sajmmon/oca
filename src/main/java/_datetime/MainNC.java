package _datetime;

import java.time.LocalDate;

public class MainNC {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        // ld.plus(//amount, unit);
        ld.plusDays(1);
        ld.plusMonths(1);
        ld.plusYears(1);
        ld.plusWeeks(1);
        // no plus(int)
    }
}
