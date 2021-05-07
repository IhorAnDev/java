package Lessons19;

public class Test5 {
    public static void main(String[] args) {
        String[] students = {"Ivanov", "Petrov", "Sidorov"};
        String[] exams = {"mat analiz", "filosofiya"};
        for (String s1 : students) {
            for (String exam1 : exams) {
                System.out.println("Student familiya - "+ s1 +" Predmet -" + exam1);
            }
        }
    }
}
