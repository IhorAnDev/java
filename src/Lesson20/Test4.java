package Lesson20;

import java.util.ArrayList;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("privet"));
        list.add(new StringBuilder("poka"));
        list.add(new StringBuilder("Hello"));
        list.add(new StringBuilder("ok"));

        System.out.println(list.toString());
    }
}
