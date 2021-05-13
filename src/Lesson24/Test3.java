package Lesson24;


import Homework.Lesson10.P4.P5.E;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("Polotence");
        s.swim();
    }
}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat() {
        System.out.println("Kushat");
    }

    void sleep() {
        System.out.println("Spat");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashini;

    void vodit() {
        System.out.println("Vodit");
    }

    @Override
    public void pomosh() {
        System.out.println("Driver okazivaet pomoj");
    }

    @Override
    public void tushitPojar(String s) {
        System.out.println("Driver tushit pojar " + s);
    }

    @Override
    public void swim() {
        System.out.println("Driver swim");
    }
}

class Teacher extends Employee implements Help_able {
    int kolichestvouchenicov;

    void uchit() {
        System.out.println("Uchit");
    }

    @Override
    public void pomosh() {
        System.out.println("Uchitel okazivaet pomoj");
    }

    @Override
    public void tushitPojar(String s) {
        System.out.println("Uchitel tushit pojar" + s);
    }
}

interface Help_able {
    void pomosh();

    void tushitPojar(String predmet);

    public final static int a = 10;
}

interface Swim_able {
    void swim();
}
