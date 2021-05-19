package Lesson27;

import java.io.*;

public class Test14 {
    static FileInputStream fis1, fis2;

    public static void main(String[] args) {
        try {
            fis1 = new FileInputStream("test9.txt");
            System.out.println("File test 9 naiden v sisteme");
            try {
                fis2.close();
            } catch (IOException e) {
                System.out.println("bad stream fis 2 ");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File test 9 ne nayden");
        } catch (NullPointerException e) {
            System.out.println("Srabotal null pointer exception");
        }
    }
}
