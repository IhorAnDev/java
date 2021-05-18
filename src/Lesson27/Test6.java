package Lesson27;

import java.io.*;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        } catch (FileNotFoundException e) {
            System.out.println("Poyman exeption 1");
        } catch (NullPointerException e) {
            System.out.println("Poyman exeption 2");
        }
    }
}
