package Lesson15;

public class Test7 {
    public static void main(String[] args) {
        int dengi = 100;
        do {
            System.out.println("Delayte stavku");
            System.out.println("Vi proigrali");
            dengi = dengi - 10;
            System.out.println(dengi);
        }
        while (dengi > 50);
    }
}
