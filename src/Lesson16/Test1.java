package Lesson16;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");

        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(1);
        System.out.println(c1);

        int i1 = s1.indexOf("fga");
        System.out.println(i1);

        int i2 = s1.indexOf('t');
        System.out.println(i2);

        int i3 = s1.indexOf("a", 4);
        System.out.println(i3);

        boolean b1 = s1.startsWith("bc",8);
        System.out.println(b1);

        boolean b2 = s1.endsWith("bc");
        System.out.println(b2);


    }
}
