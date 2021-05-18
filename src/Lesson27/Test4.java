package Lesson27;

import java.io.*;

public class Test4 {
    void abc() throws FileNotFoundException {
        File f = new File("test8.txt");
        FileInputStream fis = new FileInputStream(f);
        System.out.println("Vsem horoshego dnya");

    }

    void def() throws FileNotFoundException {
        abc();
    }

    public static void main(String[] args) throws FileNotFoundException {
        Test4 t = new Test4();
        t.def();
    }
}
