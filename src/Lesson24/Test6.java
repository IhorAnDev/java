package Lesson24;

public class Test6 {
}

interface I11 {
    private static void method1() {
        System.out.println("Static 1");
    }

    private void method2(){
        System.out.println("non static method");
    }
    default void method3(){
        method1();
    }
    static void method4(){
        method1();
    }
}