package Lesson9;

public class Car {
    public static int ab = 10;
    String color;
    String engine;
    public static int count;

    public Car(String color, String engine) {
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void shawColor() {
        System.out.println("Cvet mashini " + color);
        changeColor("Red");
    }

    public void changeColor(String color) {

        this.color = color;
        System.out.println(color);
    }

    public static void main(String[] args) {

        Car c = new Car("Blue", "V6");
        System.out.println(c.color);
        c.changeColor("Red");
        System.out.println(c.color);
    }

}
