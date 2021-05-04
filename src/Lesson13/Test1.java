package Lesson13;

public class Test1 {

}

class Student {

    int grade;

    Student(int grade) {
        this.grade = grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(3);

        switch (st1.grade) {
            case 2:
                System.out.println("Dvoechnik");
                break;
            case 3:
                System.out.println("Troechnik");
                System.out.println("Nadpis v bloke troechnik");
                break;
            case 4:
                System.out.println("horoshist");
                break;
            case 5:
                System.out.println("Otlichnik");
                break;
            default:
                System.out.println("Drugaya ocenka");
        }

    }
}

