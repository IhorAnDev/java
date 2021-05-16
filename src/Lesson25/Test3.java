package Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor();
        Employee emp2 = new Uchitel();
        Employee emp3 = new Driver();
        Employee emp4 = new Employee();
        Employee[] array = {emp1, emp2, emp3, emp4};

        System.out.println(((Uchitel)emp2).kolichestvoUchenikov);
        ((Uchitel)emp2).uchit();

        emp1.eat();
        System.out.println(emp1.salary);
        ((Doctor)emp1).eat();

        for (Employee e : array
        ) {
            if (e instanceof Driver) {
                System.out.println(((Driver) e).nazvanieMashini);
                ((Driver) e).vodit();
            }
        }
    }
}

class Employee {
    String name = "Kolya";
    double salary = 100;
    int age = 33;
    int expiriens;

    static void eat() {
        System.out.println("Rabotnik kushat");
    }

    void sleep() {
        System.out.println("Rabotnik spat");
    }
}

class Doctor extends Employee implements Help_able {

    String specialictyk = "Hirurg";


   static void eat() {
        System.out.println("Doktor kushaet");
    }

    @Override
    public void help() {
        System.out.println("Doctor pomogaet");
    }

    void lechit() {
        System.out.println("Lechit");
    }
}

class Uchitel extends Employee {
    int kolichestvoUchenikov = 10;

    void uchit() {
        System.out.println("uchit");
    }

}

class Driver extends Employee {
    String nazvanieMashini = "Mersedes";

    void vodit() {
        System.out.println("Vodit");
    }
}

interface Help_able {
    void help();
}