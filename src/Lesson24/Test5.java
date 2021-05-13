package Lesson24;

import javax.imageio.stream.ImageInputStream;

public class Test5 {
}

interface I1 {
    default void abc() {
        System.out.println("eto metod abc");
    }

    static void def() {
        System.out.println("static method I1");
    }
}

interface I2 {
    static void def() {
        System.out.println("static method I2");
    }
}
abstract class O{

}

class R extends O implements I1 {
    I1 method1() {
        return new R();
    }

    public static void main(String[] args) {

    }

}
/*
class Z2 implements I1 {
    @Override
    public void abc() {
        System.out.println("Eto method ABC");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.def();
        z.ghi();
        z.abc();
    }
}*/
