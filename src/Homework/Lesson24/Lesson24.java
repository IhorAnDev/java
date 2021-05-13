package Homework.Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Karl");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();
        Speakable s1 = new Pingvin("Kovalski");
        s1.speak();
        Animal a = new Lev("Leal");
        System.out.println(a.name);
        a.eat();
        a.sleep();
        Mammal mam = new Lev("Leva2");
        System.out.println(mam.name);
        mam.eat();
        mam.sleep();
        mam.run();
        mam.speak();
    }
}

abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void eat();

    abstract void sleep();
}

abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        this.name = name;
    }

    public void sleep() {
        System.out.println("Vsegda nabluday kak spat riby");
    }

    abstract void swim();
}

abstract class Bird extends Animal implements Speakable {
    Bird(String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    public void speak() {
        System.out.println(name + " sing");
    }
}

abstract class Mammal extends Animal implements Speakable {
    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

interface Speakable {
    default void speak() {
        System.out.println(" Somebody speak");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name) {
        super(name);
        this.name = name;
    }

    public void swim() {
        System.out.println("Mechenocec plavaet");
    }

    @Override
    void eat() {
        System.out.println("Mechenosec est ");
    }
}

class Pingvin extends Bird {
    Pingvin(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("pingvin est ");
    }

    @Override
    void sleep() {
        System.out.println("Pingvin spet");
    }

    @Override
    void fly() {
        System.out.println("Pingvini ne letaut");
    }

    @Override
    public void speak() {
        System.out.println("Pingviny ne poyut");
    }
}

class Lev extends Mammal {
    Lev(String name) {
        super(name);
        this.name = name;
    }

    @Override
    void eat() {
        System.out.println("Lev kushaet");
    }

    @Override
    void sleep() {
        System.out.println("Lev spit");
    }

    @Override
    void run() {
        System.out.println("Lev bezit");
    }
}