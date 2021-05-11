package Lesson23;


public class Test2 {
    public Object abc(){
        return new String("String");
    }
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        Teacher teacher = new Teacher();
        Employee employee = new Employee();

        Employee employee1 = new Doctor();
        Employee employee2 = new Teacher();
        Xirurg xirurg = new Xirurg();
        Employee employee3 = new Xirurg();

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

class Doctor extends Employee {
    void lechit() {
        System.out.println("lechit");
    }
}

class Xirurg extends Doctor {
    String skalpel;

    void operacia() {
        System.out.println("Operiruet");
    }
}

class Teacher extends Employee {
    int kolvouchenikov;

    void uchit() {
        System.out.println("Uchit");
    }

    void vodit() {
        System.out.println("Vodit");
    }
}