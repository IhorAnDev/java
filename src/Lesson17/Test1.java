package Lesson17;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Good Day!!!");
        StringBuilder sb3 = new StringBuilder(50);
        StringBuilder sb4 = new StringBuilder(sb2);

//        System.out.println(sb4.length());
//        System.out.println(sb2.charAt(4));
//        System.out.println(sb2.indexOf(" ", 3));
//        String s = sb2.substring(5);
//        System.out.println(s);
//        String s2 = sb2.substring(5, 8);
//        System.out.println(s2);
//
//        System.out.println(sb2.subSequence(5,8));
//
//        sb2.append(22);
//        System.out.println(sb2);

        System.out.println(sb2.insert(sb2.length(), "fet"));

        StringBuilder sb10 = new StringBuilder("Hello World");
//        sb10.delete(3,6);
//        System.out.println(sb10);
        sb10.deleteCharAt(6);
        System.out.println(sb10);
        sb10.reverse();
        System.out.println(sb10);

        StringBuilder sb12 = new StringBuilder("Vsem privet");
        sb12.replace(0, 4, "Petru");
        System.out.println(sb12);
        System.out.println(sb12.capacity());

        StringBuilder sb13 = new StringBuilder("Hello friend!");
        String s = null;

        s = sb13.append("How are you?").substring(sb13.indexOf("f"), sb13.indexOf("!"));
        System.out.println(s);
    }
}
