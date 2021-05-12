package Lesson23;

public class Test5 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Teacher t = new Teacher();
        // emp.sleep(); не можем вызвать так как метод протектед используется только внутр класса
        //t.sleep();
        Employee e = new Teacher();
        e.sleep();


    }
}

class Eda {
}

class Fruit extends Eda {
}

class Employee {
    double salary;
    String name = "Kolya";

    final Eda eat() {
        System.out.println("kushaet rabotnik");
        Eda e = new Eda();
        return e;
    }

    final static void sleep() {
        System.out.println("Spit rabotnik");

    }
}

class Teacher extends Employee {
    int kolvouchenikov;


//    public Eda eat() {
//        System.out.println("kushaet uchitel");
//        Fruit f = new Fruit();
//        return f;
//    }

    void uchit() {
        System.out.println("Uchit");
    }

//    static void sleep() {
//        System.out.println("Spit uchitel");
//    }
}
