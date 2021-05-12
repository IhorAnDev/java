package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Figura f1 = new Kvadrat();
        System.out.println(f1.kolichestvostoroni);
    }
}

abstract class Figura {
    int kolichestvostoroni = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura {

    int kolichestvostoroni = 4;
    int storona1 = 10;

    @Override
    void perimetr() {
        System.out.println("Perimetr kvadrata = " + storona1 * 4);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad kvadrata = " + storona1 * storona1);
    }
}

class Pramougolnik extends Figura {

    int storoni = 4;
    int storona1 = 8;
    int storona2 = 5;

    @Override
    void perimetr() {
        System.out.println("Perimetr pramougolnika = " + 2 * (storona1 + storona2));
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad pramougolnika = " + storona1 * storona2);
    }
}

class Okrujnost extends Figura {
    int storoni = 0;
    int radius = 3;

    @Override
    void perimetr() {
        System.out.println("Perimetr okruzhosti = " + 2 * 3.14 * radius);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad okruzhosti = " + 3.14 * radius * radius);
    }
}

abstract class Chetirexuogolnik extends Figura {
    void def() {
        System.out.println("Eto ceturexugolnik");
    }
}