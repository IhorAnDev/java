package Lesson27;

import java.io.*;

public class Test9 {
    void abc() throws FileNotFoundException {
        try {
            File f = new File("test10.txt");
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Eto block try");
        } catch (FileNotFoundException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("eto block finally");
        }
    }

    void method() {
        try {
            abc();
        } catch (FileNotFoundException e) {
            System.out.println("Exception polnosty obrabotan");
        }
    }

   /* void def() {
        try {
            int[] array = {1, 2, 3, 4, 5};
            System.out.println(array[5]);
            System.out.println("Eto block try");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception poyman i nemnogo obrabotan");
            throw e;
        } finally {
            System.out.println("eto block finally");
        }
    }*/
}
