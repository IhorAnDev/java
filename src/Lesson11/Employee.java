package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelechitel(double a) {
        a = a * 2;
        return a;
    }

    public double zp2() {
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Petr", 550.34);
        System.out.println(emp1.salary);
        double d = emp1.uvelechitel(emp1.salary);
        System.out.println(d);
        System.out.println(emp1.salary);
        double zp =  emp1.zp2();
        System.out.println(zp);
        System.out.println(emp1.salary);

    }
}