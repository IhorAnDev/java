package Lesson26;

public class Test6 {
    int a;

    Test6() {
        a = 4;
    }

    {
        a = 5;
    }

    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(t.a);
    }
}
