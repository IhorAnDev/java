package Lesson27;

public class Test2 {
    void abc() throws NullPointerException {
        String s = null;
        System.out.println(s.length());
    }

    public static void main(String[] args) throws NullPointerException {
        int array[] = {1, 4, 0};
        try {
            System.out.println(array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Iskluchenie poymano");
        }
        System.out.println("hello");
    }
}
