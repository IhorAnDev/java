package Lesson27;

import java.io.*;

public class Test10 {
    FileInputStream fis1, fis2;

    public void abc() {
        try {
            fis1 = new FileInputStream("test9.txt");
            try {
                fis2 = new FileInputStream("text10.txt");
            } catch (FileNotFoundException e) {
                System.out.println("File test 10 ne nayden ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test 9 ne nayden");
        } finally {
            System.out.println("Eto vneshniy finally block ");
            try {
                System.out.println("Nachalo popitky zakritiya fis1 ");
                fis1.close();
                System.out.println("Konec popitky zakritiya fis1");
                fis2.close();
                System.out.println("Konec popitky zakritiya");
            } catch (IOException e) {
                System.out.println("Naydeno iskluchenie v finnaly block ");
            }
        }
    }

    public static void main(String[] args) {
        Test10 t = new Test10();
        t.abc();
    }
}
