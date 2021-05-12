package Lesson24;

public class Test2 {
}

abstract class Figura {
    int storoni = 0;

    abstract void perimetr();

    abstract void ploshad();

    void showInfo() {
        System.out.println("Eto figura");
    }
}

class Kvadrat extends Figura {
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

    @Override
    void perimetr() {

    }

    @Override
    void ploshad() {

    }
}

class Okrujnost extends Figura {

    @Override
    void perimetr() {

    }

    @Override
    void ploshad() {

    }
}
