package Lesson13;

public class Employee {

    public static void main(String[] args) {

        switch ("ponedelnik") {

            case "ponedelnik":

            case "vtornik":

            case "sreda":

            case "chetverg":

            case "pyatnica":
                System.out.println("Rabota do 18");
                break;
            case "subbota":
                System.out.println("Rabota do 14");
                break;
            case "voskresenye":
                System.out.println("Vikhodnoy");
                break;
            default:
                System.out.println("Chto to poslo ne tak");
        }
    }
}
