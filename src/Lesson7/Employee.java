package Lesson7;

public class Employee {

    protected double salary;

    protected void dvoinayaZP() {
        System.out.println("Novaya ZP =" + salary * 2);
    }

    protected Employee(double salary2) {
        salary = salary2;
    }

    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
    }

}

class EmployeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(500);
        System.out.println(emp.salary);
        emp.dvoinayaZP();
    }
}
