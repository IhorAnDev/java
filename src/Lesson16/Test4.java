package Lesson16;

public class Test4 {

}

class Employee {
    double salary;
    boolean isManafer;

    Employee(double salary, boolean isManafer) {
        this.salary = salary;
        this.isManafer = isManafer;
    }
}

class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee(100.5, true);
        System.out.println("on manager? " + emp.isManafer + " Ego zp : " + emp.salary);
    }
}