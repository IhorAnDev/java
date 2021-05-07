package Lessons19;

public class Test7 {
    public static void main(String[] args) {
        int[] array = {0, 1, 2, 3, 4, 5};
        for (int a : array) {
            array[a] = 3;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
