package Lesson22.P1;

import Lesson22.*;

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        s.work();
        Student.otdix();
        System.out.println(Student.salary);

    }
}
