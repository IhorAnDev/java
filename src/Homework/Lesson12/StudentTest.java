package Homework.Lesson12;

import Lesson11.Student;

public class StudentTest {

    public static void method1(Student st1, Student st2) {
        if (st1.name.equals(st2.name) && st1.course == st2.course && st1.grade == st2.grade) {
            System.out.println("Student the same");
        } else {
            System.out.println("Student other");
        }

    }

    public static void method2(Student st1, Student st2) {
        if (st1.name.equals(st2.name)) {
            if (st1.course == st2.course) {
                if (st1.grade == st2.grade) {
                    System.out.println("U studentov vse odinakovoe");
                } else {
                    System.out.println("Imya,kursi odinakovie,ocenky raznye");
                }
            } else {
                System.out.println("Imena odinakovie,kursi rasnye");
            }
        } else {
            System.out.println("Imena razlichautsa");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ivan", 2, 6.7);
        Student s2 = new Student("Ivan2", 2, 6.5);
        method1(s1, s2);
        method2(s1, s2);
    }
}
