package Lesson27;

import java.io.*;

public class Test8 {
    static StringBuilder abc() {
        StringBuilder a = new StringBuilder("Hello");
        try {
            File f = new File("test9u.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Oshibka poymana ");
            System.out.println("Peremennaya a v catch bloke = " + a);
            return a;
        } finally {
            a.append("!!!");
            System.out.println("Eto block finally");
            System.out.println("Peremennaya a v finally bloke = " + a);
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(abc());
    }
}
