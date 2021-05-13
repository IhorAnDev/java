package Lesson24;

public class Test4 {
    Jumpabe j1 = new Human();
    Jumpabe j2 = new Animal();
}

class Human implements Jumpabe {
    @Override
    public void jump() {
        System.out.println("Human jump");
    }
}

class Animal implements Jumpabe {
    @Override
    public void jump() {
        System.out.println("Animal jump");
    }
}

interface Jumpabe {
    void jump();
}

interface A2 {void abc();}
interface B2 extends A2,Jumpabe{void def();}