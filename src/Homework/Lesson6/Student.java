package Homework.Lesson6;

public class Student {

    Student(int studentId2, String name2, String surname2, int course2, double mathAverageGrade2,
            double economicAverageGrade2, double foreignLanguageAverageGrade2) {

        studentId = studentId2;
        name = name2;
        surname = surname2;
        course = course2;
        mathAverageGrade = mathAverageGrade2;
        economicAverageGrade = economicAverageGrade2;
        foreignLanguageAverageGrade = foreignLanguageAverageGrade2;
    }

    Student(int studentId3, String name3, String surname3, int course3) {
        this(studentId3, name3, surname3, 0, 0, 0, 0);
    }

    Student(){

    }

    int studentId;
    String name;
    String surname;
    int course;
    //оценки по 10-ти бальной шкале
    double mathAverageGrade;
    double economicAverageGrade;
    double foreignLanguageAverageGrade;

}

class StudentTest {

    double srednyaArifmetOcenka(Student st) {

        double srednyaOcenka = (st.economicAverageGrade + st.mathAverageGrade + st.foreignLanguageAverageGrade) / 3;
        System.out.println("Srednya arifmeticheskaya ocenka studenta: " + st.name + st.surname + ":" + srednyaOcenka);
        return srednyaOcenka;
    }


    public static void main(String[] args) {

        Student st1 = new Student(1,"Valeriy","Petrov",3,8,7,5);

        Student st2 = new Student(3,"Nikita","Pashkivskiy",4);
        st2.mathAverageGrade = 8.8;
        st2.economicAverageGrade = 9.6;
        st2.foreignLanguageAverageGrade = 7.9;

        Student st3 = new Student();
        st3.studentId = 3;
        st3.name = "Piston ";
        st3.surname = "Olegov ";
        st3.course = 2;
        st3.mathAverageGrade = 5.8;
        st3.economicAverageGrade = 6;
        st3.foreignLanguageAverageGrade = 10;

        StudentTest sTest = new StudentTest();
        sTest.srednyaArifmetOcenka(st1);
        sTest.srednyaArifmetOcenka(st2);
        sTest.srednyaArifmetOcenka(st3);

    }
}