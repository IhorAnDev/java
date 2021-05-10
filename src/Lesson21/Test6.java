package Lesson21;

public class Test6 {
    int abc() {
        return 5;
    }

    int abc2(int i) {
        if (i > 10) {
            return 5;
        } else {
            return 10;
        }
    }

    public static void main(String[] args) {
        int a = new Test6().abc();
        System.out.println(a);
    }
}
