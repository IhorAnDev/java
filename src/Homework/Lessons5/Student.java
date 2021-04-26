package Homework.Lessons5;

public class Student {

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

        Student st1 = new Student();
        st1.studentId = 1;
        st1.name = "Nikolay ";
        st1.surname = "Petrov ";
        st1.course = 3;
        st1.mathAverageGrade = 7.8;
        st1.economicAverageGrade = 5.6;
        st1.foreignLanguageAverageGrade = 8.9;

        Student st2 = new Student();
        st2.studentId = 2;
        st2.name = "Nikita ";
        st2.surname = "Pashkivskiy ";
        st2.course = 4;
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