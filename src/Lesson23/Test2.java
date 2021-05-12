//package Lesson23;
//
//
//public class Test2 {
//    public Object abc() {
//        return new String("String");
//    }
//
//    public static void main(String[] args) {
////        Doctor doctor = new Doctor();
////        Teacher teacher = new Teacher();
////        Employee employee = new Employee();
////        Xirurg xirurg = new Xirurg();
//
//        Employee employee1 = new Doctor();
//        System.out.println(employee1.salary);
//        System.out.println(employee1.age);
//        System.out.println(employee1.experience);
//        employee1.eat();
//        employee1.sleep();
//
//        Employee employee2 = new Teacher();
//        Doctor doctor = new Xirurg();
//        System.out.println(doctor.age);
//        doctor.lechit();
//
//        Employee employee3 = new Xirurg();
//
//    }
//}
//
//
//class Employe {
//    double salary = 100;
//    String name = "Kolya";
//    int age;
//    int experience;
//
//    void eat() {
//        System.out.println("Kushat");
//    }
//
//    void sleep() {
//        System.out.println("Spat");
//    }
//}
//
//class Doctor extends Employee {
//    void lechit() {
//        System.out.println("lechit");
//    }
//}
//
//class Xirurg extends Doctor {
//    String skalpel;
//
//    void operacia() {
//        System.out.println("Operiruet");
//    }
//}
//
//class Teache extends Employee {
//    int kolvouchenikov;
//
//    void uchit() {
//        System.out.println("Uchit");
//    }
//
//    void vodit() {
//        System.out.println("Vodit");
//    }
//}