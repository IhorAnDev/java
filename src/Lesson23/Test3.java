package Lesson23;

public class Test3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.eat();
    }
}

class Eda {
}

class Frukt extends Eda {

}

class Employee {
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    Eda eat() {
        System.out.println("Eating employee");
        Eda e = new Eda();
        return e;
    }

    void sleep() {
        System.out.println("SLEEPING");
    }
}

class Teacher extends Employee {
    int ucheniki;

    Frukt eat() {
        System.out.println("Eating Uchitel");
        Frukt frukt = new Frukt();
        return frukt;
    }

    void uchit() {
        System.out.println("Uchit");
    }
}