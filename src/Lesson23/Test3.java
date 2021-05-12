package Lesson23;

<<<<<<< HEAD
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
=======

public class Test3 {
    public static void main(String[] args) {
        Employee e = new Teacher();
        e.eat();
    }
}

/*
class Eda {
}

class Fruit extends Eda {
}

class Employee {
    double salary;
>>>>>>> refs/remotes/origin/main
    String name = "Kolya";
    int age;
    int experience;

<<<<<<< HEAD
    Eda eat() {
        System.out.println("Eating employee");
=======
     public Eda eat() {
        System.out.println("kushaet rabotnik");
>>>>>>> refs/remotes/origin/main
        Eda e = new Eda();
        return e;
    }

    void sleep() {
<<<<<<< HEAD
        System.out.println("SLEEPING");
=======
        System.out.println("Spat");

>>>>>>> refs/remotes/origin/main
    }
}

class Teacher extends Employee {
<<<<<<< HEAD
    int ucheniki;

    Frukt eat() {
        System.out.println("Eating Uchitel");
        Frukt frukt = new Frukt();
        return frukt;
=======
    int kolvouchenikov;

   public Eda eat() {
        System.out.println("kushaet uchitel");
        Fruit f = new Fruit();
        return f;
>>>>>>> refs/remotes/origin/main
    }

    void uchit() {
        System.out.println("Uchit");
    }
<<<<<<< HEAD
}
=======
}

class A {
    Employee objCreat() {
        return new Employee();
    }
}

class B extends A {
    Teacher objCreat() {
        System.out.println("ok");
        return new Teacher();
    }
}
*/
>>>>>>> refs/remotes/origin/main
