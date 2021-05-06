package Lesson16;

public class Test11 {

    public static void main(String[] args) {
//        String s1 = "privet";
//        System.out.println(s1.isBlank());
//
//        String s2 = "  ";
//        System.out.println(s2.isBlank());

        String s4 = "  dret     ";
        System.out.println(s4.trim());
        System.out.println(s4.strip());
        String s5 = "poka ";
        String s6 = s5.strip();
        System.out.println(s5 == s6);

    }
}
