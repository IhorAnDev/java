package Lesson19;

public class Test3 {

    public static void main(String[] args) {
        int[] array = {0, 6, 4, 1};
        for (int a : array) {
            System.out.print(a);
            if (a == 6) {
                break;
            }
        }
    }
}
