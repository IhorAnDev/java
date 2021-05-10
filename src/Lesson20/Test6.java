package Lesson20;

import java.util.ArrayList;
import java.util.*;

public class Test6 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");

        ArrayList<StringBuilder> s1 = new ArrayList<>();
        s1.add(sb1);
        s1.add(sb2);
        s1.add(sb3);

//        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) s1.clone();
//        s1.get(0).append("!!!");
//        s1.set(0,new StringBuilder("new"));
//        System.out.println(list2.get(0));
//        Object[] array1 = s1.toArray();

//        StringBuilder[] array2 = s1.toArray(new StringBuilder[3]);
//        for (StringBuilder sb : array2
//        ) {
//            System.out.println(sb);
//
//        }
        StringBuilder[] array = {sb2, sb3, sb3,sb3};
        List<StringBuilder> list8 = Arrays.asList(array);
        System.out.println(list8);
    }
}
