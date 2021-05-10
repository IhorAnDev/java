package Lesson22;

import Homework.Lesson10.P4.P5.E;

public class Test3 {
}

class Employee {
    String name;
    double salary;
    int age;
    int expiriens;

    void eat() {
        System.out.println("kushat");
    }

    void sleep() {
        System.out.println("spat");
    }
}

class Doctor extends Employee {

    String specialictyk;


    void lechit() {
        System.out.println("Lechit");
    }
}

class Uchitel extends Employee {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }

}

class Test2 {
    public static void main(String[] args) {
        Uchitel uc = new Uchitel();
        uc.name = "Fedor";
        uc.eat();
        System.out.println(uc.name);
    }
}
