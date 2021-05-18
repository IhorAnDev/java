package Lesson27;

public class Test5 {
    static void abc() {
        System.out.println("RAbotaet method ABC ");
        abc();
    }

    public static void main(String[] args) {
        try {
            abc();
        } catch (StackOverflowError e) {
            System.out.println("Error poyman");
        }

    }
}
