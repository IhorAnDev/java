package Lesson25;

public class Test5 {
    public static void main(String[] args) {
        Test10 t = new Test30();
        ((Test10)t).abc();
    }
}

class Test10 {
    int a = 10;

    void abc() {
        System.out.println("Test10");
    }
}

class Test20 extends Test10 {
    int a = 20;

    @Override
    void abc() {
        System.out.println("Test20");
    }
}

class Test30 extends Test20 {
    int a = 30;

    @Override
    void abc() {
        super.abc();
        System.out.println("Test30");
    }
}