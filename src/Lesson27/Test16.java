package Lesson27;

import java.util.*;

public class Test16 {
    public static void main(String[] args) {
       /* ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        System.out.println(list.get(3));
       Doctor d = new Doctor();
        Teacher t = new Teacher();
        Employee[] array = {d, t};*/
        createPassword("qwerty");
    }

    static public void createPassword(String pwd) {
        if (pwd.length() < 6) {
            throw new IllegalArgumentException("Dlinna sloshkom malenkaya");
        }
        if (pwd.length() > 12) {
            throw new IllegalArgumentException("Dlinna sloshkom bolshaya");
        }
        System.out.println("Parol prinat");
    }
}

class Employee {
}

class Doctor extends Employee {
}

class Teacher extends Employee {
}

class Samolet {
    String sostoyanie = "v ojidanii";

    public void letet() {
        sostoyanie = "v vozduhe";
        System.out.println("Samolet letit");
    }

    public void ojidayet() {
        if (sostoyanie.equals("v vozduhe")) {
            throw new IllegalStateException("Samolet uje v vozduxe");
        }
        sostoyanie = "v ojidanii";
        System.out.println("Samolet v ojidaniy poleta");
    }

    public void otmenitPolet() {
        if (sostoyanie.equals("v vozduhe")) {
            throw new IllegalStateException("Samolet usje v vozduhe");
        }
        sostoyanie = "polet otmenen";
        System.out.println("Polet samoleta otmenen");
    }
}