package Lesson20;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1, "hello");
        for (String s : list) {
            System.out.print(s + " ");
        }

        System.out.println();
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Ivanov");
        list2.add("Petrov");
        list.addAll(list2);

        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        list2.set(1, "Sidorov");
        for (String s : list) {
            System.out.print(s + " ");
        }
        list.clear();
        System.out.println();
        System.out.println();
        for (String s : list) {
            System.out.print(s + " ");
        }

    }
}
