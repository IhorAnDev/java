package Lesson22;

public class Human {
    public String name = "Kolya";
    public static int salary = 150;

//    public Human(String n) {
//        name = n;
//    }

    public void work() {
        System.out.println("rabotaet");
    }

    public static void otdix() {
        System.out.println("otdihaet");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(Student.salary);
        s.work();
        Student.otdix();
    }

}