package Lesson4;

public class Car {
    Car(String tsvet, String motor) {

        color = tsvet;
        engine = motor;

    }

    String color;
    String engine;
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("Red", "V8");
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}