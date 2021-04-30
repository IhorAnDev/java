package Homework.Lesson7;

public class Employee {

    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id2) {
        id = id2;
    }

    Employee(String surname2) {
        surname = surname2;
    }

    private Employee(double salary2) {
        salary = salary2;
    }

    public void getId() {
        System.out.println("ID = " + id);
    }

    public void getSurname() {
        System.out.println("Surname =" + surname);
    }

    public void getSalary() {
        System.out.println("Salary = " + salary);
    }

}

class EmployeeTest {

    public static void main(String[] args) {

        Employee emp1 = new Employee(5);
        Employee emp2 = new Employee("Ivanov");
        //Employee emp3 = new Employee(45.6);

        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        //System.out.println(emp1.salary);

        System.out.println(emp2.id);
        System.out.println(emp2.surname);
        //System.out.println(emp2.salary);

        emp1.getId();
        emp1.getSalary();
        emp1.getSurname();

        emp2.getId();
        emp2.getSalary();
        emp2.getSurname();
    }

}
