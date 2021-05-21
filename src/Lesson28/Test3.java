package Lesson28;

import java.time.*;

public class Test3 {
    static void smenaDejurnogo(LocalDate nachalo, LocalDate konec, Period p) {
        LocalDate date = nachalo;
        while (date.isBefore(konec)) {
            System.out.println("Nastupila data " + date + ". Pora menyat dejurnogo");
            date = date.plus(p);
        }
    }

    public static void main(String[] args) {
        LocalDate nachalo = LocalDate.of(2020, Month.SEPTEMBER, 1);
        LocalDate konec = LocalDate.of(2021, Month.MAY, 31);
        Period p = Period.ofMonths(2);
        smenaDejurnogo(nachalo, konec, p);
    }
}
