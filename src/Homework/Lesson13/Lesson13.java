package Homework.Lesson13;

public class Lesson13 {

}

class Month {

    public static void dayQuantity(int n) {
        switch (n) {
            case 2:
                System.out.println("Kolichestvo dney 28");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Kolichestvo dney 30");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Kolichestvo dney 31");
                break;
            default:
                System.out.println("Ne suchestvuet");
        }
    }

    public static void main(String[] args) {

        Month.dayQuantity(0);
        dayQuantity(2);
        Month.dayQuantity(4);
        dayQuantity(6);
        Month.dayQuantity(-5);

    }
}