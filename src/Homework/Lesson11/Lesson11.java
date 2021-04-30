package Homework.Lesson11;

public class Lesson11 {
}

class Car {

    String color;
    String engine;
    int doorCount;

    public Car(String color, String engine, int doorCount) {
        this.color = color;
        this.engine = engine;
        this.doorCount = doorCount;
    }
}

class CarTest {

    void changeDoorCount(Car c, int doorCount) {
        c.doorCount = doorCount;
    }

    void changeColor(Car c1, Car c2) {
        String color = c1.color;
        c1.color = c2.color;
        c2.color = color;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car1 = new Car("Blue ", "V6", 3);
        Car car2 = new Car("Red ", "V8", 5);
        ct.changeDoorCount(car1, 7);
        ct.changeColor(car1, car2);
        System.out.println("Pervaya mashina, cvet: " + car1.color + "Motor " + car1.engine
                + " Dveri " + car1.doorCount);
        System.out.println("Vtoraya mashina, cvet: " + car2.color + "Motor " + car2.engine
                + " Dveri " + car2.doorCount);
    }

}