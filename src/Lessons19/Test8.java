package Lessons19;

public class Test8 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int b : array) {
            array[b] = 10;
        }
        for (int a : array) {
            System.out.print(a + " ");
        }
    }
}
