package Lesson20;

import java.util.ArrayList;
import java.util.Iterator;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        String s5 = "E";

        ArrayList<String> list1 = new ArrayList<>();
        list1.add(s1);
        list1.add(s4);
        list1.add(s2);
        list1.add(s5);
        list1.add(s3);

        Iterator<String> it = list1.iterator();

//        System.out.println(list1);
//        Collections.sort(list1);
//        System.out.println(list1);
    }
}
