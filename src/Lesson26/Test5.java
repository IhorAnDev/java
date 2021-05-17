package Lesson26;

public class Test5 {
    Test5() {
        System.out.println("Eto konstruktor");
    }

    {
        System.out.println("Eto initialize 1");
    }
    {
        System.out.println("Eto initialize 2");
    }
    public static void main(String[] args) {
        Test5 t1 = new Test5();
        Test5 t2 = new Test5();
    }
}
