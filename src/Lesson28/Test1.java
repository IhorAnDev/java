package Lesson28;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2022, 5, 16);
        System.out.println(ld1);
        ld1 = ld1.plusDays(18);
        System.out.println(ld1);
       /* LocalDate ld1 = LocalDate.of(2023, 5, 15);
        System.out.println(ld1);
        LocalDate ld2 = LocalDate.of(2023, Month.JUNE, 15);
        System.out.println(ld2);
*/
        LocalTime lt1 = LocalTime.of(15, 30);
        System.out.println(lt1);
        lt1 = lt1.plusHours(1);
        System.out.println(lt1);
    }
}
