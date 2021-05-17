package Homework.Lesson25;

public class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Karl_1");
        Animal a2 = new Pingvin("Kovalski_1");
        Animal a3 = new Lev("Leva_1");
        Fish f1 = new Mechenosec("Karl_2");
        Bird b1 = new Pingvin("Kovalski_2");
        Mammal m1 = new Lev("Leva_2");
        Mechenosec mech1 = new Mechenosec("Karl_3");
        Pingvin p1 = new Pingvin("Kovalski_3");
        Lev l1 = new Lev("Leva_3");
        Speakable s1 = new Pingvin("Kovalsky_4");
        Speakable s2 = new Lev("Leva_4");
        Animal[] array1 = {a1, a2, a3, f1, b1, m1, mech1, p1, l1};
        Speakable[] array2 = {s1, s2, b1, m1, p1, l1};
        for (Animal a : array1
        ) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("---------------------------------");
        }
        for (Speakable s : array2
        ) {
            if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("---------------------");
        }
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