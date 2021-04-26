package Lesson5;

public class Lesson5 {

    int summa(int a, int b, int c) {

        int result = a + b + c;
        return result;

    }



}

class Test21{
    public static void main(String[] args) {
        Lesson5 t = new Lesson5();
        int summThird = t.summa(5,12,15);
        System.out.println(summThird);
        System.out.println(t.summa(1,2,5));
    }
}